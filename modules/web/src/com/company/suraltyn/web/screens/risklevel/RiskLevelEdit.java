package com.company.suraltyn.web.screens.risklevel;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.RiskLevel;

@UiController("RiskLevel.edit")
@UiDescriptor("risk-level-edit.xml")
@EditedEntityContainer("riskLevelDc")
@LoadDataBeforeShow
public class RiskLevelEdit extends StandardEditor<RiskLevel> {
}