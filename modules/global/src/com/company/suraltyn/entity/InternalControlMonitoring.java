package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NamePattern("%s|description")
@Table(name = "INTERNAL_CONTROL_MONITORING", indexes = {
        @Index(name = "IDX_INTERNAL_CONTROL_MONITORING_RESPONSIBLE_USER", columnList = "RESPONSIBLE_USER_ID"),
        @Index(name = "IDX_INTERNAL_CONTROL_MONITORING_SELF_ASSESSMENT_SVK", columnList = "SELF_ASSESSMENT_SVK_ID")
})
@Entity(name = "InternalControlMonitoring")
public class InternalControlMonitoring extends StandardEntity {

    private static final long serialVersionUID = -309095647681789760L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "internalControlMonitoringNumberGenerator")
    @SequenceGenerator(name = "internalControlMonitoringNumberGenerator", sequenceName = "internalControlMonitoring_number_seq", allocationSize = 1)
    @Column(name = "NUMBER_", nullable = false)
    @NotNull
    private Integer number;

    @Column(name = "DESCRIPTION")
    private String description;

    @NotNull
    @Column(name = "NECESSITY_STATUS", nullable = false)
    private Integer necessityStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESPONSIBLE_USER_ID")
    private User responsibleUser;

    @Column(name = "DUE_DATE")
    private LocalDate dueDate;

    @Column(name = "COMMENTS")
    private String comments;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SELF_ASSESSMENT_SVK_ID")
    private SelfAssessmentSVK selfAssessmentSVK;


    public SelfAssessmentSVK getSelfAssessmentSVK() {
        return selfAssessmentSVK;
    }

    public void setSelfAssessmentSVK(SelfAssessmentSVK selfAssessmentSVK) {
        this.selfAssessmentSVK = selfAssessmentSVK;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public User getResponsibleUser() {
        return responsibleUser;
    }

    public void setResponsibleUser(User responsibleUser) {
        this.responsibleUser = responsibleUser;
    }

    public NecessityStatus getNecessityStatus() {
        return necessityStatus == null ? null : NecessityStatus.fromId(necessityStatus);
    }

    public void setNecessityStatus(NecessityStatus necessityStatus) {
        this.necessityStatus = necessityStatus == null ? null : necessityStatus.getId();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
