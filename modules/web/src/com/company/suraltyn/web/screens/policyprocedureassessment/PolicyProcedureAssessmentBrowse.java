package com.company.suraltyn.web.screens.policyprocedureassessment;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.PolicyProcedureAssessment;

@UiController("PolicyProcedureAssessment.browse")
@UiDescriptor("policy-procedure-assessment-browse.xml")
@LookupComponent("policyProcedureAssessmentsTable")
@LoadDataBeforeShow
public class PolicyProcedureAssessmentBrowse extends StandardLookup<PolicyProcedureAssessment> {
}