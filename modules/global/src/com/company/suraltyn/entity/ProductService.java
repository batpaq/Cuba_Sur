package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Listeners;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NamePattern("%s|name")
@Listeners("ProductServiceEventListener")
@Table(name = "PRODUCT_SERVICE", indexes = {
        @Index(name = "IDX_PRODUCT_SERVICE_DEPARTMENT", columnList = "DEPARTMENT_ID"),
        @Index(name = "IDX_PRODUCT_SERVICE_OWNER", columnList = "OWNER_ID"),
        @Index(name = "IDX_PRODUCT_SERVICE_RISK_COORDINATOR", columnList = "RISK_COORDINATOR_ID"),
        @Index(name = "IDX_PRODUCT_SERVICE_TYPE", columnList = "TYPE_ID")
})
@Entity(name = "suraltyn$ProductService")
public class ProductService extends StandardEntity {
    private static final long serialVersionUID = -7139330756994083147L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productServiceNumberGenerator")
    @SequenceGenerator(name = "productServiceNumberGenerator", sequenceName = "productService_number_seq", allocationSize = 1)
    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    private Integer number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OWNER_ID")
    private User owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RISK_COORDINATOR_ID")
    private User riskCoordinator;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TYPE_ID")
    private Type type;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Lob
    @Column(name = "SHORT_DESCRIPTION")
    private String shortDescription;

    @Column(name = "BOARD_STATEMENT_NUMBER")
    private String boardStatementNumber;

    @Column(name = "APPROVAL_DATE")
    private LocalDate approvalDate;

    @Column(name = "LAUNCH_DATE")
    private LocalDate launchDate;

    @Column(name = "POST_LAUNCH_ANALYSIS")
    private String postLaunchAnalysis;

    @Column(name = "STATUS_ID")
    private Integer status;

    @NotNull
    @Column(name = "INITIATOR", nullable = false)
    private String initiator;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "EXECUTION_DEADLINE")
    private LocalDate executionDeadline;

    public void setStatus(Status status) {
        this.status = status == null ? null : status.getId();
    }

    public Status getStatus() {
        return status == null ? null : Status.fromId(status);
    }

    public Integer getNumber() { return number; }
    public void setNumber(Integer number) { this.number = number; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }

    public User getOwner() { return owner; }
    public void setOwner(User owner) { this.owner = owner; }

    public User getRiskCoordinator() { return riskCoordinator; }
    public void setRiskCoordinator(User riskCoordinator) { this.riskCoordinator = riskCoordinator; }

    public Type getType() { return type; }
    public void setType(Type type) { this.type = type; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getShortDescription() { return shortDescription; }
    public void setShortDescription(String shortDescription) { this.shortDescription = shortDescription; }

    public String getBoardStatementNumber() { return boardStatementNumber; }
    public void setBoardStatementNumber(String boardStatementNumber) { this.boardStatementNumber = boardStatementNumber; }

    public LocalDate getApprovalDate() { return approvalDate; }
    public void setApprovalDate(LocalDate approvalDate) { this.approvalDate = approvalDate; }

    public LocalDate getLaunchDate() { return launchDate; }
    public void setLaunchDate(LocalDate launchDate) { this.launchDate = launchDate; }

    public String getPostLaunchAnalysis() { return postLaunchAnalysis; }
    public void setPostLaunchAnalysis(String postLaunchAnalysis) { this.postLaunchAnalysis = postLaunchAnalysis; }

    public String getInitiator() { return initiator; }
    public void setInitiator(String initiator) { this.initiator = initiator; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public LocalDate getExecutionDeadline() { return executionDeadline; }
    public void setExecutionDeadline(LocalDate executionDeadline) { this.executionDeadline = executionDeadline; }

}
