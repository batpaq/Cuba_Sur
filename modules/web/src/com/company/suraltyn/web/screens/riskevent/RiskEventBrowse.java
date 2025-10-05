package com.company.suraltyn.web.screens.riskevent;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.RiskEvent;

@UiController("RiskEvent.browse")
@UiDescriptor("risk-event-browse.xml")
@LookupComponent("riskEventsTable")
@LoadDataBeforeShow
public class RiskEventBrowse extends StandardLookup<RiskEvent> {
}