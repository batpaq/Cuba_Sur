create table PLAN_EVENT_FILES (
    FILE_ENTITY_ID uuid,
    PLAN_EVENT_ID uuid,
    primary key (FILE_ENTITY_ID, PLAN_EVENT_ID)
);
