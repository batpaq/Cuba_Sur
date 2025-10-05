package com.company.suraltyn.web.screens.selfassessmentsvk;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.SelfAssessmentSVK;

@UiController("SelfAssessmentSVK.edit")
@UiDescriptor("self-assessment-svk-edit.xml")
@EditedEntityContainer("selfAssessmentSVKDc")
@LoadDataBeforeShow
public class SelfAssessmentSVKEdit extends StandardEditor<SelfAssessmentSVK> {
}