package com.company.suraltyn.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public enum Status implements EnumClass<Integer> {

    CREATED(1),
    COMPLETED(2),
    IN_WORK(3),
    EXECUTED(4),
    ON_CONSIDER(5),
    ON_AGREEMENT(6),
    AGREED(7),
    ON_REWORK(8),
    REJECTED(9),
    ON_APPROVAL(10),
    APPROVED(11),
    ON_EXECUTE_AP(12),
    NOT_STARTED(13),
    STARTED(14);

    private final Integer id;

    Status(Integer id) {
        this.id = id;
    }

    @Nonnull
    @Override
    public Integer getId() {
        return id;
    }

    @Nullable
    public static Status fromId(Integer id) {
        for (Status at : Status.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}