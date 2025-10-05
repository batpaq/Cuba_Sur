package com.company.suraltyn.web.screens.planevent;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.PlanEvent;

@UiController("suraltyn$PlanEvent.edit")
@UiDescriptor("plan-event-edit.xml")
@EditedEntityContainer("planEventDc")
@LoadDataBeforeShow
public class PlanEventEdit extends StandardEditor<PlanEvent> {
}