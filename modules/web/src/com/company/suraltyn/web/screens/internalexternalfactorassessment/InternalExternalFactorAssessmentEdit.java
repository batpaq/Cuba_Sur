package com.company.suraltyn.web.screens.internalexternalfactorassessment;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.InternalExternalFactorAssessment;

@UiController("InternalExternalFactorAssessment.edit")
@UiDescriptor("internal-external-factor-assessment-edit.xml")
@EditedEntityContainer("internalExternalFactorAssessmentDc")
@LoadDataBeforeShow
public class InternalExternalFactorAssessmentEdit extends StandardEditor<InternalExternalFactorAssessment> {
}