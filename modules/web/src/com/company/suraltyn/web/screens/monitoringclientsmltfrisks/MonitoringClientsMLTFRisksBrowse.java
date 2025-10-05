package com.company.suraltyn.web.screens.monitoringclientsmltfrisks;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.MonitoringClientsMLTFRisks;

@UiController("suraltyn$MonitoringClientsMLTFRisks.browse")
@UiDescriptor("monitoring-clients-mltf-risks-browse.xml")
@LookupComponent("monitoringClientsMLTFRisksesTable")
@LoadDataBeforeShow
public class MonitoringClientsMLTFRisksBrowse extends StandardLookup<MonitoringClientsMLTFRisks> {
}