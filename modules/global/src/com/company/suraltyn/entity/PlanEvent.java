package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@NamePattern("%s|name")
@Table(name = "PLAN_EVENT")
@Entity(name = "suraltyn$PlanEvent")
public class PlanEvent extends StandardEntity {
    private static final long serialVersionUID = -1234567890123456799L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "planEventNumberGenerator")
    @SequenceGenerator(name = "planEventNumberGenerator", sequenceName = "planEvent_number_seq", allocationSize = 1)
    @NotNull
    @Column(name = "NUMBER_PM", nullable = false)
    private Integer numberPm;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "CREATION_DATE", nullable = false)
    private LocalDate creationDate;

    @Column(name = "STATUS")
    private String status;

    @NotNull
    @Column(name = "ENTITY_NAME", nullable = false)
    private String entityName;

    @NotNull
    @Column(name = "DEADLINE", nullable = false)
    private LocalDate deadline;

    @Column(name = "NEW_DEADLINE")
    private LocalDate newDeadline;

    @Composition
    @OneToMany(mappedBy = "planEvent")
    private List<Activity> activities;

    @OnDelete(DeletePolicy.UNLINK)
    @JoinTable(name = "PLAN_EVENT_FILE_LINK",
            joinColumns = @JoinColumn(name = "PLAN_EVENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "FILE_ENTITY_ID"))
    @ManyToMany
    private Set<FileEntity> files;

    public Integer getNumberPm() {
        return numberPm;
    }

    public void setNumberPm(Integer numberPm) {
        this.numberPm = numberPm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public LocalDate getNewDeadline() {
        return newDeadline;
    }

    public void setNewDeadline(LocalDate newDeadline) {
        this.newDeadline = newDeadline;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public Set<FileEntity> getFiles() {
        return files;
    }

    public void setFiles(Set<FileEntity> files) {
        this.files = files;
    }
}