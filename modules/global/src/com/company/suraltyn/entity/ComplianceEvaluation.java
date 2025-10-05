package com.company.suraltyn.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;


public enum ComplianceEvaluation implements EnumClass<String> {

    CORRESPONDS("соответствует"),
    NOT_CORRESPONDS("не соответствует");

    private final String id;

    ComplianceEvaluation(String value) {
        this.id = value;
    }

    @Nonnull
    public String getId() {
        return id;
    }

    @Nullable
    public static ComplianceEvaluation fromId(String id) {
        for (ComplianceEvaluation at : ComplianceEvaluation.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}