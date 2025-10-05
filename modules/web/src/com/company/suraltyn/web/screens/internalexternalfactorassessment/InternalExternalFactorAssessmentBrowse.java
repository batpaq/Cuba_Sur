package com.company.suraltyn.web.screens.internalexternalfactorassessment;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.InternalExternalFactorAssessment;

@UiController("InternalExternalFactorAssessment.browse")
@UiDescriptor("internal-external-factor-assessment-browse.xml")
@LookupComponent("internalExternalFactorAssessmentsTable")
@LoadDataBeforeShow
public class InternalExternalFactorAssessmentBrowse extends StandardLookup<InternalExternalFactorAssessment> {
}