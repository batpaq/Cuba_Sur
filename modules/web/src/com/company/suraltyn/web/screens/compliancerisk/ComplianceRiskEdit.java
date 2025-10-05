package com.company.suraltyn.web.screens.compliancerisk;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.company.suraltyn.entity.ComplianceRisk;

import javax.inject.Inject;

@UiController("suraltyn$ComplianceRisk.edit")
@UiDescriptor("compliance-risk-edit.xml")
@EditedEntityContainer("complianceRiskDc")
@LoadDataBeforeShow
public class ComplianceRiskEdit extends StandardEditor<ComplianceRisk> {

    @Inject
    private UserSessionSource userSessionSource;

    @Subscribe
    protected void onBeforeShow(BeforeShowEvent event) {
        ComplianceRisk entity = getEditedEntity();
        if (entity.getInitiator() == null) {
            entity.setInitiator(userSessionSource.getUserSession().getUser().getLogin());
        }
    }
}