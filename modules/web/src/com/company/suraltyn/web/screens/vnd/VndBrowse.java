package com.company.suraltyn.web.screens.vnd;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Vnd;

@UiController("Vnd.browse")
@UiDescriptor("vnd-browse.xml")
@LookupComponent("vndsTable")
@LoadDataBeforeShow
public class VndBrowse extends StandardLookup<Vnd> {
}