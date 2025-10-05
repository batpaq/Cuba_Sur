package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@NamePattern("%s|number")
@Table(name = "COMPLIANCE_RISK", indexes = {
        @Index(name = "IDX_COMPLIANCE_RISK_DEPARTMENT", columnList = "DEPARTMENT_ID"),
        @Index(name = "IDX_COMPLIANCE_RISK_SOURCE", columnList = "SOURCE_ID"),
        @Index(name = "IDX_COMPLIANCE_RISK_RATING", columnList = "RATING_ID"),
        @Index(name = "IDX_COMPLIANCE_RISK_PLAN_EVENT", columnList = "PLAN_EVENT_ID"),
        @Index(name = "IDX_COMPLIANCE_RISK_OWNER", columnList = "OWNER_ID"),
        @Index(name = "IDX_COMPLIANCE_RISK_RISK_CATEGORY", columnList = "RISK_CATEGORY_ID")
})
@Entity(name = "suraltyn$ComplianceRisk")
public class ComplianceRisk extends StandardEntity {
    private static final long serialVersionUID = -3961163697791834335L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "complianceRiskNumberGenerator")
    @SequenceGenerator(name = "complianceRiskNumberGenerator", sequenceName = "complianceRisk_number_seq", allocationSize = 1)
    private Integer number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RISK_CATEGORY_ID")
    private RiskLevel riskCategory;

    @Lob
    @Column(name = "SHORT_DESCRIPTION")
    private String shortDescription;

    @Lob
    @Column(name = "DETAILED_DESCRIPTION")
    private String detailedDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SOURCE_ID")
    private RiskSource source;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RATING_ID")
    private RiskLevel rating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLAN_EVENT_ID")
    private PlanEvent planEvent;

    @Column(name = "DETECTION_DATE")
    private LocalDateTime detectionDate;

    @Column(name = "PLANNED_CLOSE_DATE")
    private LocalDateTime plannedCloseDate;

    @Column(name = "EXTENDED_DATE")
    private LocalDateTime extendedDate;

    @Column(name = "ACCEPTED_DATE")
    private LocalDateTime acceptedDate;

    @Column(name = "FINAL_ACCEPTED_DATE")
    private LocalDateTime finalAcceptedDate;

    @Column(name = "CLOSED_DATE")
    private LocalDateTime closedDate;

    @Column(name = "STATUS")
    private Integer status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OWNER_ID")
    private User owner;

    @Column(name = "INITIATOR")
    private String initiator;

    @Column(name = "COMMENT_")
    private String comment;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public RiskLevel getRiskCategory() {
        return riskCategory;
    }

    public void setRiskCategory(RiskLevel riskCategory) {
        this.riskCategory = riskCategory;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public RiskSource getSource() {
        return source;
    }

    public void setSource(RiskSource source) {
        this.source = source;
    }

    public RiskLevel getRating() {
        return rating;
    }

    public void setRating(RiskLevel rating) {
        this.rating = rating;
    }

    public PlanEvent getPlanEvent() {
        return planEvent;
    }

    public void setPlanEvent(PlanEvent planEvent) {
        this.planEvent = planEvent;
    }

    public LocalDateTime getDetectionDate() {
        return detectionDate;
    }

    public void setDetectionDate(LocalDateTime detectionDate) {
        this.detectionDate = detectionDate;
    }

    public LocalDateTime getPlannedCloseDate() {
        return plannedCloseDate;
    }

    public void setPlannedCloseDate(LocalDateTime plannedCloseDate) {
        this.plannedCloseDate = plannedCloseDate;
    }

    public LocalDateTime getExtendedDate() {
        return extendedDate;
    }

    public void setExtendedDate(LocalDateTime extendedDate) {
        this.extendedDate = extendedDate;
    }

    public LocalDateTime getAcceptedDate() {
        return acceptedDate;
    }

    public void setAcceptedDate(LocalDateTime acceptedDate) {
        this.acceptedDate = acceptedDate;
    }

    public LocalDateTime getFinalAcceptedDate() {
        return finalAcceptedDate;
    }

    public void setFinalAcceptedDate(LocalDateTime finalAcceptedDate) {
        this.finalAcceptedDate = finalAcceptedDate;
    }

    public LocalDateTime getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(LocalDateTime closedDate) {
        this.closedDate = closedDate;
    }

    public Status getStatus() {
        return status == null ? null : Status.fromId(status);
    }

    public void setStatus(Status status) {
        this.status = status == null ? null : status.getId();
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
