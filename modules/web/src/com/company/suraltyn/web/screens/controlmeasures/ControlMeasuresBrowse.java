package com.company.suraltyn.web.screens.controlmeasures;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ControlMeasures;

@UiController("ControlMeasures.browse")
@UiDescriptor("control-measures-browse.xml")
@LookupComponent("controlMeasuresesTable")
@LoadDataBeforeShow
public class ControlMeasuresBrowse extends StandardLookup<ControlMeasures> {
}