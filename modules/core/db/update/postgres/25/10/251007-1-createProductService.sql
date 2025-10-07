create table PRODUCT_SERVICE (
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
    OWNER_ID uuid,
    RISK_COORDINATOR_ID uuid,
    TYPE_ID uuid,
    NAME varchar(255) not null,
    SHORT_DESCRIPTION text,
    BOARD_STATEMENT_NUMBER varchar(255),
    APPROVAL_DATE date,
    LAUNCH_DATE date,
    POST_LAUNCH_ANALYSIS varchar(255),
    STATUS_ID integer,
    INITIATOR varchar(255) not null,
    COMMENT varchar(255),
    EXECUTION_DEADLINE date,
    --
    primary key (ID)
);