package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@NamePattern("%s|vnd")
@Table(name = "COMPLIANCE_LAW_VND", indexes = {
        @Index(name = "IDX_COMPLIANCE_LAW_VND_COMPLIANCE_LAW", columnList = "COMPLIANCE_LAW_ID"),
        @Index(name = "IDX_COMPLIANCE_LAW_VND_VND", columnList = "VND_ID")
})
@Entity(name = "suraltyn$ComplianceLawVnd")
public class ComplianceLawVnd extends StandardEntity {
    private static final long serialVersionUID = -3586961709844619421L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPLIANCE_LAW_ID")
    private ComplianceLaw complianceLaw;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VND_ID", nullable = false)
    private Vnd vnd;

    @Column(name = "VND_MATCH_ACTS", nullable = false)
    @NotNull
    private String vndMatchActs;

    @Column(name = "EVALUATION")
    private String evaluation;

    @Column(name = "RISK_ASSESSMENT")
    private String riskAssessment;

    @Column(name = "NON_COMPLIANCE_REASON")
    private String nonComplianceReason;

    @Column(name = "JUSTIFICATION")
    private String justification;

    @Column(name = "GENERAL_COMMENT")
    private String generalComment;

    @Column(name = "ACTION_PLAN")
    private String actionPlan;

    @Column(name = "DUE_DATE")
    private LocalDateTime dueDate;

    public ComplianceLaw getComplianceLaw() {
        return complianceLaw;
    }

    public void setComplianceLaw(ComplianceLaw complianceLaw) {
        this.complianceLaw = complianceLaw;
    }

    public Vnd getVnd() {
        return vnd;
    }

    public void setVnd(Vnd vnd) {
        this.vnd = vnd;
    }

    public ComplianceEvaluation getVndMatchActs() {
        return vndMatchActs == null ? null : ComplianceEvaluation.fromId(vndMatchActs);
    }

    public void setVndMatchActs(ComplianceEvaluation vndMatchActs) {
        this.vndMatchActs = vndMatchActs == null ? null : vndMatchActs.getId();
    }

    public ComplianceEvaluation getEvaluation() {
        return evaluation == null ? null : ComplianceEvaluation.fromId(evaluation);
    }

    public void setEvaluation(ComplianceEvaluation evaluation) {
        this.evaluation = evaluation == null ? null : evaluation.getId();
    }

    public String getRiskAssessment() {
        return riskAssessment;
    }

    public void setRiskAssessment(String riskAssessment) {
        this.riskAssessment = riskAssessment;
    }

    public String getNonComplianceReason() {
        return nonComplianceReason;
    }

    public void setNonComplianceReason(String nonComplianceReason) {
        this.nonComplianceReason = nonComplianceReason;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

    public String getGeneralComment() {
        return generalComment;
    }

    public void setGeneralComment(String generalComment) {
        this.generalComment = generalComment;
    }

    public String getActionPlan() {
        return actionPlan;
    }

    public void setActionPlan(String actionPlan) {
        this.actionPlan = actionPlan;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
}
