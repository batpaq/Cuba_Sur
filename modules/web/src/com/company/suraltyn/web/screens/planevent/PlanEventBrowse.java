package com.company.suraltyn.web.screens.planevent;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.PlanEvent;

@UiController("suraltyn$PlanEvent.browse")
@UiDescriptor("plan-event-browse.xml")
@LookupComponent("planEventsTable")
@LoadDataBeforeShow
public class PlanEventBrowse extends StandardLookup<PlanEvent> {
}