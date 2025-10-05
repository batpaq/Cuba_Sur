package com.company.suraltyn.web.screens.complaintwordsetting;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ComplaintWordSetting;

@UiController("ComplaintWordSetting.edit")
@UiDescriptor("complaint-word-setting-edit.xml")
@EditedEntityContainer("complaintWordSettingDc")
@LoadDataBeforeShow
public class ComplaintWordSettingEdit extends StandardEditor<ComplaintWordSetting> {
}