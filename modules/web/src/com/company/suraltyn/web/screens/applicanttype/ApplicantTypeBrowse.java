package com.company.suraltyn.web.screens.applicanttype;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ApplicantType;

@UiController("suraltyn$ApplicantType.browse")
@UiDescriptor("applicant-type-browse.xml")
@LookupComponent("applicantTypesTable")
@LoadDataBeforeShow
public class ApplicantTypeBrowse extends StandardLookup<ApplicantType> {
}