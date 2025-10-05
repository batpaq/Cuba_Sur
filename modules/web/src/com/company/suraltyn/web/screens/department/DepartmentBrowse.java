package com.company.suraltyn.web.screens.department;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Department;

@UiController("suraltyn$Department.browse")
@UiDescriptor("department-browse.xml")
@LookupComponent("departmentsTable")
@LoadDataBeforeShow
public class DepartmentBrowse extends StandardLookup<Department> {
}