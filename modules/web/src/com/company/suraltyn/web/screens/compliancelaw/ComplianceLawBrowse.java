package com.company.suraltyn.web.screens.compliancelaw;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ComplianceLaw;

@UiController("ComplianceLaw.browse")
@UiDescriptor("compliance-law-browse.xml")
@LookupComponent("complianceLawsTable")
@LoadDataBeforeShow
public class ComplianceLawBrowse extends StandardLookup<ComplianceLaw> {
}