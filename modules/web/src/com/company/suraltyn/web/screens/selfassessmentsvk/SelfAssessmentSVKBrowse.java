package com.company.suraltyn.web.screens.selfassessmentsvk;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.SelfAssessmentSVK;

@UiController("SelfAssessmentSVK.browse")
@UiDescriptor("self-assessment-svk-browse.xml")
@LookupComponent("selfAssessmentSVKsTable")
@LoadDataBeforeShow
public class SelfAssessmentSVKBrowse extends StandardLookup<SelfAssessmentSVK> {
}