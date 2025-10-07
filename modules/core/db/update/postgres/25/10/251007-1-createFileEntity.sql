create table FILE_ENTITY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FILE_NAME varchar(255) not null,
    FILE_TYPE varchar(255) not null,
    FILE_SIZE bigint not null,
    FILE_DESCRIPTOR_ID uuid,
    --
    primary key (ID)
);