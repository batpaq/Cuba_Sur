package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "COMPLAINT_REASON")
@Entity(name = "suraltyn$ComplaintReason")
public class ComplaintReason extends StandardEntity {
    private static final long serialVersionUID = -1234567890123456792L;

    @Column(name = "NAME", length = 1024)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}