package com.company.suraltyn.web.screens.compliancepolicy;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.CompliancePolicy;
import com.haulmont.cuba.core.global.UserSessionSource;

import javax.inject.Inject;

@UiController("suraltyn$CompliancePolicy.edit")
@UiDescriptor("compliance-policy-edit.xml")
@EditedEntityContainer("compliancePolicyDc")
@LoadDataBeforeShow
public class CompliancePolicyEdit extends StandardEditor<CompliancePolicy> {

    @Inject
    private UserSessionSource userSessionSource;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        CompliancePolicy compliancePolicy = getEditedEntity();
        if (compliancePolicy.getInitiator() == null) {
            compliancePolicy.setInitiator(userSessionSource.getUserSession().getUser().getLogin());
        }
    }
}