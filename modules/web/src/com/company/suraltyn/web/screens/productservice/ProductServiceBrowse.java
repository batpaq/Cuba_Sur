package com.company.suraltyn.web.screens.productservice;

import com.haulmont.cuba.gui.screen.*;
import com.company.suraltyn.entity.ProductService;

@UiController("suraltyn$ProductService.browse")
@UiDescriptor("product-service-browse.xml")
@LookupComponent("productServicesTable")
@LoadDataBeforeShow
public class ProductServiceBrowse extends StandardLookup<ProductService> {
}