package com.company.suraltyn.web.screens.type;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Type;

@UiController("Type.browse")
@UiDescriptor("type-browse.xml")
@LookupComponent("typesTable")
@LoadDataBeforeShow
public class TypeBrowse extends StandardLookup<Type> {
}