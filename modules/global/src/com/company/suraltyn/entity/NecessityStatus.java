package com.company.suraltyn.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public enum NecessityStatus implements EnumClass<Integer> {

    YES(1),
    NO(2),
    NOT_REQUIRED(3);

    private final Integer id;

    NecessityStatus(Integer id) {
        this.id = id;
    }

    @Nonnull
    @Override
    public Integer getId() {
        return id;
    }

    @Nullable
    public static NecessityStatus fromId(Integer id) {
        for (NecessityStatus at : NecessityStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}