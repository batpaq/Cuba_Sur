package com.company.suraltyn.web.screens.subject;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Subject;

@UiController("suraltyn$Subject.browse")
@UiDescriptor("subject-browse.xml")
@LookupComponent("subjectsTable")
@LoadDataBeforeShow
public class SubjectBrowse extends StandardLookup<Subject> {
}