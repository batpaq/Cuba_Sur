create table INCIDENT_DEPARTMENTS (
    INCIDENTS_ID uuid,
    DEPARTMENT_ID uuid,
    primary key (INCIDENTS_ID, DEPARTMENT_ID)
);
