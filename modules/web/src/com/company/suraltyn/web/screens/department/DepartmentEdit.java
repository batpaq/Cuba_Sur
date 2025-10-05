package com.company.suraltyn.web.screens.department;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.Department;

@UiController("suraltyn$Department.edit")
@UiDescriptor("department-edit.xml")
@EditedEntityContainer("departmentDc")
@LoadDataBeforeShow
public class DepartmentEdit extends StandardEditor<Department> {
}