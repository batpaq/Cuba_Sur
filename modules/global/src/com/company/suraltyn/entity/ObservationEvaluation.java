package com.company.suraltyn.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public enum ObservationEvaluation implements EnumClass<String> {

    YES("yes"),
    NO("no"),
    PARTLY("partly");

    private final String id;

    ObservationEvaluation(String id) {
        this.id = id;
    }

    @Nonnull
    @Override
    public String getId() {
        return id;
    }

    @Nullable
    public static ObservationEvaluation fromId(String id) {
        for (ObservationEvaluation at : ObservationEvaluation.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}