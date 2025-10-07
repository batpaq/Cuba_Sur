package com.company.suraltyn.web.screens.incidents;

import com.company.suraltyn.entity.Incidents;
import com.haulmont.cuba.core.app.FileStorageService;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.FileUploadField;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.security.global.UserSession;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@UiController("suraltyn$Incidents.edit")
@UiDescriptor("incidents-edit.xml")
@EditedEntityContainer("incidentsDc")
@LoadDataBeforeShow
public class IncidentsEdit extends StandardEditor<Incidents> {

    private static final Logger log = LoggerFactory.getLogger(IncidentsEdit.class);

    @Inject
    private DataManager dataManager;
    @Inject
    private Notifications notifications;
    @Inject
    private FileStorageService fileStorageService;
    @Inject
    private FileUploadField fileUploadField;
    @Inject
    private DataGrid<FileDescriptor> filesDataGrid;
    @Inject
    private CollectionPropertyContainer<FileDescriptor> filesDc;
    @Inject
    private UserSession userSession;

    @Subscribe
    public void onInit(InitEvent event) {
        fileUploadField.setUploadButtonCaption("Выбрать файл");
        fileUploadField.setClearButtonCaption("Очистить");
    }

    @Subscribe("fileUploadField")
    public void onFileUploadSucceeded(FileUploadField.FileUploadSucceedEvent event) {
        try {
            FileDescriptor fileDescriptor = fileUploadField.getFileDescriptor();

            if (fileDescriptor == null) {
                notifications.create().withCaption("Файл не найден").show();
                return;
            }

            Long fileSize = fileDescriptor.getSize();
            int maxFileSizeBytes = 10 * 1024 * 1024; // 10 MB

            if (fileSize != null && fileSize == 0) {
                notifications.create().withCaption("Файл пустой. Загрузка отменена").show();
                fileUploadField.clear();
                return;
            }

            if (fileSize != null && fileSize > maxFileSizeBytes) {
                notifications.create()
                        .withCaption("Файл превышает допустимый размер: " + formatFileSize(maxFileSizeBytes))
                        .show();
                fileUploadField.clear();
                return;
            }

            byte[] content = IOUtils.toByteArray(Objects.requireNonNull(fileUploadField.getFileContent()));

            fileStorageService.saveFile(fileDescriptor, content);
            fileDescriptor = dataManager.commit(fileDescriptor);

            attachFileToIncident(fileDescriptor);

            filesDc.getMutableItems().add(fileDescriptor);

            log.info("Файл '{}' загружен: {} байт", fileDescriptor.getName(), fileDescriptor.getSize());

            notifications.create()
                    .withCaption(String.format("Файл '%s' (%s) успешно загружен",
                            fileDescriptor.getName(), formatFileSize(fileDescriptor.getSize())))
                    .show();

        } catch (Exception e) {
            log.error("Ошибка загрузки файла", e);
            notifications.create().withCaption("Ошибка при загрузке файла").show();
        } finally {
            fileUploadField.clear();
        }
    }

    @Subscribe("removeFileBtn")
    public void onRemoveFileBtnClick(Button.ClickEvent event) {
        Set<FileDescriptor> selectedFiles = filesDataGrid.getSelected();

        if (selectedFiles.isEmpty()) {
            notifications.create().withCaption("Выберите файл(ы) для удаления").show();
            return;
        }

        for (FileDescriptor fileDescriptor : selectedFiles) {
            try {
                fileStorageService.removeFile(fileDescriptor);

                Incidents incident = getEditedEntity();
                if (incident.getFiles() != null) {
                    incident.getFiles().remove(fileDescriptor);
                }

                filesDc.getMutableItems().remove(fileDescriptor);

                log.info("Файл '{}' успешно удалён", fileDescriptor.getName());
            } catch (Exception e) {
                log.error("Ошибка при удалении файла {}", fileDescriptor.getName(), e);
                notifications.create()
                        .withCaption("Ошибка при удалении файла: " + fileDescriptor.getName())
                        .show();
            }
        }
        notifications.create().withCaption("Выбранные файлы удалены").show();
    }

    private void attachFileToIncident(FileDescriptor fileDescriptor) {
        Incidents incident = getEditedEntity();
        if (incident.getFiles() == null) {
            incident.setFiles(new HashSet<>());
        }
        incident.getFiles().add(fileDescriptor);
    }

    private String formatFileSize(long size) {
        if (size >= 1024 * 1024) return (size / (1024 * 1024)) + " MB";
        if (size >= 1024) return (size / 1024) + " KB";
        return size + " байт";
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        if (getEditedEntity().getInitiator() == null) {
            getEditedEntity().setInitiator(userSession.getCurrentOrSubstitutedUser().getLogin());
        }
    }
}