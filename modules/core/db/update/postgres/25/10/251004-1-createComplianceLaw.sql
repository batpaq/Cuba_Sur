create table COMPLIANCE_LAW (
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
    NAME varchar(255) not null,
    INITIATOR varchar(255) not null,
    COMMENT_ varchar(255),
    DUE_DATE date,
    --
    primary key (ID)
);