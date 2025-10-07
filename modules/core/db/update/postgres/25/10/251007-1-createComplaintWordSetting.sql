create table COMPLAINT_WORD_SETTING (
    ID uuid,
    --
    WORD text,
    COMPLAINT_REASON_ID uuid not null,
    SIGN varchar(50) not null,
    --
    primary key (ID)
);