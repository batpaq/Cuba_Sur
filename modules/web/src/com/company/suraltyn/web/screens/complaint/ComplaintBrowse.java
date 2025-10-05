package com.company.suraltyn.web.screens.complaint;

import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Complaint;
import com.company.suraltyn.service.ComplaintAnalysisService;

import javax.inject.Inject;
import java.util.Set;

@UiController("suraltyn_Complaint.browse")
@UiDescriptor("complaint-browse.xml")
@LookupComponent("complaintsTable")
@LoadDataBeforeShow
public class ComplaintBrowse extends StandardLookup<Complaint> {

    @Inject
    private Table<Complaint> complaintsTable;

    @Inject
    private Button toggleAnalysisButton;

    @Inject
    private ComplaintAnalysisService analysisService;

    @Subscribe
    public void onInit(InitEvent event) {
        complaintsTable.addStyleProvider((complaint, property) -> {
            if (Boolean.TRUE.equals(complaint.getWordAnalysisEnabled())
                    && complaint.getComplaintReason() != null
                    && "Да".equalsIgnoreCase(complaint.getComplaintReason().getName().trim())
                    && complaint.getRiskAssessment() == null) {
                return "highlight-complaint"; // CSS класс для строки
            }
            return null;
        });

        complaintsTable.addSelectionListener(e -> {
            Set<Complaint> selected = complaintsTable.getSelected();
            if (selected.isEmpty()) {
                toggleAnalysisButton.setCaption("Анализ слов: Вкл");
            } else {
                Complaint first = selected.iterator().next();
                toggleAnalysisButton.setCaption(Boolean.TRUE.equals(first.getWordAnalysisEnabled())
                        ? "Анализ слов: Вкл"
                        : "Анализ слов: Выкл");
            }
        });
    }

    @Subscribe("toggleAnalysisButton")
    public void onToggleAnalysisButtonClick(Button.ClickEvent event) {
        Set<Complaint> selected = complaintsTable.getSelected();
        if (selected.isEmpty()) return;

        for (Complaint complaint : selected) {
            analysisService.toggleWordAnalysis(complaint);

            if (Boolean.TRUE.equals(complaint.getWordAnalysisEnabled())) {
                analysisService.analyzeComplaint(complaint);
            }
        }

        getScreenData().loadAll();

        Complaint first = selected.iterator().next();
        toggleAnalysisButton.setCaption(Boolean.TRUE.equals(first.getWordAnalysisEnabled())
                ? "Анализ слов: Вкл"
                : "Анализ слов: Выкл");
    }
}