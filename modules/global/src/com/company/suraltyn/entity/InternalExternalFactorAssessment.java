package com.company.suraltyn.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NamePattern("%s|internalFactor")
@Table(name = "INTERNAL_EXTERNAL_FACTOR_ASSESSMENT", indexes = {
        @Index(name = "IDX_INTERNAL_EXTERNAL_FACTOR_ASSESSMENT_RESPONSIBLE_EXECUTOR", columnList = "RESPONSIBLE_EXECUTOR_ID"),
        @Index(name = "IDX_INTERNAL_EXTERNAL_FACTOR_ASSESSMENT_MEASURE_PLAN", columnList = "MEASURE_PLAN_ID_ID"),
        @Index(name = "IDX_INTERNAL_EXTERNAL_FACTOR_ASSESSMENT_SELF_ASSESSMENT_SVK", columnList = "SELF_ASSESSMENT_SVK_ID")
})
@Entity(name = "InternalExternalFactorAssessment")
public class InternalExternalFactorAssessment extends StandardEntity {
    private static final long serialVersionUID = -7002965356022712853L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "internalExternalFactorAssessmentNumberGenerator")
    @SequenceGenerator(name = "internalExternalFactorAssessmentNumberGenerator", sequenceName = "internalExternalFactorAssessment_number_seq", allocationSize = 1)
    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    private Integer number;

    @Column(name = "INTERNAL_FACTOR")
    private String internalFactor;

    @Column(name = "EXTERNAL_FACTOR")
    private String externalFactor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEASURE_PLAN_ID_ID")
    private PlanEvent measurePlan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESPONSIBLE_EXECUTOR_ID")
    private User responsibleExecutor;

    @Column(name = "DEADLINE")
    private LocalDate deadline;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SELF_ASSESSMENT_SVK_ID")
    @OnDeleteInverse(DeletePolicy.CASCADE)
    private SelfAssessmentSVK selfAssessmentSVK;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getInternalFactor() {
        return internalFactor;
    }

    public void setInternalFactor(String internalFactor) {
        this.internalFactor = internalFactor;
    }

    public String getExternalFactor() {
        return externalFactor;
    }

    public void setExternalFactor(String externalFactor) {
        this.externalFactor = externalFactor;
    }

    public PlanEvent getMeasurePlan() {
        return measurePlan;
    }

    public void setMeasurePlan(PlanEvent measurePlan) {
        this.measurePlan = measurePlan;
    }

    public User getResponsibleExecutor() {
        return responsibleExecutor;
    }

    public void setResponsibleExecutor(User responsibleExecutor) {
        this.responsibleExecutor = responsibleExecutor;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public SelfAssessmentSVK getSelfAssessmentSVK() {
        return selfAssessmentSVK;
    }

    public void setSelfAssessmentSVK(SelfAssessmentSVK selfAssessmentSVK) {
        this.selfAssessmentSVK = selfAssessmentSVK;
    }
}
