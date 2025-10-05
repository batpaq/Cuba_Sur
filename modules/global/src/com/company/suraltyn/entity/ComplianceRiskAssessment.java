package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "COMPLIANCE_RISK_ASSESSMENT")
@Entity(name = "suraltyn$ComplianceRiskAssessment")
public class ComplianceRiskAssessment extends StandardEntity {
    private static final long serialVersionUID = -1234567890123456793L;

    @Column(name = "CODE")
    private Integer code;

    @Column(name = "NAME", length = 5000)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}