create table COMPLIANCE_POLICY_REQUIREMENT (
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
    NAME varchar(255),
    OBSERVATION_EVALUATION varchar(50) not null,
    COMMENT_ text,
    COMPLIANCE_POLICY_ID uuid,
    --
    primary key (ID)
);