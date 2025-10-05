package com.company.suraltyn.web.screens.period;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Period;

@UiController("Period.browse")
@UiDescriptor("period-browse.xml")
@LookupComponent("periodsTable")
@LoadDataBeforeShow
public class PeriodBrowse extends StandardLookup<Period> {
}