package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "COMPLIANCE_POLICY_REQUIREMENT", indexes = {
        @Index(name = "IDX_COMPLIANCE_POLICY_REQUIREMENT_COMPLIANCE_POLICY", columnList = "COMPLIANCE_POLICY_ID")
})
@Entity(name = "CompliancePolicyRequirement")
public class CompliancePolicyRequirement extends StandardEntity {
    private static final long serialVersionUID = -2850750339597025455L;

    @Column(name = "NUMBER_", nullable = false)
    @NotNull
    private Integer number;

    @Column(name = "NAME")
    private String name;

    @Column(name = "OBSERVATION_EVALUATION", nullable = false)
    @NotNull
    private String observationEvaluation;

    @Lob
    @Column(name = "COMMENT_")
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPLIANCE_POLICY_ID")
    private CompliancePolicy compliancePolicy;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public ObservationEvaluation getObservationEvaluation() {
        return observationEvaluation == null ? null : ObservationEvaluation.fromId(observationEvaluation);
    }

    public void setObservationEvaluation(ObservationEvaluation observationEvaluation) {
        this.observationEvaluation = observationEvaluation == null ? null : observationEvaluation.getId();
    }

    public CompliancePolicy getCompliancePolicy() {
        return compliancePolicy;
    }

    public void setCompliancePolicy(CompliancePolicy compliancePolicy) {
        this.compliancePolicy = compliancePolicy;
    }
}
