package com.company.suraltyn.web.screens.responsetype;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ResponseType;

@UiController("suraltyn$ResponseType.edit")
@UiDescriptor("response-type-edit.xml")
@EditedEntityContainer("responseTypeDc")
@LoadDataBeforeShow
public class ResponseTypeEdit extends StandardEditor<ResponseType> {
}