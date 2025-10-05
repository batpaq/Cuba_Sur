package com.company.suraltyn.web.screens.fileentity;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.FileEntity;

@UiController("FileEntity.edit")
@UiDescriptor("file-entity-edit.xml")
@EditedEntityContainer("fileEntityDc")
@LoadDataBeforeShow
public class FileEntityEdit extends StandardEditor<FileEntity> {
}