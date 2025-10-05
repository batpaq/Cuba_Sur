package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NamePattern("%s - %s|number,trainingName")
@Table(name = "TRAINING", indexes = {
        @Index(name = "IDX_TRAINING_POSITION", columnList = "POSITION_ID"),
        @Index(name = "IDX_TRAINING_BRANCH", columnList = "DEPARTMENT_ID")
})
@Entity(name = "Training")
public class Training extends StandardEntity {
    private static final long serialVersionUID = -293803969659378588L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "numberGenerator")
    @SequenceGenerator(name = "numberGenerator", sequenceName = "number_seq", allocationSize = 1)
    @Column(name = "NUMBER_")
    private Integer number;

    @NotNull
    @Column(name = "TRAINING_NAME", nullable = false)
    private String trainingName;

    @NotNull
    @Column(name = "EMPLOYEE", nullable = false)
    private String employee;

    @NotNull
    @Column(name = "TAB_NUM", nullable = false)
    private Integer tabNum;

    @NotNull
    @Column(name = "DATE_", nullable = false)
    private LocalDate date;

    @NotNull
    @JoinColumn(name = "POSITION_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User position;

    @NotNull
    @JoinColumn(name = "DEPARTMENT_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Department department;

    @NotNull
    @Column(name = "INITIATOR", nullable = false)
    private String initiator;

    @Lob
    @Column(name = "COMMENT_")
    private String comment;

    @Column(name = "DUE_DATE")
    private LocalDate dueDate;

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTrainingName() {
        return trainingName;
    }
    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public String getEmployee() {
        return employee;
    }
    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public Integer getTabNum() {
        return tabNum;
    }
    public void setTabNum(Integer tabNum) {
        this.tabNum = tabNum;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public User getPosition() {
        return position;
    }
    public void setPosition(User position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
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

    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
