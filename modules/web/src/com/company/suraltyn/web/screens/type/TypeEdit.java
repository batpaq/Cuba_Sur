package com.company.suraltyn.web.screens.type;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Type;

@UiController("Type.edit")
@UiDescriptor("type-edit.xml")
@EditedEntityContainer("typeDc")
@LoadDataBeforeShow
public class TypeEdit extends StandardEditor<Type> {
}