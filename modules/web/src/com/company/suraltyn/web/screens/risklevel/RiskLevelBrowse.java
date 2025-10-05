package com.company.suraltyn.web.screens.risklevel;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.RiskLevel;

@UiController("RiskLevel.browse")
@UiDescriptor("risk-level-browse.xml")
@LookupComponent("riskLevelsTable")
@LoadDataBeforeShow
public class RiskLevelBrowse extends StandardLookup<RiskLevel> {
}