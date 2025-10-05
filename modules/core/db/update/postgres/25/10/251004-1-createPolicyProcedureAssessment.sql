create table POLICY_PROCEDURE_ASSESSMENT (
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
    POLICY_COMPLIANCE varchar(255),
    CONTROL_SYSTEM_UPDATE varchar(255),
    MEASURE_PLAN_ID uuid,
    RESPONSIBLE_EXECUTOR_ID uuid,
    DEADLINE date,
    SELF_ASSESSMENT_SVK_ID uuid not null,
    --
    primary key (ID)
);