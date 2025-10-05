create table TRAINING (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ integer,
    TRAINING_NAME varchar(255) not null,
    EMPLOYEE varchar(255) not null,
    TAB_NUM integer not null,
    DATE_ date not null,
    POSITION_ID uuid not null,
    DEPARTMENT_ID uuid not null,
    INITIATOR varchar(255) not null,
    COMMENT_ text,
    DUE_DATE date,
    --
    primary key (ID)
);