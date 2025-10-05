create table COMPLAINT_ANALYSIS_LOG (
    ID uuid,
    --
    COMPLAINT_ID uuid,
    ENABLED boolean,
    USER_ID uuid,
    TIMESTAMP_ timestamp,
    --
    primary key (ID)
);