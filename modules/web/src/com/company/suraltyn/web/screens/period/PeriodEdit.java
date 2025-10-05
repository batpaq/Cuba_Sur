package com.company.suraltyn.web.screens.period;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Period;

@UiController("Period.edit")
@UiDescriptor("period-edit.xml")
@EditedEntityContainer("periodDc")
@LoadDataBeforeShow
public class PeriodEdit extends StandardEditor<Period> {
}