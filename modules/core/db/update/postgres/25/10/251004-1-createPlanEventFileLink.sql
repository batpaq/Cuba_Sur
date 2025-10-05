create table PLAN_EVENT_FILE_LINK (
    PLAN_EVENT_ID uuid,
    FILE_ENTITY_ID uuid,
    primary key (PLAN_EVENT_ID, FILE_ENTITY_ID)
);
