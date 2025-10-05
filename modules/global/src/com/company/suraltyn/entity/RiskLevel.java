package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "RISK_LEVEL")
@Entity(name = "RiskLevel")
@NamePattern("%s|name")
public class RiskLevel extends StandardEntity {
    private static final long serialVersionUID = -913998419751421565L;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CODE")
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