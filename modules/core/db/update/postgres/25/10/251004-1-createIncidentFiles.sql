create table INCIDENT_FILES (
    INCIDENTS_ID uuid,
    FILE_ENTITY_ID uuid,
    primary key (INCIDENTS_ID, FILE_ENTITY_ID)
);
