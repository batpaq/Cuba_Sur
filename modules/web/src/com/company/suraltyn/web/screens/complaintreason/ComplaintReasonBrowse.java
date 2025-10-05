package com.company.suraltyn.web.screens.complaintreason;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ComplaintReason;

@UiController("suraltyn$ComplaintReason.browse")
@UiDescriptor("complaint-reason-browse.xml")
@LookupComponent("complaintReasonsTable")
@LoadDataBeforeShow
public class ComplaintReasonBrowse extends StandardLookup<ComplaintReason> {
}