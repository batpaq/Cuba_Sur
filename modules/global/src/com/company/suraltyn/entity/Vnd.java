package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "VND")
@Entity(name = "Vnd")
@NamePattern("%s %s|name,code")
public class Vnd extends StandardEntity {
    private static final long serialVersionUID = -1126419961195916698L;
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