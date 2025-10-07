create table ACTIVITY_FILES (
    FILE_ENTITY_ID uuid,
    ACTIVITY_ID uuid,
    primary key (FILE_ENTITY_ID, ACTIVITY_ID)
);
