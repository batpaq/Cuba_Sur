package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@NamePattern("%s|evaluation")
@Table(name = "COMPLIANCE_LAW_ACT", indexes = {
        @Index(name = "IDX_COMPLIANCE_LAW_ACT_COMPLIANCE_LAW", columnList = "COMPLIANCE_LAW_ID"),
        @Index(name = "IDX_COMPLIANCE_LAW_ACT_ACT", columnList = "ACT_ID")
})
@Entity(name = "suraltyn$ComplianceLawAct")
public class ComplianceLawAct extends StandardEntity {
    private static final long serialVersionUID = -7825083231127944205L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPLIANCE_LAW_ID")
    private ComplianceLaw complianceLaw;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACT_ID", nullable = false)
    private Act act;

    @Column(name = "EVALUATION", nullable = false)
    @NotNull
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

    public Act getAct() {
        return act;
    }

    public void setAct(Act act) {
        this.act = act;
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
