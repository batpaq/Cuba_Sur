package com.company.suraltyn.web.screens.activity;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Activity;

@UiController("suraltyn$Activity.browse")
@UiDescriptor("activity-browse.xml")
@LookupComponent("activitiesTable")
@LoadDataBeforeShow
public class ActivityBrowse extends StandardLookup<Activity> {
}