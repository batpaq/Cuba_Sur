package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@NamePattern("%s|initiator")
@Table(name = "COMPLIANCE_POLICY", indexes = {
        @Index(name = "IDX_COMPLIANCE_POLICY_DEPARTMENT", columnList = "DEPARTMENT_ID")
})
@Entity(name = "suraltyn$CompliancePolicy")
public class CompliancePolicy extends StandardEntity {
    private static final long serialVersionUID = -5075526143959645205L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "compliancePolicyNumberGenerator")
    @SequenceGenerator(name = "compliancePolicyNumberGenerator", sequenceName = "compliancePolicy_number_seq", allocationSize = 1)
    private Integer number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;

    @NotNull
    @Column(name = "INITIATOR", nullable = false)
    private String initiator;

    @Column(name = "COMMENT_")
    private String comment;

    @Column(name = "DUE_DATE")
    private LocalDate dueDate;

    @Composition
    @OneToMany(mappedBy = "compliancePolicy")
    private List<CompliancePolicyRequirement> requirements;


    public List<CompliancePolicyRequirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<CompliancePolicyRequirement> requirements) {
        this.requirements = requirements;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
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
