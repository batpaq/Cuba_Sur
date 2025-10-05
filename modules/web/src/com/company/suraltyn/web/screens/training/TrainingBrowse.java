package com.company.suraltyn.web.screens.training;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Training;

@UiController("Training.browse")
@UiDescriptor("training-browse.xml")
@LookupComponent("trainingsTable")
@LoadDataBeforeShow
public class TrainingBrowse extends StandardLookup<Training> {
}