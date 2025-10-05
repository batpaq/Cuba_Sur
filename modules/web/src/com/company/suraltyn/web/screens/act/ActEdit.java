package com.company.suraltyn.web.screens.act;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Act;

@UiController("Act.edit")
@UiDescriptor("act-edit.xml")
@EditedEntityContainer("actDc")
@LoadDataBeforeShow
public class ActEdit extends StandardEditor<Act> {
}