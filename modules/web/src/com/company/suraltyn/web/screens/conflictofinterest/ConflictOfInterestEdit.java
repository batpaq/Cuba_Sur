package com.company.suraltyn.web.screens.conflictofinterest;

import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ConflictOfInterest;

import javax.inject.Inject;

@UiController("ConflictOfInterest.edit")
@UiDescriptor("conflict-of-interest-edit.xml")
@EditedEntityContainer("conflictOfInterestDc")
@LoadDataBeforeShow
public class ConflictOfInterestEdit extends StandardEditor<ConflictOfInterest> {

    @Inject
    private UserSessionSource userSessionSource;

    @Subscribe
    protected void onBeforeShow(BeforeShowEvent event) {
        ConflictOfInterest entity = getEditedEntity();
        if (entity.getInitiator() == null) {
            entity.setInitiator(userSessionSource.getUserSession().getUser().getLogin());
        }
    }
}
