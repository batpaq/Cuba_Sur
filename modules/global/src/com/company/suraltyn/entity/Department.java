package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.Set;

@NamePattern("%s|name")
@Table(name = "DEPARTMENT", indexes = {
        @Index(name = "IDX_DEPARTMENT_PARENT", columnList = "PARENT_ID")
})
@Entity(name = "suraltyn$Department")
public class Department extends StandardEntity {
    private static final long serialVersionUID = -1234567890123456796L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    private Department parent;

    @Column(name = "NAME", length = 1024)
    private String name;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @ManyToMany(mappedBy = "responsibleDepartments")
    private Set<Incidents> incidents;

    public Set<Incidents> getIncidents() {
        return incidents;
    }

    public void setIncidents(Set<Incidents> incidents) {
        this.incidents = incidents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getParent() {
        return parent;
    }

    public void setParent(Department parent) {
        this.parent = parent;
    }
}