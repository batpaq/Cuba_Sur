package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "SUBJECT")
@Entity(name = "suraltyn$Subject")
public class Subject extends StandardEntity {
    private static final long serialVersionUID = -1234567890123456790L;

    @Column(name = "NAME", length = 1024)
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