package com.company.suraltyn.web.screens.fileentity;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.FileEntity;

@UiController("FileEntity.browse")
@UiDescriptor("file-entity-browse.xml")
@LookupComponent("fileEntitiesTable")
@LoadDataBeforeShow
public class FileEntityBrowse extends StandardLookup<FileEntity> {
}