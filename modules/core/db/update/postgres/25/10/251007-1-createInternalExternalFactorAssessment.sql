create table INTERNAL_EXTERNAL_FACTOR_ASSESSMENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ integer not null,
    INTERNAL_FACTOR varchar(255),
    EXTERNAL_FACTOR varchar(255),
    MEASURE_PLAN_ID_ID uuid,
    RESPONSIBLE_EXECUTOR_ID uuid,
    DEADLINE date,
    SELF_ASSESSMENT_SVK_ID uuid not null,
    --
    primary key (ID)
);