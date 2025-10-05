package com.company.suraltyn.web.screens.act;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Act;

@UiController("Act.browse")
@UiDescriptor("act-browse.xml")
@LookupComponent("actsTable")
@LoadDataBeforeShow
public class ActBrowse extends StandardLookup<Act> {
}