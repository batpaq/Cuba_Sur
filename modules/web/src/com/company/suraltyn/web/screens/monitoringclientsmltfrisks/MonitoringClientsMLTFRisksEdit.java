package com.company.suraltyn.web.screens.monitoringclientsmltfrisks;

import com.company.suraltyn.entity.MonitoringClientsMLTFRisks;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.security.global.UserSession;

import javax.inject.Inject;

@UiController("suraltyn$MonitoringClientsMLTFRisks.edit")
@UiDescriptor("monitoring-clients-mltf-risks-edit.xml")
@EditedEntityContainer("monitoringClientsMLTFRisksDc")
@LoadDataBeforeShow
public class MonitoringClientsMLTFRisksEdit extends StandardEditor<MonitoringClientsMLTFRisks> {

    @Inject
    private UserSession userSession;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        if (getEditedEntity().getInitiator() == null) {
            getEditedEntity().setInitiator(userSession.getCurrentOrSubstitutedUser().getLogin());
        }
    }
}