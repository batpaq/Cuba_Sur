package com.company.suraltyn.web.screens.compliancelawvnd;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ComplianceLawVnd;

@UiController("suraltyn$ComplianceLawVnd.edit")
@UiDescriptor("compliance-law-vnd-edit.xml")
@EditedEntityContainer("complianceLawVndDc")
@LoadDataBeforeShow
public class ComplianceLawVndEdit extends StandardEditor<ComplianceLawVnd> {
}