create table RISK_EVENT (
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
    DESCRIPTION varchar(255),
    IMPACT_DEGREE varchar(255),
    SELF_ASSESSMENT_SVK_ID uuid not null,
    PLAN_EVENT_ID uuid,
    --
    primary key (ID)
);