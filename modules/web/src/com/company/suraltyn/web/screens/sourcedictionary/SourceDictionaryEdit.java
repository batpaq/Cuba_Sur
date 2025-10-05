package com.company.suraltyn.web.screens.sourcedictionary;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.SourceDictionary;

@UiController("suraltyn$SourceDictionary.edit")
@UiDescriptor("source-dictionary-edit.xml")
@EditedEntityContainer("sourceDictionaryDc")
@LoadDataBeforeShow
public class SourceDictionaryEdit extends StandardEditor<SourceDictionary> {
}