package com.company.suraltyn.web.screens.clientph;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ClientPh;

@UiController("suraltyn$ClientPh.browse")
@UiDescriptor("client-ph-browse.xml")
@LookupComponent("clientPhsTable")
@LoadDataBeforeShow
public class ClientPhBrowse extends StandardLookup<ClientPh> {
}