package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@NamePattern("%s|name")
@Table(name = "INCIDENTS", indexes = {
        @Index(name = "IDX_INCIDENTS_HEAD", columnList = "HEAD_ID"),
        @Index(name = "IDX_INCIDENTS_EXECUTOR", columnList = "EXECUTOR_ID"),
        @Index(name = "IDX_INCIDENTS_SOURCE", columnList = "SOURCE_ID")
})
@Entity(name = "suraltyn$Incidents")
public class Incidents extends StandardEntity {
    private static final long serialVersionUID = -6433776602326646670L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "incidentsNumberGenerator")
    @SequenceGenerator(name = "incidentsNumberGenerator", sequenceName = "incidents_number_seq", allocationSize = 1)
    @Column(name = "NUMBER_")
    private Integer number;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "INITIATOR", nullable = false)
    private String initiator;

    @NotNull
    @Column(name = "AUTHORITY_NAME", nullable = false)
    private String authorityName;

    @NotNull
    @Column(name = "CHECK_NAME", nullable = false)
    private String checkName;

    @Column(name = "CHECK_DATE")
    private LocalDate checkDate;

    @Column(name = "VIOLATION_NAME")
    private String violationName;

    @Column(name = "VIOLATION_COUNT")
    private Integer violationCount;

    @JoinTable(name = "INCIDENT_DEPARTMENTS",
            joinColumns = @JoinColumn(name = "INCIDENTS_ID"),
            inverseJoinColumns = @JoinColumn(name = "DEPARTMENT_ID"))
    @ManyToMany
    private Set<Department> responsibleDepartments = new HashSet<>();

    @JoinColumn(name = "HEAD_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User departmentHead;

    @JoinColumn(name = "EXECUTOR_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User executor;

    @Column(name = "DEADLINE")
    private LocalDate deadline;

    @NotNull
    @Column(name = "MEASURES_COUNT", nullable = false)
    private Integer measuresCount;

    @Lob
    @NotNull
    @Column(name = "PENALTIES_RESULT", nullable = false)
    private String penaltiesResult;

    @NotNull
    @Column(name = "PENALTY_SUM", nullable = false)
    private Integer penaltySum;

    @Column(name = "REIMBURSEMENT")
    private Integer reimbursement;

    @NotNull
    @JoinColumn(name = "SOURCE_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private SourceDictionary source;

    @Lob
    @Column(name = "COMMENT_")
    private String comment;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinTable(name = "INCIDENT_FILES",
            joinColumns = @JoinColumn(name = "INCIDENTS_ID"),
            inverseJoinColumns = @JoinColumn(name = "FILE_DESCRIPTOR_ID"))
    @ManyToMany
    private Set<FileDescriptor> files = new HashSet<>();

    @Transient
    public String getFileNames() {
        if (files == null || files.isEmpty()) {
            return "";
        }
        return files.stream()
                .map(FileDescriptor::getName)
                .collect(Collectors.joining(", "));
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getInitiator() {
        return initiator;
    }
    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public String getAuthorityName() {
        return authorityName;
    }
    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public String getCheckName() {
        return checkName;
    }
    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public LocalDate getCheckDate() {
        return checkDate;
    }
    public void setCheckDate(LocalDate checkDate) {
        this.checkDate = checkDate;
    }

    public String getViolationName() {
        return violationName;
    }
    public void setViolationName(String violationName) {
        this.violationName = violationName;
    }

    public Integer getViolationCount() {
        return violationCount;
    }
    public void setViolationCount(Integer violationCount) {
        this.violationCount = violationCount;
    }

    public Set<Department> getResponsibleDepartments() {
        return responsibleDepartments;
    }
    public void setResponsibleDepartments(Set<Department> responsibleDepartments) {
        this.responsibleDepartments = responsibleDepartments;
    }

    public User getDepartmentHead() {
        return departmentHead;
    }
    public void setDepartmentHead(User departmentHead) {
        this.departmentHead = departmentHead;
    }

    public User getExecutor() {
        return executor;
    }
    public void setExecutor(User executor) {
        this.executor = executor;
    }

    public LocalDate getDeadline() {
        return deadline;
    }
    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Integer getMeasuresCount() {
        return measuresCount;
    }
    public void setMeasuresCount(Integer measuresCount) {
        this.measuresCount = measuresCount;
    }

    public String getPenaltiesResult() {
        return penaltiesResult;
    }
    public void setPenaltiesResult(String penaltiesResult) {
        this.penaltiesResult = penaltiesResult;
    }

    public Integer getPenaltySum() {
        return penaltySum;
    }
    public void setPenaltySum(Integer penaltySum) {
        this.penaltySum = penaltySum;
    }

    public Integer getReimbursement() {
        return reimbursement;
    }
    public void setReimbursement(Integer reimbursement) {
        this.reimbursement = reimbursement;
    }

    public SourceDictionary getSource() {
        return source;
    }
    public void setSource(SourceDictionary source) {
        this.source = source;
    }

    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Set<FileDescriptor> getFiles() {
        return files;
    }
    public void setFiles(Set<FileDescriptor> files) {
        this.files = files;
    }
}