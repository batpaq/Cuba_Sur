package com.company.suraltyn.entity;

import com.company.suraltyn.util.FileSizeFormatter;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@NamePattern("%s|fileName")
@Table(name = "FILE_ENTITY")
@Entity(name = "FileEntity")
public class FileEntity extends StandardEntity {
    private static final long serialVersionUID = -1775417759305481440L;

    @NotNull
    @Column(name = "FILE_NAME", nullable = false)
    private String fileName;

    @NotNull
    @Column(name = "FILE_TYPE", nullable = false)
    private String fileType;

    @NotNull
    @Column(name = "FILE_SIZE", nullable = false)
    private Long fileSize;

    @JoinColumn(name = "FILE_DESCRIPTOR_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private FileDescriptor fileDescriptor;

    @JoinTable(name = "INCIDENT_FILES",
            joinColumns = @JoinColumn(name = "FILE_ENTITY_ID"),
            inverseJoinColumns = @JoinColumn(name = "INCIDENTS_ID"))
    @ManyToMany
    private Set<Incidents> incidents = new HashSet<>();

    @JoinTable(name = "PLAN_EVENT_FILES",
            joinColumns = @JoinColumn(name = "FILE_ENTITY_ID"),
            inverseJoinColumns = @JoinColumn(name = "PLAN_EVENT_ID"))
    @ManyToMany
    private Set<PlanEvent> planEvents = new HashSet<>();

    @JoinTable(name = "ACTIVITY_FILES",
            joinColumns = @JoinColumn(name = "FILE_ENTITY_ID"),
            inverseJoinColumns = @JoinColumn(name = "ACTIVITY_ID"))
    @ManyToMany
    private Set<Activity> activities = new HashSet<>();


    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Long getFileSize() {
        return fileSize;
    }
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public FileDescriptor getFileDescriptor() {
        return fileDescriptor;
    }
    public void setFileDescriptor(FileDescriptor fileDescriptor) {
        this.fileDescriptor = fileDescriptor;
    }

    public Set<Incidents> getIncidents() {
        return incidents;
    }
    public void setIncidents(Set<Incidents> incidents) {
        this.incidents = incidents;
    }

    public Set<PlanEvent> getPlanEvents() {
        return planEvents;
    }
    public void setPlanEvents(Set<PlanEvent> planEvents) {
        this.planEvents = planEvents;
    }

    public Set<Activity> getActivities() {
        return activities;
    }
    public void setActivities(Set<Activity> activities) {
        this.activities = activities;
    }

    @Transient
    public String getFormattedFileSize() {
        long size = fileSize != null ? fileSize : 0;
        return FileSizeFormatter.formatSize(size);
    }

}
