package com.company.suraltyn.web.screens.sourcedictionary;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.SourceDictionary;

@UiController("suraltyn$SourceDictionary.browse")
@UiDescriptor("source-dictionary-browse.xml")
@LookupComponent("sourceDictionariesTable")
@LoadDataBeforeShow
public class SourceDictionaryBrowse extends StandardLookup<SourceDictionary> {
}