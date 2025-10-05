create table COMPLIANCE_LAW_VND (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COMPLIANCE_LAW_ID uuid,
    VND_ID uuid not null,
    VND_MATCH_ACTS varchar(50) not null,
    EVALUATION varchar(50),
    RISK_ASSESSMENT varchar(255),
    NON_COMPLIANCE_REASON varchar(255),
    JUSTIFICATION varchar(255),
    GENERAL_COMMENT varchar(255),
    ACTION_PLAN varchar(255),
    DUE_DATE timestamp,
    --
    primary key (ID)
);