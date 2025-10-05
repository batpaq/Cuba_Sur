package com.company.suraltyn.web.screens.controlmeasureassessment;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ControlMeasureAssessment;

@UiController("suraltyn$ControlMeasureAssessment.edit")
@UiDescriptor("control-measure-assessment-edit.xml")
@EditedEntityContainer("controlMeasureAssessmentDc")
@LoadDataBeforeShow
public class ControlMeasureAssessmentEdit extends StandardEditor<ControlMeasureAssessment> {
}