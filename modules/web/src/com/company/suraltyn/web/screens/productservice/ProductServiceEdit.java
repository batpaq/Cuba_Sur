package com.company.suraltyn.web.screens.productservice;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ProductService;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.screen.*;

import com.company.suraltyn.entity.Status;
import com.haulmont.cuba.security.global.UserSession;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.Date;

@UiController("suraltyn$ProductService.edit")
@UiDescriptor("product-service-edit.xml")
@EditedEntityContainer("productServiceDc")
@LoadDataBeforeShow
public class ProductServiceEdit extends StandardEditor<ProductService> {
    @Inject
    private DateField<LocalDate> launchDateField;

    @Inject
    private LookupField<Status> statusField;

    @Inject
    private UserSession userSession;

    @Subscribe
    public void onInit(InitEvent event) {
        launchDateField.addValueChangeListener(e -> updateStatusBasedOnLaunchDate());
    }

    private void updateStatusBasedOnLaunchDate() {
        if (launchDateField.getValue() == null) {
            statusField.setValue(Status.NOT_STARTED);
        } else {
            statusField.setValue(Status.STARTED);
        }
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        if (getEditedEntity().getInitiator() == null) {
            getEditedEntity().setInitiator(userSession.getCurrentOrSubstitutedUser().getLogin());
        }
    }
}