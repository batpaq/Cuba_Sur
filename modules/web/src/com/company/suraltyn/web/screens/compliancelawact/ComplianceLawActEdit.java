package com.company.suraltyn.web.screens.compliancelawact;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ComplianceLawAct;

@UiController("suraltyn$ComplianceLawAct.edit")
@UiDescriptor("compliance-law-act-edit.xml")
@EditedEntityContainer("complianceLawActDc")
@LoadDataBeforeShow
public class ComplianceLawActEdit extends StandardEditor<ComplianceLawAct> {
}