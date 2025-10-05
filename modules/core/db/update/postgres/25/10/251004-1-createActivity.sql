create table ACTIVITY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PLAN_EVENT_ID uuid,
    NAME varchar(255) not null,
    DEPARTMENT_ID uuid not null,
    RESPONSIBLE_EMPLOYEE varchar(255),
    DEADLINE date not null,
    NEW_DEADLINE date,
    STATUS varchar(255),
    NECESSARY_MEASURES text,
    COMMENTS text,
    --
    primary key (ID)
);