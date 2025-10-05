package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "COMPLIANCE_LAW")
@Entity(name = "ComplianceLaw")
public class ComplianceLaw extends StandardEntity {
    private static final long serialVersionUID = -8761347726119899920L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "complianceLawNumberGenerator")
    @SequenceGenerator(name = "complianceLawNumberGenerator", sequenceName = "complianceLaw_number_seq", allocationSize = 1)
    @Column(name = "NUMBER_", nullable = false)
    @NotNull
    private Integer number;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "INITIATOR", nullable = false)
    @NotNull
    private String initiator;

    @Column(name = "COMMENT_")
    private String comment;

    @Column(name = "DUE_DATE")
    @Temporal(TemporalType.DATE)
    private Date dueDate;

    @Composition
    @OneToMany(mappedBy = "complianceLaw")
    private List<ComplianceLawAct> actList;

    @Composition
    @OneToMany(mappedBy = "complianceLaw")
    private List<ComplianceLawVnd> vndList;

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public List<ComplianceLawAct> getActList() {
        return actList;
    }

    public void setActList(List<ComplianceLawAct> actList) {
        this.actList = actList;
    }

    public List<ComplianceLawVnd> getVndList() {
        return vndList;
    }

    public void setVndList(List<ComplianceLawVnd> vndList) {
        this.vndList = vndList;
    }
}
