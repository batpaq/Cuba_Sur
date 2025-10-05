package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@NamePattern("Самооценка СВК №%s|number")
@Table(name = "SELF_ASSESSMENT_SVK", indexes = {
        @Index(name = "IDX_SELF_ASSESSMENT_SVK_DEPARTMENT", columnList = "DEPARTMENT_ID"),
        @Index(name = "IDX_SELF_ASSESSMENT_SVK_PERIOD", columnList = "PERIOD_ID"),
        @Index(name = "IDX_SELF_ASSESSMENT_SVK_QUARTER", columnList = "QUARTER_ID"),
        @Index(name = "IDX_SELF_ASSESSMENT_SVK_PREVIOUS_RATING", columnList = "PREVIOUS_RATING_ID"),
        @Index(name = "IDX_SELF_ASSESSMENT_SVK_CURRENT_RATING", columnList = "CURRENT_RATING_ID"),
        @Index(name = "IDX_SELF_ASSESSMENT_SVK_FORECAST_RATING", columnList = "FORECAST_RATING_ID")
})
@Entity(name = "SelfAssessmentSVK")
public class SelfAssessmentSVK extends StandardEntity {
    private static final long serialVersionUID = -8353194066131788578L;

    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "selfAssessmentSVKGenerator")
    @SequenceGenerator(name = "selfAssessmentSVKGenerator", sequenceName = "selfAssessmentSVK_number_seq", allocationSize = 1)
    @Column(name = "NUMBER_", nullable = false)
    private Integer number;

    @JoinColumn(name = "DEPARTMENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

    @JoinColumn(name = "PERIOD_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Period period;

    @Lob
    @Column(name = "DESCRIPTION_CHANGES")
    private String descriptionChanges;

    @JoinColumn(name = "QUARTER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Rating quarter;

    @JoinColumn(name = "PREVIOUS_RATING_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Rating previousRating;

    @JoinColumn(name = "CURRENT_RATING_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Rating currentRating;

    @JoinColumn(name = "FORECAST_RATING_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Rating forecastRating;

    @Lob
    @Column(name = "JUSTIFICATION")
    private String assessmentJustification;

    @Lob
    @Column(name = "MAIN_FACTORS")
    private String influenceFactors;

    @Lob
    @Column(name = "FUTURE_FACTORS")
    private String emergingRisks;

    @Column(name = "MANAGEMENT")
    private String management;

    @Column(name = "INTERNAL_CONTROLLER")
    private String internalController;

    @NotNull
    @Column(name = "FILL_DATE", nullable = false)
    private LocalDate fillDate;

    @Lob
    @Column(name = "COMMENT_DK")
    private String commentDK;

    @Composition
    @OneToMany(mappedBy = "selfAssessmentSVK")
    private List<RiskEvent> riskEvents;

    @Composition
    @OneToMany(mappedBy = "selfAssessmentSVK")
    private List<InternalExternalFactorAssessment> internalExternalFactors;

    @Composition
    @OneToMany(mappedBy = "selfAssessmentSVK")
    private List<PolicyProcedureAssessment> policyProcedureAssessment;

    @Composition
    @OneToMany(mappedBy = "selfAssessmentSVK")
    private List<ControlMeasureAssessment> controlMeasureAssessment;

    @Composition
    @OneToMany(mappedBy = "selfAssessmentSVK")
    private List<InternalControlMonitoring> internalControlMonitoring;

    @PrePersist
    public void prePersist() {
        this.fillDate = LocalDate.now();
    }

    public List<InternalControlMonitoring> getInternalControlMonitoring() {
        return internalControlMonitoring;
    }

    public void setInternalControlMonitoring(List<InternalControlMonitoring> internalControlMonitoring) {
        this.internalControlMonitoring = internalControlMonitoring;
    }

    public List<ControlMeasureAssessment> getControlMeasureAssessment() {
        return controlMeasureAssessment;
    }

    public void setControlMeasureAssessment(List<ControlMeasureAssessment> controlMeasureAssessment) {
        this.controlMeasureAssessment = controlMeasureAssessment;
    }

    public List<PolicyProcedureAssessment> getPolicyProcedureAssessment() {
        return policyProcedureAssessment;
    }

    public void setPolicyProcedureAssessment(List<PolicyProcedureAssessment> policyProcedureAssessment) {
        this.policyProcedureAssessment = policyProcedureAssessment;
    }

    public List<InternalExternalFactorAssessment> getInternalExternalFactors() {
        return internalExternalFactors;
    }

    public void setInternalExternalFactors(List<InternalExternalFactorAssessment> internalExternalFactors) {
        this.internalExternalFactors = internalExternalFactors;
    }

    public List<RiskEvent> getRiskEvents() {
        return riskEvents;
    }

    public void setRiskEvents(List<RiskEvent> riskEvents) {
        this.riskEvents = riskEvents;
    }

    public String getCommentDK() {
        return commentDK;
    }

    public void setCommentDK(String commentDK) {
        this.commentDK = commentDK;
    }

    public LocalDate getFillDate() {
        return fillDate;
    }

    public void setFillDate(LocalDate fillDate) {
        this.fillDate = fillDate;
    }

    public String getInternalController() {
        return internalController;
    }

    public void setInternalController(String internalController) {
        this.internalController = internalController;
    }

    public String getManagement() {
        return management;
    }

    public void setManagement(String management) {
        this.management = management;
    }

    public String getEmergingRisks() {
        return emergingRisks;
    }

    public void setEmergingRisks(String emergingRisks) {
        this.emergingRisks = emergingRisks;
    }

    public String getInfluenceFactors() {
        return influenceFactors;
    }

    public void setInfluenceFactors(String influenceFactors) {
        this.influenceFactors = influenceFactors;
    }

    public String getAssessmentJustification() {
        return assessmentJustification;
    }

    public void setAssessmentJustification(String assessmentJustification) {
        this.assessmentJustification = assessmentJustification;
    }

    public Rating getForecastRating() {
        return forecastRating;
    }

    public void setForecastRating(Rating forecastRating) {
        this.forecastRating = forecastRating;
    }

    public Rating getCurrentRating() {
        return currentRating;
    }

    public void setCurrentRating(Rating currentRating) {
        this.currentRating = currentRating;
    }

    public Rating getPreviousRating() {
        return previousRating;
    }

    public void setPreviousRating(Rating previousRating) {
        this.previousRating = previousRating;
    }

    public Rating getQuarter() {
        return quarter;
    }

    public void setQuarter(Rating quarter) {
        this.quarter = quarter;
    }

    public String getDescriptionChanges() {
        return descriptionChanges;
    }

    public void setDescriptionChanges(String descriptionChanges) {
        this.descriptionChanges = descriptionChanges;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
