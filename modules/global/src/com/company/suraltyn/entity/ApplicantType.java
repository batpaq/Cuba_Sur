package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "APPLICANT_TYPE")
@Entity(name = "suraltyn$ApplicantType")
public class ApplicantType extends StandardEntity {
    private static final long serialVersionUID = -6698205966601995799L;

    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}