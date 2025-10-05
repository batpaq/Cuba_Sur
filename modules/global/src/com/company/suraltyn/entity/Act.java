package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "ACT")
@Entity(name = "Act")
@NamePattern("%s %s|name,code")
public class Act extends StandardEntity {
    private static final long serialVersionUID = -7457169149043632979L;
    @NotNull
    @Lob
    @Column(name = "NAME", nullable = false)
    private String name;
    @NotNull
    @Column(name = "CODE", nullable = false)
    private Integer code;

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