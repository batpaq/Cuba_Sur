package com.company.suraltyn.web.screens.policyprocedureassessment;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.PolicyProcedureAssessment;

@UiController("PolicyProcedureAssessment.edit")
@UiDescriptor("policy-procedure-assessment-edit.xml")
@EditedEntityContainer("policyProcedureAssessmentDc")
@LoadDataBeforeShow
public class PolicyProcedureAssessmentEdit extends StandardEditor<PolicyProcedureAssessment> {
}