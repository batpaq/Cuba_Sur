package com.company.suraltyn.web.screens.subject;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Subject;

@UiController("suraltyn$Subject.edit")
@UiDescriptor("subject-edit.xml")
@EditedEntityContainer("subjectDc")
@LoadDataBeforeShow
public class SubjectEdit extends StandardEditor<Subject> {
}