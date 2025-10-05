package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Table(name = "POLICY_PROCEDURE_ASSESSMENT", indexes = {
        @Index(name = "IDX_POLICY_PROCEDURE_ASSESSMENT_SELF_ASSESSMENT_SVK", columnList = "SELF_ASSESSMENT_SVK_ID"),
        @Index(name = "IDX_POLICY_PROCEDURE_ASSESSMENT_MEASURE_PLAN", columnList = "MEASURE_PLAN_ID"),
        @Index(name = "IDX_POLICY_PROCEDURE_ASSESSMENT_RESPONSIBLE_EXECUTOR", columnList = "RESPONSIBLE_EXECUTOR_ID")
})
@Entity(name = "PolicyProcedureAssessment")
@NamePattern("%s|policyCompliance")
public class PolicyProcedureAssessment extends StandardEntity {

    private static final long serialVersionUID = -4755546306870431857L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "policyProcedureAssessmentNumberGenerator")
    @SequenceGenerator(name = "policyProcedureAssessmentNumberGenerator", sequenceName = "policyProcedureAssessment_number_seq", allocationSize = 1)
    @Column(name = "NUMBER_", nullable = false)
    @NotNull
    private Integer number;

    @Column(name = "POLICY_COMPLIANCE")
    private String policyCompliance;

    @Column(name = "CONTROL_SYSTEM_UPDATE")
    private String controlSystemUpdate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEASURE_PLAN_ID")
    private PlanEvent measurePlan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESPONSIBLE_EXECUTOR_ID")
    private User responsibleExecutor;

    @Column(name = "DEADLINE")
    private LocalDate deadline;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SELF_ASSESSMENT_SVK_ID",nullable = false)
    @OnDeleteInverse(DeletePolicy.CASCADE)
    private SelfAssessmentSVK selfAssessmentSVK;

    public SelfAssessmentSVK getSelfAssessmentSVK() {
        return selfAssessmentSVK;
    }

    public void setSelfAssessmentSVK(SelfAssessmentSVK selfAssessmentSVK) {
        this.selfAssessmentSVK = selfAssessmentSVK;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public User getResponsibleExecutor() {
        return responsibleExecutor;
    }

    public void setResponsibleExecutor(User responsibleExecutor) {
        this.responsibleExecutor = responsibleExecutor;
    }

    public PlanEvent getMeasurePlan() {
        return measurePlan;
    }

    public void setMeasurePlan(PlanEvent measurePlan) {
        this.measurePlan = measurePlan;
    }

    public String getControlSystemUpdate() {
        return controlSystemUpdate;
    }

    public void setControlSystemUpdate(String controlSystemUpdate) {
        this.controlSystemUpdate = controlSystemUpdate;
    }

    public String getPolicyCompliance() {
        return policyCompliance;
    }

    public void setPolicyCompliance(String policyCompliance) {
        this.policyCompliance = policyCompliance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
