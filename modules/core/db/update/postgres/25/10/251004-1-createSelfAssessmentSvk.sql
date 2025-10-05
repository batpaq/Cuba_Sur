create table SELF_ASSESSMENT_SVK (
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
    PERIOD_ID uuid,
    DESCRIPTION_CHANGES text,
    QUARTER_ID uuid,
    PREVIOUS_RATING_ID uuid,
    CURRENT_RATING_ID uuid,
    FORECAST_RATING_ID uuid,
    JUSTIFICATION text,
    MAIN_FACTORS text,
    FUTURE_FACTORS text,
    MANAGEMENT varchar(255),
    INTERNAL_CONTROLLER varchar(255),
    FILL_DATE date not null,
    COMMENT_DK text,
    --
    primary key (ID)
);