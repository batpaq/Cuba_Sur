package com.company.suraltyn.entity;


import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NamePattern("%s|description")
@Table(name = "RISK_EVENT", indexes = {
        @Index(name = "IDX_RISK_EVENT_SELF_ASSESSMENT_SVK", columnList = "SELF_ASSESSMENT_SVK_ID"),
        @Index(name = "IDX_RISK_EVENT_PLAN_EVENT", columnList = "PLAN_EVENT_ID")
})
@Entity(name = "RiskEvent")
public class RiskEvent extends StandardEntity {
    private static final long serialVersionUID = -7760042560712241486L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "riskEventNumberGenerator")
    @SequenceGenerator(name = "riskEventNumberGenerator", sequenceName = "riskEvent_number_seq", allocationSize = 1)
    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    private Integer number;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "IMPACT_DEGREE")
    private String impactDegree;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SELF_ASSESSMENT_SVK_ID", nullable = false)
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @NotNull
    private SelfAssessmentSVK selfAssessmentSVK;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLAN_EVENT_ID")
    private Activity activity;

    @Transient
    private String responsibleExecutor;

    @Transient
    private LocalDate dueDate;

    @PostLoad
    @PostPersist
    @PostUpdate
    public void updateFieldsFromActivity() {
        if (activity != null) {
            this.responsibleExecutor = activity.getResponsibleEmployee();
            this.dueDate = activity.getNewDeadline() != null
                    ? activity.getNewDeadline()
                    : activity.getDeadline();
        }
    }

    public Integer getNumber() { return number; }
    public void setNumber(Integer number) { this.number = number; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImpactDegree() { return impactDegree; }
    public void setImpactDegree(String impactDegree) { this.impactDegree = impactDegree; }

    public SelfAssessmentSVK getSelfAssessmentSVK() { return selfAssessmentSVK; }
    public void setSelfAssessmentSVK(SelfAssessmentSVK selfAssessmentSVK) { this.selfAssessmentSVK = selfAssessmentSVK; }

    public Activity getActivity() { return activity; }
    public void setActivity(Activity activity) { this.activity = activity; }

    public String getResponsibleExecutor() { return responsibleExecutor; }
    public void setResponsibleExecutor(String responsibleExecutor) { this.responsibleExecutor = responsibleExecutor; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
}
