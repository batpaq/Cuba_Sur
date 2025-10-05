package com.company.suraltyn.web.screens.vnd;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Vnd;

@UiController("Vnd.edit")
@UiDescriptor("vnd-edit.xml")
@EditedEntityContainer("vndDc")
@LoadDataBeforeShow
public class VndEdit extends StandardEditor<Vnd> {
}