package com.company.suraltyn.web.screens.responsetype;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ResponseType;

@UiController("suraltyn$ResponseType.browse")
@UiDescriptor("response-type-browse.xml")
@LookupComponent("responseTypesTable")
@LoadDataBeforeShow
public class ResponseTypeBrowse extends StandardLookup<ResponseType> {
}