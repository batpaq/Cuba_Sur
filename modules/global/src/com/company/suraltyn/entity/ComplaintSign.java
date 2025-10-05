package com.company.suraltyn.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public enum ComplaintSign implements EnumClass<String> {

    YES("yes"),
    NO("no");

    private final String id;

    ComplaintSign(String id) {
        this.id = id;
    }

    @Nonnull
    @Override
    public String getId() {
        return id;
    }

    @Nullable
    public static ComplaintSign fromId(String id) {
        for (ComplaintSign at : ComplaintSign.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}