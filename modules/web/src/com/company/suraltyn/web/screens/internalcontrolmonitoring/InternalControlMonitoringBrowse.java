package com.company.suraltyn.web.screens.internalcontrolmonitoring;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.InternalControlMonitoring;

@UiController("InternalControlMonitoring.browse")
@UiDescriptor("internal-control-monitoring-browse.xml")
@LookupComponent("internalControlMonitoringsTable")
@LoadDataBeforeShow
public class InternalControlMonitoringBrowse extends StandardLookup<InternalControlMonitoring> {
}