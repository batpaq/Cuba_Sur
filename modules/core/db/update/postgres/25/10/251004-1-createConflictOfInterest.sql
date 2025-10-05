create table CONFLICT_OF_INTEREST (
    ID uuid,
    --
    NUMBER_ integer not null,
    INITIATOR varchar(255) not null,
    COMMENT_ text,
    DUE_DATE date,
    CONFLICT_DESCRIPTION text,
    PLAN_EVENT_ID uuid,
    PLAN_DUE_DATE timestamp,
    RISK_LEVEL_ID uuid,
    --
    primary key (ID)
);