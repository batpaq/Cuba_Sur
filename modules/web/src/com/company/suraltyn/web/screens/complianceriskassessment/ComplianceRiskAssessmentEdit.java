package com.company.suraltyn.web.screens.complianceriskassessment;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ComplianceRiskAssessment;

@UiController("suraltyn$ComplianceRiskAssessment.edit")
@UiDescriptor("compliance-risk-assessment-edit.xml")
@EditedEntityContainer("complianceRiskAssessmentDc")
@LoadDataBeforeShow
public class ComplianceRiskAssessmentEdit extends StandardEditor<ComplianceRiskAssessment> {
}