package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NamePattern("%s|name")
@Table(name = "MONITORING_CLIENTS_ML_TF_RISKS", indexes = {
        @Index(name = "IDX_MONITORING_CLIENTS_MLT_FRISKS_INITIATOR", columnList = "INITIATOR")
})
@Entity(name = "suraltyn$MonitoringClientsMLTFRisks")
public class MonitoringClientsMLTFRisks extends StandardEntity {
    private static final long serialVersionUID = -1234567890123456794L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "numberGenerator")
    @SequenceGenerator(name = "numberGenerator", sequenceName = "numberer_seq", allocationSize = 1)
    @Column(name = "NUMBER_")
    private Integer number;

    @Column(name = "NAME")
    private String name;

    @NotNull
    @Column(name = "INITIATOR", nullable = false)
    private String initiator;

    @Column(name = "DEADLINE_DATE")
    private LocalDate deadlineDate;

    @Lob
    @Column(name = "COMMENT_")
    private String comment;

    @Column(name = "TOTAL_CLIENTS")
    private Integer totalClients;

    @NotNull
    @Column(name = "HIGH_RISK_CLIENTS_COUNT", nullable = false)
    private Integer highRiskClientsCount;

    @NotNull
    @Column(name = "IPDL", nullable = false)
    private Integer ipdl;

    @NotNull
    @Column(name = "HIGH_RISK_ACTIVITY_CLIENTS_COUNT", nullable = false)
    private Integer highRiskActivityClientsCount;

    @NotNull
    @Column(name = "PROHIBITED_ACTIVITY_CLIENTS_COUNT", nullable = false)
    private Integer prohibitedActivityClientsCount;

    @NotNull
    @Column(name = "HIGH_COUNTRY_RISK_CLIENTS_COUNT", nullable = false)
    private Integer highCountryRiskClientsCount;

    @NotNull
    @Column(name = "PROHIBITED_COUNTRY_CLIENTS_COUNT", nullable = false)
    private Integer prohibitedCountryClientsCount;

    @NotNull
    @Column(name = "SANCTION_LIST_CLIENTS_COUNT", nullable = false)
    private Integer sanctionListClientsCount;

    @NotNull
    @Column(name = "TOTAL_CLIENTS_FOR_UPDATE_COUNT", nullable = false)
    private Integer totalClientsForUpdateCount;

    @NotNull
    @Column(name = "UPDATED_CLIENTS_COUNT", nullable = false)
    private Integer updatedClientsCount;

    @NotNull
    @Column(name = "NOT_UPDATED_CLIENTS_COUNT", nullable = false)
    private Integer notUpdatedClientsCount;

    @Lob
    @Column(name = "NOT_UPDATED_REASON")
    private String notUpdatedReason;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(LocalDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getTotalClients() {
        return totalClients;
    }

    public void setTotalClients(Integer totalClients) {
        this.totalClients = totalClients;
    }

    public Integer getHighRiskClientsCount() {
        return highRiskClientsCount;
    }

    public void setHighRiskClientsCount(Integer highRiskClientsCount) {
        this.highRiskClientsCount = highRiskClientsCount;
    }

    public Integer getIpdl() {
        return ipdl;
    }

    public void setIpdl(Integer ipdl) {
        this.ipdl = ipdl;
    }

    public Integer getHighRiskActivityClientsCount() {
        return highRiskActivityClientsCount;
    }

    public void setHighRiskActivityClientsCount(Integer highRiskActivityClientsCount) {
        this.highRiskActivityClientsCount = highRiskActivityClientsCount;
    }

    public Integer getProhibitedActivityClientsCount() {
        return prohibitedActivityClientsCount;
    }

    public void setProhibitedActivityClientsCount(Integer prohibitedActivityClientsCount) {
        this.prohibitedActivityClientsCount = prohibitedActivityClientsCount;
    }

    public Integer getHighCountryRiskClientsCount() {
        return highCountryRiskClientsCount;
    }

    public void setHighCountryRiskClientsCount(Integer highCountryRiskClientsCount) {
        this.highCountryRiskClientsCount = highCountryRiskClientsCount;
    }

    public Integer getProhibitedCountryClientsCount() {
        return prohibitedCountryClientsCount;
    }

    public void setProhibitedCountryClientsCount(Integer prohibitedCountryClientsCount) {
        this.prohibitedCountryClientsCount = prohibitedCountryClientsCount;
    }

    public Integer getSanctionListClientsCount() {
        return sanctionListClientsCount;
    }

    public void setSanctionListClientsCount(Integer sanctionListClientsCount) {
        this.sanctionListClientsCount = sanctionListClientsCount;
    }

    public Integer getTotalClientsForUpdateCount() {
        return totalClientsForUpdateCount;
    }

    public void setTotalClientsForUpdateCount(Integer totalClientsForUpdateCount) {
        this.totalClientsForUpdateCount = totalClientsForUpdateCount;
    }

    public Integer getUpdatedClientsCount() {
        return updatedClientsCount;
    }

    public void setUpdatedClientsCount(Integer updatedClientsCount) {
        this.updatedClientsCount = updatedClientsCount;
    }

    public Integer getNotUpdatedClientsCount() {
        return notUpdatedClientsCount;
    }

    public void setNotUpdatedClientsCount(Integer notUpdatedClientsCount) {
        this.notUpdatedClientsCount = notUpdatedClientsCount;
    }

    public String getNotUpdatedReason() {
        return notUpdatedReason;
    }

    public void setNotUpdatedReason(String notUpdatedReason) {
        this.notUpdatedReason = notUpdatedReason;
    }
}
