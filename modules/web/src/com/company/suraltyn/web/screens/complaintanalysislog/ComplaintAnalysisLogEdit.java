package com.company.suraltyn.web.screens.complaintanalysislog;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ComplaintAnalysisLog;

@UiController("ComplaintAnalysisLog.edit")
@UiDescriptor("complaint-analysis-log-edit.xml")
@EditedEntityContainer("complaintAnalysisLogDc")
@LoadDataBeforeShow
public class ComplaintAnalysisLogEdit extends StandardEditor<ComplaintAnalysisLog> {
}