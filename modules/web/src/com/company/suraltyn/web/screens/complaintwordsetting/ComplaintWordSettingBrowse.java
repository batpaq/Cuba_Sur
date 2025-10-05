package com.company.suraltyn.web.screens.complaintwordsetting;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ComplaintWordSetting;

@UiController("ComplaintWordSetting.browse")
@UiDescriptor("complaint-word-setting-browse.xml")
@LookupComponent("complaintWordSettingsTable")
@LoadDataBeforeShow
public class ComplaintWordSettingBrowse extends StandardLookup<ComplaintWordSetting> {
}