create table ACTIVITY_FILE_LINK (
    ACTIVITY_ID uuid,
    FILE_ENTITY_ID uuid,
    primary key (ACTIVITY_ID, FILE_ENTITY_ID)
);
