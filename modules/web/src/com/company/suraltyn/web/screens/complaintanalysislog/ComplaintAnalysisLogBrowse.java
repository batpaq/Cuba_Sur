package com.company.suraltyn.web.screens.complaintanalysislog;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ComplaintAnalysisLog;

@UiController("ComplaintAnalysisLog.browse")
@UiDescriptor("complaint-analysis-log-browse.xml")
@LookupComponent("complaintAnalysisLogsTable")
@LoadDataBeforeShow
public class ComplaintAnalysisLogBrowse extends StandardLookup<ComplaintAnalysisLog> {
}