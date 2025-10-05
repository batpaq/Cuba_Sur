package com.company.suraltyn.web.screens.activity;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Activity;

@UiController("suraltyn$Activity.edit")
@UiDescriptor("activity-edit.xml")
@EditedEntityContainer("activityDc")
@LoadDataBeforeShow
public class ActivityEdit extends StandardEditor<Activity> {
}