package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "TYPE_")
@Entity(name = "Type")
@NamePattern("%s|name")
public class Type extends BaseUuidEntity {
    private static final long serialVersionUID = -6385881009422838796L;

    @NotNull
    @Column(name = "CODE", nullable = false)
    private Integer code;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
