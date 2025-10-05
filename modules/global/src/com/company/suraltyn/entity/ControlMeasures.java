package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.global.DesignSupport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CONTROL_MEASURES")
@Entity(name = "ControlMeasures")
@NamePattern("%s|name")
public class ControlMeasures extends StandardEntity {

    private static final long serialVersionUID = -2444619089469180868L;

    @Column(name = "CODE")
    private Integer code;

    @Column(name = "NAME", length = 5000)
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
