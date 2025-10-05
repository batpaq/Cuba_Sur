package com.company.suraltyn.web.screens.compliancepolicy;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.CompliancePolicy;

@UiController("suraltyn$CompliancePolicy.browse")
@UiDescriptor("compliance-policy-browse.xml")
@LookupComponent("compliancePoliciesTable")
@LoadDataBeforeShow
public class CompliancePolicyBrowse extends StandardLookup<CompliancePolicy> {
}