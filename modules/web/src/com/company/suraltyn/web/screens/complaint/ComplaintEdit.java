package com.company.suraltyn.web.screens.complaint;

import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Complaint;
import com.company.suraltyn.entity.ComplaintSign;
import com.company.suraltyn.entity.Status;
import com.company.suraltyn.service.ComplaintAnalysisService;

import javax.inject.Inject;
import java.util.Date;

@UiController("suraltyn$Complaint.edit")
@UiDescriptor("complaint-edit.xml")
@EditedEntityContainer("complaintDc")
@LoadDataBeforeShow
public class ComplaintEdit extends StandardEditor<Complaint> {

    @Inject
    private ComplaintAnalysisService analysisService;

    @Inject
    private Button toggleAnalysisButton;

    @Inject
    private CheckBox wordAnalysisField;

    @Inject
    private LookupField<ComplaintSign> complaintSignField;

    @Subscribe("toggleAnalysisButton")
    public void onToggleAnalysisButtonClick(Button.ClickEvent event) {
        Complaint complaint = getEditedEntity();

        analysisService.toggleWordAnalysis(complaint);

        if (Boolean.TRUE.equals(complaint.getWordAnalysisEnabled())) {
            analysisService.analyzeComplaint(complaint);
            getScreenData().getDataContext().commit();
        }

        updateToggleButton(complaint);
        updateHighlight(complaint);
        updateComplaintSignField(complaint);
    }

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        Complaint complaint = getEditedEntity();
        if (Boolean.TRUE.equals(complaint.getWordAnalysisEnabled())) {
            analysisService.analyzeComplaint(complaint);
        }
        updateHighlight(complaint);
        updateComplaintSignField(complaint);
    }

    @Subscribe
    public void onInitEntity(InitEntityEvent<Complaint> event) {
        Complaint complaint = event.getEntity();
        updateToggleButton(complaint);
        updateComplaintSignField(complaint);
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        Complaint complaint = getEditedEntity();

        if (complaint.getInitiator() == null) {
            complaint.setInitiator(getCurrentUserLogin());
        }
        if (complaint.getStatus() == null) {
            complaint.setStatus(Status.CREATED);
        }
        if (complaint.getRegistrationDate() == null) {
            complaint.setRegistrationDate(new Date());
        }

        updateToggleButton(complaint);
        updateHighlight(complaint);
        updateComplaintSignField(complaint);
    }

    private void updateToggleButton(Complaint complaint) {
        toggleAnalysisButton.setCaption(
                Boolean.TRUE.equals(complaint.getWordAnalysisEnabled()) ? "Анализ: Вкл" : "Анализ: Выкл"
        );
        wordAnalysisField.setValue(Boolean.TRUE.equals(complaint.getWordAnalysisEnabled()));
    }

    private void updateHighlight(Complaint complaint) {
        boolean analysisOn = Boolean.TRUE.equals(complaint.getWordAnalysisEnabled());
        ComplaintSign sign = analysisService.detectSign(complaint);
        boolean complaintYes = sign == ComplaintSign.YES;
        boolean riskEmpty = complaint.getRiskAssessment() == null;

        if (analysisOn && complaintYes && riskEmpty) {
            getWindow().setStyleName("highlight-complaint");
        } else {
            getWindow().removeStyleName("highlight-complaint");
        }
    }

    private void updateComplaintSignField(Complaint complaint) {
        complaintSignField.setEditable(!Boolean.TRUE.equals(complaint.getWordAnalysisEnabled()));
    }

    private String getCurrentUserLogin() {
        return com.haulmont.cuba.core.global.AppBeans.get(
                com.haulmont.cuba.core.global.UserSessionSource.class
        ).getUserSession().getUser().getLogin();
    }
}
