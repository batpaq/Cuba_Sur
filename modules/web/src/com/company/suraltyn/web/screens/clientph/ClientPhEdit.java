package com.company.suraltyn.web.screens.clientph;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ClientPh;

@UiController("suraltyn$ClientPh.edit")
@UiDescriptor("client-ph-edit.xml")
@EditedEntityContainer("clientPhDc")
@LoadDataBeforeShow
public class ClientPhEdit extends StandardEditor<ClientPh> {
}