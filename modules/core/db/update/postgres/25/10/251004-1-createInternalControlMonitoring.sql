create table INTERNAL_CONTROL_MONITORING (
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
    NECESSITY_STATUS integer not null,
    RESPONSIBLE_USER_ID uuid,
    DUE_DATE date,
    COMMENTS varchar(255),
    SELF_ASSESSMENT_SVK_ID uuid not null,
    --
    primary key (ID)
);