package com.company.suraltyn.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@NamePattern("%s|enabled")
@Table(name = "COMPLAINT_ANALYSIS_LOG", indexes = {
        @Index(name = "IDX_COMPLAINT_ANALYSIS_LOG_COMPLAINT", columnList = "COMPLAINT_ID"),
        @Index(name = "IDX_COMPLAINT_ANALYSIS_LOG_USER", columnList = "USER_ID")
})
@Entity(name = "ComplaintAnalysisLog")
public class ComplaintAnalysisLog extends BaseUuidEntity {
    private static final long serialVersionUID = -5482248604520213033L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPLAINT_ID")
    private Complaint complaint;

    @Column(name = "ENABLED")
    private Boolean enabled;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "TIMESTAMP_")
    private LocalDateTime timestamp;

    public Complaint getComplaint() {
        return complaint;
    }

    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
