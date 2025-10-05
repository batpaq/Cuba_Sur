package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NamePattern("%s|number")
@Table(name = "CONTROL_MEASURE_ASSESSMENT", indexes = {
        @Index(name = "IDX_CONTROL_MEASURE_ASSESSMENT_CONTROL_MEASURE_NAME", columnList = "CONTROL_MEASURE_NAME_ID"),
        @Index(name = "IDX_CONTROL_MEASURE_ASSESSMENT_RESPONSIBLE_EXECUTOR", columnList = "RESPONSIBLE_EXECUTOR_ID"),
        @Index(name = "IDX_CONTROL_MEASURE_ASSESSMENT_MEASURE_PLAN", columnList = "MEASURE_PLAN_ID"),
        @Index(name = "IDX_CONTROL_MEASURE_ASSESSMENT_SELF_ASSESSMENT_SVK", columnList = "SELF_ASSESSMENT_SVK_ID")
})
@Entity(name = "suraltyn$ControlMeasureAssessment")
public class ControlMeasureAssessment extends StandardEntity {
    private static final long serialVersionUID = -6159140471803884865L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "controlMeasureAssessmentNumberGenerator")
    @SequenceGenerator(name = "controlMeasureAssessmentNumberGenerator", sequenceName = "controlMeasureAssessment_number_seq", allocationSize = 1)
    private Integer number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTROL_MEASURE_NAME_ID")
    private ControlMeasures controlMeasureName;

    @NotNull
    @Column(name = "NECESSITY_STATUS", nullable = false)
    private Integer necessityStatus;

    @Column(name = "COMMENT_")
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEASURE_PLAN_ID")
    private PlanEvent measurePlan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESPONSIBLE_EXECUTOR_ID")
    private User responsibleExecutor;

    @Column(name = "DEADLINE")
    private LocalDate deadline;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SELF_ASSESSMENT_SVK_ID", nullable = false)
    private SelfAssessmentSVK selfAssessmentSVK;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public ControlMeasures getControlMeasureName() {
        return controlMeasureName;
    }

    public void setControlMeasureName(ControlMeasures controlMeasureName) {
        this.controlMeasureName = controlMeasureName;
    }

    public NecessityStatus getNecessityStatus() {
        return necessityStatus == null ? null : NecessityStatus.fromId(necessityStatus);
    }

    public void setNecessityStatus(NecessityStatus necessityStatus) {
        this.necessityStatus = necessityStatus == null ? null : necessityStatus.getId();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

