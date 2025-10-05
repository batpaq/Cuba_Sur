package com.company.suraltyn.web.screens.internalcontrolmonitoring;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.InternalControlMonitoring;

@UiController("InternalControlMonitoring.edit")
@UiDescriptor("internal-control-monitoring-edit.xml")
@EditedEntityContainer("internalControlMonitoringDc")
@LoadDataBeforeShow
public class InternalControlMonitoringEdit extends StandardEditor<InternalControlMonitoring> {
}