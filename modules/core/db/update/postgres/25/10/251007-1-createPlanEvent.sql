create table PLAN_EVENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_PM integer not null,
    NAME varchar(255) not null,
    CREATION_DATE date not null,
    STATUS varchar(255),
    ENTITY_NAME varchar(255) not null,
    DEADLINE date not null,
    NEW_DEADLINE date,
    --
    primary key (ID)
);