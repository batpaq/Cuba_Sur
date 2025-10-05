package com.company.suraltyn.web.screens.compliancelawvnd;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ComplianceLawVnd;

@UiController("suraltyn$ComplianceLawVnd.browse")
@UiDescriptor("compliance-law-vnd-browse.xml")
@LookupComponent("complianceLawVndsTable")
@LoadDataBeforeShow
public class ComplianceLawVndBrowse extends StandardLookup<ComplianceLawVnd> {
}