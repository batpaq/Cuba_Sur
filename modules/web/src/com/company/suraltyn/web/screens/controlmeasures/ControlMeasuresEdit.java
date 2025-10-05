package com.company.suraltyn.web.screens.controlmeasures;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ControlMeasures;

@UiController("ControlMeasures.edit")
@UiDescriptor("control-measures-edit.xml")
@EditedEntityContainer("controlMeasuresDc")
@LoadDataBeforeShow
public class ControlMeasuresEdit extends StandardEditor<ControlMeasures> {
}