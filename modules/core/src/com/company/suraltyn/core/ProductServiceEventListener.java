package com.company.suraltyn.core;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;
import com.company.suraltyn.entity.ProductService;
import com.company.suraltyn.entity.Status;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

@Component(ProductServiceEventListener.NAME)
public class ProductServiceEventListener
        implements BeforeInsertEntityListener<ProductService>, BeforeUpdateEntityListener<ProductService> {

    public static final String NAME = "suraltyn_ProductServiceEventListener";

    @Override
    public void onBeforeInsert(@Nonnull ProductService entity, @Nonnull EntityManager entityManager) {
        updateStatus(entity);
    }

    @Override
    public void onBeforeUpdate(@Nonnull ProductService entity, @Nonnull EntityManager entityManager) {
        updateStatus(entity);
    }

    private void updateStatus(@Nonnull ProductService entity) {
        if (entity.getLaunchDate() == null) {
            entity.setStatus(Status.NOT_STARTED);
        } else {
            entity.setStatus(Status.STARTED);
        }
    }
}
