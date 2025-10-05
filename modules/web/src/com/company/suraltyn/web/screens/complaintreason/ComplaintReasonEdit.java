package com.company.suraltyn.web.screens.complaintreason;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ComplaintReason;

@UiController("suraltyn$ComplaintReason.edit")
@UiDescriptor("complaint-reason-edit.xml")
@EditedEntityContainer("complaintReasonDc")
@LoadDataBeforeShow
public class ComplaintReasonEdit extends StandardEditor<ComplaintReason> {
}