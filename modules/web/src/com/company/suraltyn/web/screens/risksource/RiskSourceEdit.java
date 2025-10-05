package com.company.suraltyn.web.screens.risksource;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.RiskSource;

@UiController("RiskSource.edit")
@UiDescriptor("risk-source-edit.xml")
@EditedEntityContainer("riskSourceDc")
@LoadDataBeforeShow
public class RiskSourceEdit extends StandardEditor<RiskSource> {
}