package com.company.suraltyn.web.screens.conflictofinterest;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ConflictOfInterest;

@UiController("ConflictOfInterest.browse")
@UiDescriptor("conflict-of-interest-browse.xml")
@LookupComponent("conflictOfInterestsTable")
@LoadDataBeforeShow
public class ConflictOfInterestBrowse extends StandardLookup<ConflictOfInterest> {
}