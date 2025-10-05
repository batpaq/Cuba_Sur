package com.company.suraltyn.web.screens.complianceriskassessment;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ComplianceRiskAssessment;

@UiController("suraltyn$ComplianceRiskAssessment.browse")
@UiDescriptor("compliance-risk-assessment-browse.xml")
@LookupComponent("complianceRiskAssessmentsTable")
@LoadDataBeforeShow
public class ComplianceRiskAssessmentBrowse extends StandardLookup<ComplianceRiskAssessment> {
}