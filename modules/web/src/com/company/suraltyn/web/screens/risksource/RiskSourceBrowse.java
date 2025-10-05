package com.company.suraltyn.web.screens.risksource;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.RiskSource;

@UiController("RiskSource.browse")
@UiDescriptor("risk-source-browse.xml")
@LookupComponent("riskSourcesTable")
@LoadDataBeforeShow
public class RiskSourceBrowse extends StandardLookup<RiskSource> {
}