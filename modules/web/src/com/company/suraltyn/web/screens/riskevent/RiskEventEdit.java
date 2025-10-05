package com.company.suraltyn.web.screens.riskevent;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.RiskEvent;

@UiController("RiskEvent.edit")
@UiDescriptor("risk-event-edit.xml")
@EditedEntityContainer("riskEventDc")
@LoadDataBeforeShow
public class RiskEventEdit extends StandardEditor<RiskEvent> {
}