package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Listeners;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@NamePattern("%s|complaintNumber")
@Listeners("altyn_ComplaintEventListener")
@Table(name = "COMPLAINT", indexes = {
        @Index(name = "IDX_COMPLAINT_CHANNEL", columnList = "CHANNEL_ID"),
        @Index(name = "IDX_COMPLAINT_APPLICANT_TYPE", columnList = "APPLICANT_TYPE_ID"),
        @Index(name = "IDX_COMPLAINT_CLIENT_PH", columnList = "CLIENT_PH_ID"),
        @Index(name = "IDX_COMPLAINT_COMPLAINT_REASON", columnList = "COMPLAINT_REASON_ID"),
        @Index(name = "IDX_COMPLAINT_CLOSED_BY_LOGIN", columnList = "CLOSED_BY_LOGIN_ID"),
        @Index(name = "IDX_COMPLAINT_EMPLOYEE", columnList = "EMPLOYEE_ID"),
        @Index(name = "IDX_COMPLAINT_RESPONSE_TYPE", columnList = "RESPONSE_TYPE_ID"),
        @Index(name = "IDX_COMPLAINT_REASON", columnList = "REASON_ID"),
        @Index(name = "IDX_COMPLAINT_RISK_ASSESSMENT", columnList = "RISK_ASSESSMENT_ID"),
        @Index(name = "IDX_COMPLAINT_INITIATOR", columnList = "INITIATOR")
})
@Entity(name = "suraltyn$Complaint")
public class Complaint extends StandardEntity {
    private static final long serialVersionUID = -5663714881942643815L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "complaintSystemNumberGenerator")
    @SequenceGenerator(name = "complaintSystemNumberGenerator", sequenceName = "complaint_system_number_seq", allocationSize = 1)
    @Column(name = "COMPLAINT_SYSTEM_NUMBER")
    private Integer complaintSystemNumber;

    @Column(name = "COMPLAINT_NUMBER", length = 512)
    private String complaintNumber;

    @Temporal(TemporalType.DATE)
    @Column(name = "RECEIVED_DATE")
    private Date receivedDate;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "REGISTRATION_DATE", nullable = false, updatable = false)
    private Date registrationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CHANNEL_ID")
    private Channel channel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "APPLICANT_TYPE_ID")
    private ApplicantType applicantType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_PH_ID")
    private ClientPh clientPh;

    @Column(name = "APPLICANT_LAST_NAME", length = 512)
    private String applicantLastName;

    @Column(name = "APPLICANT_FIRST_NAME", length = 512)
    private String applicantFirstName;

    @Column(name = "APPLICANT_IIN", length = 12, nullable = false)
    @Size(min = 12, max = 12, message = "ИИН должен содержать ровно 12 цифр")
    @Pattern(regexp = "\\d{12}", message = "ИИН должен состоять только из цифр")
    private String applicantIIN;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REASON_ID")
    private Subject reason;

    @Column(name = "WORD_ANALYSIS_ENABLED")
    private Boolean wordAnalysisEnabled = Boolean.TRUE;

    @Column(name = "COMPLAINT_SIGN")
    private String complaintSign;

    @Lob
    @Column(name = "DESCRIPTION")
    private String description;

    @Lob
    @Column(name = "REASON_FOR_THE_COMPLAINT")
    private String reasonForTheComplaint;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLOSED_BY_LOGIN_ID")
    private User closedByLogin;

    @Column(name = "CLOSED_BY_USER", length = 1000)
    private String closedByUser;

    @Lob
    @Column(name = "COMMENT_")
    private String comment;

    @Temporal(TemporalType.DATE)
    @Column(name = "CLOSED_DATE")
    private Date closedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYEE_ID")
    private User employee;

    @Column(name = "RESPONSIBLE_DEPARTMENT", length = 1000)
    private String responsibleDepartment;

    @Temporal(TemporalType.DATE)
    @Column(name = "DUE_DATE")
    private Date dueDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESPONSE_TYPE_ID")
    private ResponseType responseType;

    @NotNull
    @Column(name = "STATUS", nullable = false)
    private Integer status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPLAINT_REASON_ID")
    private ComplaintReason complaintReason;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RISK_ASSESSMENT_ID")
    private ComplianceRiskAssessment riskAssessment;

    @Lob
    @Column(name = "COMPLAINT_COMMENT")
    private String complaintComment;

    @NotNull
    @Column(name = "INITIATOR", nullable = false)
    private String initiator;

    public Integer getComplaintSystemNumber() { return complaintSystemNumber; }
    public void setComplaintSystemNumber(Integer complaintSystemNumber) { this.complaintSystemNumber = complaintSystemNumber; }

    public String getComplaintNumber() { return complaintNumber; }
    public void setComplaintNumber(String complaintNumber) { this.complaintNumber = complaintNumber; }

    public Date getReceivedDate() { return receivedDate; }
    public void setReceivedDate(Date receivedDate) { this.receivedDate = receivedDate; }

    public Date getRegistrationDate() { return registrationDate; }
    public void setRegistrationDate(Date registrationDate) { this.registrationDate = registrationDate; }

    public Channel getChannel() { return channel; }
    public void setChannel(Channel channel) { this.channel = channel; }

    public ApplicantType getApplicantType() { return applicantType; }
    public void setApplicantType(ApplicantType applicantType) { this.applicantType = applicantType; }

    public ClientPh getClientPh() { return clientPh; }
    public void setClientPh(ClientPh clientPh) { this.clientPh = clientPh; }

    public String getApplicantLastName() { return applicantLastName; }
    public void setApplicantLastName(String applicantLastName) { this.applicantLastName = applicantLastName; }

    public String getApplicantFirstName() { return applicantFirstName; }
    public void setApplicantFirstName(String applicantFirstName) { this.applicantFirstName = applicantFirstName; }

    public String getApplicantIIN() { return applicantIIN; }
    public void setApplicantIIN(String applicantIIN) { this.applicantIIN = applicantIIN; }

    public Subject getReason() { return reason; }
    public void setReason(Subject reason) { this.reason = reason; }

    public Boolean getWordAnalysisEnabled() { return wordAnalysisEnabled; }
    public void setWordAnalysisEnabled(Boolean wordAnalysisEnabled) { this.wordAnalysisEnabled = wordAnalysisEnabled; }

    public ComplaintSign getComplaintSign() { return complaintSign == null ? null : ComplaintSign.fromId(complaintSign); }
    public void setComplaintSign(ComplaintSign complaintSign) { this.complaintSign = complaintSign == null ? null : complaintSign.getId(); }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getReasonForTheComplaint() { return reasonForTheComplaint; }
    public void setReasonForTheComplaint(String reasonForTheComplaint) { this.reasonForTheComplaint = reasonForTheComplaint; }

    public User getClosedByLogin() { return closedByLogin; }
    public void setClosedByLogin(User closedByLogin) { this.closedByLogin = closedByLogin; }

    public String getClosedByUser() { return closedByUser; }
    public void setClosedByUser(String closedByUser) { this.closedByUser = closedByUser; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public Date getClosedDate() { return closedDate; }
    public void setClosedDate(Date closedDate) { this.closedDate = closedDate; }

    public User getEmployee() { return employee; }
    public void setEmployee(User employee) { this.employee = employee; }

    public String getResponsibleDepartment() { return responsibleDepartment; }
    public void setResponsibleDepartment(String responsibleDepartment) { this.responsibleDepartment = responsibleDepartment; }

    public Date getDueDate() { return dueDate; }
    public void setDueDate(Date dueDate) { this.dueDate = dueDate; }

    public ResponseType getResponseType() { return responseType; }
    public void setResponseType(ResponseType responseType) { this.responseType = responseType; }

    public Status getStatus() { return status == null ? null : Status.fromId(status); }
    public void setStatus(Status status) { this.status = status == null ? null : status.getId(); }

    public ComplaintReason getComplaintReason() { return complaintReason; }
    public void setComplaintReason(ComplaintReason complaintReason) { this.complaintReason = complaintReason; }

    public ComplianceRiskAssessment getRiskAssessment() { return riskAssessment; }
    public void setRiskAssessment(ComplianceRiskAssessment riskAssessment) { this.riskAssessment = riskAssessment; }

    public String getComplaintComment() { return complaintComment; }
    public void setComplaintComment(String complaintComment) { this.complaintComment = complaintComment; }

    public String getInitiator() { return initiator; }
    public void setInitiator(String initiator) { this.initiator = initiator; }

}
