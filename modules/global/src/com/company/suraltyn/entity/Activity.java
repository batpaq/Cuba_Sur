package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Set;

@NamePattern("%s|name")
@Table(name = "ACTIVITY", indexes = {
        @Index(name = "IDX_ACTIVITY_DEPARTMENT", columnList = "DEPARTMENT_ID"),
        @Index(name = "IDX_ACTIVITY_PLAN_EVENT", columnList = "PLAN_EVENT_ID")
})
@Entity(name = "suraltyn$Activity")
public class Activity extends StandardEntity {
    private static final long serialVersionUID = -1234567890123456800L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLAN_EVENT_ID")
    private PlanEvent planEvent;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;

    @Column(name = "RESPONSIBLE_EMPLOYEE")
    private String responsibleEmployee;

    @NotNull
    @Column(name = "DEADLINE", nullable = false)
    private LocalDate deadline;

    @Column(name = "NEW_DEADLINE")
    private LocalDate newDeadline;

    @Column(name = "STATUS")
    private String status;

    @Lob
    @Column(name = "NECESSARY_MEASURES")
    private String necessaryMeasures;

    @Lob
    @Column(name = "COMMENTS")
    private String comments;

    @OnDelete(DeletePolicy.UNLINK)
    @JoinTable(name = "ACTIVITY_FILE_LINK",
            joinColumns = @JoinColumn(name = "ACTIVITY_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "FILE_ENTITY_ID", referencedColumnName = "ID"))
    @ManyToMany
    private Set<FileEntity> files;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public PlanEvent getPlanEvent() {
        return planEvent;
    }

    public void setPlanEvent(PlanEvent planEvent) {
        this.planEvent = planEvent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getResponsibleEmployee() {
        return responsibleEmployee;
    }

    public void setResponsibleEmployee(String responsibleEmployee) {
        this.responsibleEmployee = responsibleEmployee;
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

    public String getNecessaryMeasures() {
        return necessaryMeasures;
    }

    public void setNecessaryMeasures(String necessaryMeasures) {
        this.necessaryMeasures = necessaryMeasures;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Set<FileEntity> getFiles() {
        return files;
    }

    public void setFiles(Set<FileEntity> files) {
        this.files = files;
    }
}