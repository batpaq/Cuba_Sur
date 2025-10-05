package com.company.suraltyn.web.screens.training;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Training;
import com.haulmont.cuba.security.global.UserSession;

import javax.inject.Inject;

@UiController("Training.edit")
@UiDescriptor("training-edit.xml")
@EditedEntityContainer("trainingDc")
@LoadDataBeforeShow
public class TrainingEdit extends StandardEditor<Training> {

    @Inject
    private UserSession userSession;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        if (getEditedEntity().getInitiator() == null) {
            getEditedEntity().setInitiator(userSession.getCurrentOrSubstitutedUser().getLogin());
        }
    }
}