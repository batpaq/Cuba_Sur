create table COMPLIANCE_POLICY (
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
    DEPARTMENT_ID uuid,
    INITIATOR varchar(255) not null,
    COMMENT_ varchar(255),
    DUE_DATE date,
    --
    primary key (ID)
);