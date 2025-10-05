package com.company.suraltyn.web.screens.controlmeasureassessment;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ControlMeasureAssessment;

@UiController("suraltyn$ControlMeasureAssessment.browse")
@UiDescriptor("control-measure-assessment-browse.xml")
@LookupComponent("controlMeasureAssessmentsTable")
@LoadDataBeforeShow
public class ControlMeasureAssessmentBrowse extends StandardLookup<ControlMeasureAssessment> {
}