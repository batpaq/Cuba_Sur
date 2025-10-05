package com.company.suraltyn.web.screens.compliancerisk;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ComplianceRisk;

@UiController("suraltyn$ComplianceRisk.browse")
@UiDescriptor("compliance-risk-browse.xml")
@LookupComponent("complianceRisksTable")
@LoadDataBeforeShow
public class ComplianceRiskBrowse extends StandardLookup<ComplianceRisk> {
}