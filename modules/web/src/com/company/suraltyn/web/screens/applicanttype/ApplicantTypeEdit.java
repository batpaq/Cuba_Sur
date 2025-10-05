package com.company.suraltyn.web.screens.applicanttype;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ApplicantType;

@UiController("suraltyn$ApplicantType.edit")
@UiDescriptor("applicant-type-edit.xml")
@EditedEntityContainer("applicantTypeDc")
@LoadDataBeforeShow
public class ApplicantTypeEdit extends StandardEditor<ApplicantType> {
}