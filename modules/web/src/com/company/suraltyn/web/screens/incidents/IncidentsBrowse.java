package com.company.suraltyn.web.screens.incidents;

import com.company.suraltyn.entity.Incidents;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("Incidents.browse")
@UiDescriptor("incidents-browse.xml")
@LookupComponent("incidentsTable")
@LoadDataBeforeShow
public class IncidentsBrowse extends StandardLookup<Incidents> {

    @Inject
    private Table<Incidents> incidentsTable;

    @Inject
    private UiComponents uiComponents;

    @SuppressWarnings("unchecked")
    @Subscribe
    public void onInit(InitEvent event) {
        incidentsTable.addGeneratedColumn("fileNames", incidents -> {
            String fileNames = incidents.getFileNames();
            Label<String> label = uiComponents.create(Label.class);
            label.setValue(fileNames != null ? fileNames : "");
            return label;
        });

        incidentsTable.getColumn("fileNames").setCaption("Файлы");
    }
}
