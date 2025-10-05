package com.company.suraltyn.web.screens.compliancelawact;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ComplianceLawAct;

@UiController("suraltyn$ComplianceLawAct.browse")
@UiDescriptor("compliance-law-act-browse.xml")
@LookupComponent("complianceLawActsTable")
@LoadDataBeforeShow
public class ComplianceLawActBrowse extends StandardLookup<ComplianceLawAct> {
}