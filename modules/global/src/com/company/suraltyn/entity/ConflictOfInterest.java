package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NamePattern("%s|initiator")
@Table(name = "CONFLICT_OF_INTEREST", indexes = {
        @Index(name = "IDX_CONFLICT_OF_INTEREST_PLAN_EVENT", columnList = "PLAN_EVENT_ID"),
        @Index(name = "IDX_CONFLICT_OF_INTEREST_RISK_LEVEL", columnList = "RISK_LEVEL_ID")
})
@Entity(name = "ConflictOfInterest")
public class ConflictOfInterest extends BaseUuidEntity {
    private static final long serialVersionUID = -4802281980315332804L;


    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "conflictOfInterestNumberGenerator")
    @SequenceGenerator(name = "conflictOfInterestNumberGenerator", sequenceName = "conflictOfInterest_number_seq", allocationSize = 1)
    @Column(name = "NUMBER_", nullable = false)
    @NotNull
    private Integer number;

    @Column(name = "INITIATOR", nullable = false)
    @NotNull
    private String initiator;

    @Lob
    @Column(name = "COMMENT_")
    private String comment;

    @Column(name = "DUE_DATE")
    private LocalDate dueDate;

    @Lob
    @Column(name = "CONFLICT_DESCRIPTION")
    private String conflictDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLAN_EVENT_ID")
    private PlanEvent planEvent;

    @Column(name = "PLAN_DUE_DATE")
    private LocalDateTime planDueDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RISK_LEVEL_ID")
    private RiskLevel riskLevel;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getConflictDescription() {
        return conflictDescription;
    }

    public void setConflictDescription(String conflictDescription) {
        this.conflictDescription = conflictDescription;
    }

    public PlanEvent getPlanEvent() {
        return planEvent;
    }

    public void setPlanEvent(PlanEvent planEvent) {
        this.planEvent = planEvent;
    }

    public LocalDateTime getPlanDueDate() {
        return planDueDate;
    }

    public void setPlanDueDate(LocalDateTime planDueDate) {
        this.planDueDate = planDueDate;
    }

    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(RiskLevel riskLevel) {
        this.riskLevel = riskLevel;
    }

}
