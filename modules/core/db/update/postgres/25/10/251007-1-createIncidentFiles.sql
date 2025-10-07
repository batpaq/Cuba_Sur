create table INCIDENT_FILES (
    INCIDENTS_ID uuid,
    FILE_DESCRIPTOR_ID uuid,
    primary key (INCIDENTS_ID, FILE_DESCRIPTOR_ID)
);
