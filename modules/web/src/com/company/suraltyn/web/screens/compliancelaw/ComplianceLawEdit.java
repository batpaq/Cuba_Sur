package com.company.suraltyn.web.screens.compliancelaw;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ComplianceLaw;
import com.haulmont.cuba.core.global.UserSessionSource;

import javax.inject.Inject;

@UiController("ComplianceLaw.edit")
@UiDescriptor("compliance-law-edit.xml")
@EditedEntityContainer("complianceLawDc")
@LoadDataBeforeShow
public class ComplianceLawEdit extends StandardEditor<ComplianceLaw> {

    @Inject
    private UserSessionSource userSessionSource;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        ComplianceLaw complianceLaw = getEditedEntity();
        if (complianceLaw.getInitiator() == null) {
            complianceLaw.setInitiator(userSessionSource.getUserSession().getUser().getLogin());
        }
    }
}