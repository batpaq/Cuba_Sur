-- begin CONFLICT_OF_INTEREST
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
)^
-- end CONFLICT_OF_INTEREST
-- begin COMPLAINT_WORD_SETTING
create table COMPLAINT_WORD_SETTING (
    ID uuid,
    --
    WORD text,
    COMPLAINT_REASON_ID uuid not null,
    SIGN varchar(50) not null,
    --
    primary key (ID)
)^
-- end COMPLAINT_WORD_SETTING
-- begin TYPE_
create table TYPE_ (
    ID uuid,
    --
    CODE integer not null,
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end TYPE_
-- begin COMPLAINT_ANALYSIS_LOG
create table COMPLAINT_ANALYSIS_LOG (
    ID uuid,
    --
    COMPLAINT_ID uuid,
    ENABLED boolean,
    USER_ID uuid,
    TIMESTAMP_ timestamp,
    --
    primary key (ID)
)^
-- end COMPLAINT_ANALYSIS_LOG
-- begin RISK_SOURCE
create table RISK_SOURCE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE integer not null,
    --
    primary key (ID)
)^
-- end RISK_SOURCE
-- begin CONTROL_MEASURE_ASSESSMENT
create table CONTROL_MEASURE_ASSESSMENT (
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
    CONTROL_MEASURE_NAME_ID uuid,
    NECESSITY_STATUS integer not null,
    COMMENT_ varchar(255),
    MEASURE_PLAN_ID uuid,
    RESPONSIBLE_EXECUTOR_ID uuid,
    DEADLINE date,
    SELF_ASSESSMENT_SVK_ID uuid not null,
    --
    primary key (ID)
)^
-- end CONTROL_MEASURE_ASSESSMENT
-- begin COMPLAINT
create table COMPLAINT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COMPLAINT_SYSTEM_NUMBER integer,
    COMPLAINT_NUMBER varchar(512),
    RECEIVED_DATE date,
    REGISTRATION_DATE date not null,
    CHANNEL_ID uuid,
    APPLICANT_TYPE_ID uuid,
    CLIENT_PH_ID uuid,
    APPLICANT_LAST_NAME varchar(512),
    APPLICANT_FIRST_NAME varchar(512),
    APPLICANT_IIN varchar(12) not null,
    REASON_ID uuid,
    WORD_ANALYSIS_ENABLED boolean,
    COMPLAINT_SIGN varchar(50),
    DESCRIPTION text,
    REASON_FOR_THE_COMPLAINT text,
    CLOSED_BY_LOGIN_ID uuid,
    CLOSED_BY_USER varchar(1000),
    COMMENT_ text,
    CLOSED_DATE date,
    EMPLOYEE_ID uuid,
    RESPONSIBLE_DEPARTMENT varchar(1000),
    DUE_DATE date,
    RESPONSE_TYPE_ID uuid,
    STATUS integer not null,
    COMPLAINT_REASON_ID uuid,
    RISK_ASSESSMENT_ID uuid,
    COMPLAINT_COMMENT text,
    INITIATOR varchar(255) not null,
    --
    primary key (ID)
)^
-- end COMPLAINT
-- begin SUBJECT
create table SUBJECT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(1024),
    CODE integer not null,
    --
    primary key (ID)
)^
-- end SUBJECT
-- begin COMPLIANCE_LAW_ACT
create table COMPLIANCE_LAW_ACT (
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
    ACT_ID uuid not null,
    EVALUATION varchar(50) not null,
    RISK_ASSESSMENT varchar(255),
    NON_COMPLIANCE_REASON varchar(255),
    JUSTIFICATION varchar(255),
    GENERAL_COMMENT varchar(255),
    ACTION_PLAN varchar(255),
    DUE_DATE timestamp,
    --
    primary key (ID)
)^
-- end COMPLIANCE_LAW_ACT
-- begin DEPARTMENT
create table DEPARTMENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PARENT_ID uuid,
    NAME varchar(1024),
    --
    primary key (ID)
)^
-- end DEPARTMENT
-- begin INTERNAL_CONTROL_MONITORING
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
)^
-- end INTERNAL_CONTROL_MONITORING
-- begin PRODUCT_SERVICE
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
)^
-- end PRODUCT_SERVICE
-- begin COMPLIANCE_RISK_ASSESSMENT
create table COMPLIANCE_RISK_ASSESSMENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE integer,
    NAME varchar(5000),
    --
    primary key (ID)
)^
-- end COMPLIANCE_RISK_ASSESSMENT
-- begin RATING
create table RATING (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE integer,
    NAME varchar(4000),
    --
    primary key (ID)
)^
-- end RATING
-- begin ACTIVITY
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
)^
-- end ACTIVITY
-- begin FILE_ENTITY
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
)^
-- end FILE_ENTITY
-- begin RISK_EVENT
create table RISK_EVENT (
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
    IMPACT_DEGREE varchar(255),
    SELF_ASSESSMENT_SVK_ID uuid not null,
    PLAN_EVENT_ID uuid,
    --
    primary key (ID)
)^
-- end RISK_EVENT
-- begin CLIENT_PH
create table CLIENT_PH (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end CLIENT_PH
-- begin CONTROL_MEASURES
create table CONTROL_MEASURES (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE integer,
    NAME varchar(5000),
    --
    primary key (ID)
)^
-- end CONTROL_MEASURES
-- begin INCIDENTS
create table INCIDENTS (
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
    NAME varchar(255) not null,
    INITIATOR varchar(255) not null,
    AUTHORITY_NAME varchar(255) not null,
    CHECK_NAME varchar(255) not null,
    CHECK_DATE date,
    VIOLATION_NAME varchar(255),
    VIOLATION_COUNT integer,
    HEAD_ID uuid,
    EXECUTOR_ID uuid,
    DEADLINE date,
    MEASURES_COUNT integer not null,
    PENALTIES_RESULT text not null,
    PENALTY_SUM integer not null,
    REIMBURSEMENT integer,
    SOURCE_ID uuid not null,
    COMMENT_ text,
    --
    primary key (ID)
)^
-- end INCIDENTS
-- begin ACT
create table ACT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME text not null,
    CODE integer not null,
    --
    primary key (ID)
)^
-- end ACT
-- begin SOURCE_DICTIONARY
create table SOURCE_DICTIONARY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE integer,
    NAME varchar(4555) not null,
    --
    primary key (ID)
)^
-- end SOURCE_DICTIONARY
-- begin PERIOD
create table PERIOD (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end PERIOD
-- begin COMPLIANCE_RISK
create table COMPLIANCE_RISK (
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
    RISK_CATEGORY_ID uuid,
    SHORT_DESCRIPTION text,
    DETAILED_DESCRIPTION text,
    SOURCE_ID uuid,
    RATING_ID uuid,
    PLAN_EVENT_ID uuid,
    DETECTION_DATE timestamp,
    PLANNED_CLOSE_DATE timestamp,
    EXTENDED_DATE timestamp,
    ACCEPTED_DATE timestamp,
    FINAL_ACCEPTED_DATE timestamp,
    CLOSED_DATE timestamp,
    STATUS integer,
    OWNER_ID uuid,
    INITIATOR varchar(255),
    COMMENT_ varchar(255),
    --
    primary key (ID)
)^
-- end COMPLIANCE_RISK
-- begin COMPLIANCE_POLICY_REQUIREMENT
create table COMPLIANCE_POLICY_REQUIREMENT (
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
    NAME varchar(255),
    OBSERVATION_EVALUATION varchar(50) not null,
    COMMENT_ text,
    COMPLIANCE_POLICY_ID uuid,
    --
    primary key (ID)
)^
-- end COMPLIANCE_POLICY_REQUIREMENT
-- begin PLAN_EVENT
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
)^
-- end PLAN_EVENT
-- begin COMPLIANCE_LAW
create table COMPLIANCE_LAW (
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
    NAME varchar(255) not null,
    INITIATOR varchar(255) not null,
    COMMENT_ varchar(255),
    DUE_DATE date,
    --
    primary key (ID)
)^
-- end COMPLIANCE_LAW
-- begin COMPLAINT_REASON
create table COMPLAINT_REASON (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(1024),
    --
    primary key (ID)
)^
-- end COMPLAINT_REASON
-- begin COMPLIANCE_POLICY
create table COMPLIANCE_POLICY (
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
    INITIATOR varchar(255) not null,
    COMMENT_ varchar(255),
    DUE_DATE date,
    --
    primary key (ID)
)^
-- end COMPLIANCE_POLICY
-- begin APPLICANT_TYPE
create table APPLICANT_TYPE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end APPLICANT_TYPE
-- begin VND
create table VND (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME text not null,
    CODE integer not null,
    --
    primary key (ID)
)^
-- end VND
-- begin CHANNEL
create table CHANNEL (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE integer,
    NAME varchar(1024),
    --
    primary key (ID)
)^
-- end CHANNEL
-- begin TRAINING
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
)^
-- end TRAINING
-- begin RISK_LEVEL
create table RISK_LEVEL (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    CODE integer,
    --
    primary key (ID)
)^
-- end RISK_LEVEL
-- begin INTERNAL_EXTERNAL_FACTOR_ASSESSMENT
create table INTERNAL_EXTERNAL_FACTOR_ASSESSMENT (
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
    INTERNAL_FACTOR varchar(255),
    EXTERNAL_FACTOR varchar(255),
    MEASURE_PLAN_ID_ID uuid,
    RESPONSIBLE_EXECUTOR_ID uuid,
    DEADLINE date,
    SELF_ASSESSMENT_SVK_ID uuid not null,
    --
    primary key (ID)
)^
-- end INTERNAL_EXTERNAL_FACTOR_ASSESSMENT
-- begin MONITORING_CLIENTS_ML_TF_RISKS
create table MONITORING_CLIENTS_ML_TF_RISKS (
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
    NAME varchar(255),
    INITIATOR varchar(255) not null,
    DEADLINE_DATE date,
    COMMENT_ text,
    TOTAL_CLIENTS integer,
    HIGH_RISK_CLIENTS_COUNT integer not null,
    IPDL integer not null,
    HIGH_RISK_ACTIVITY_CLIENTS_COUNT integer not null,
    PROHIBITED_ACTIVITY_CLIENTS_COUNT integer not null,
    HIGH_COUNTRY_RISK_CLIENTS_COUNT integer not null,
    PROHIBITED_COUNTRY_CLIENTS_COUNT integer not null,
    SANCTION_LIST_CLIENTS_COUNT integer not null,
    TOTAL_CLIENTS_FOR_UPDATE_COUNT integer not null,
    UPDATED_CLIENTS_COUNT integer not null,
    NOT_UPDATED_CLIENTS_COUNT integer not null,
    NOT_UPDATED_REASON text,
    --
    primary key (ID)
)^
-- end MONITORING_CLIENTS_ML_TF_RISKS
-- begin COMPLIANCE_LAW_VND
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
)^
-- end COMPLIANCE_LAW_VND
-- begin POLICY_PROCEDURE_ASSESSMENT
create table POLICY_PROCEDURE_ASSESSMENT (
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
    POLICY_COMPLIANCE varchar(255),
    CONTROL_SYSTEM_UPDATE varchar(255),
    MEASURE_PLAN_ID uuid,
    RESPONSIBLE_EXECUTOR_ID uuid,
    DEADLINE date,
    SELF_ASSESSMENT_SVK_ID uuid not null,
    --
    primary key (ID)
)^
-- end POLICY_PROCEDURE_ASSESSMENT
-- begin RESPONSE_TYPE
create table RESPONSE_TYPE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE integer,
    NAME varchar(4000),
    --
    primary key (ID)
)^
-- end RESPONSE_TYPE
-- begin SELF_ASSESSMENT_SVK
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
)^
-- end SELF_ASSESSMENT_SVK
-- begin PLAN_EVENT_FILE_LINK
create table PLAN_EVENT_FILE_LINK (
    PLAN_EVENT_ID uuid,
    FILE_ENTITY_ID uuid,
    primary key (PLAN_EVENT_ID, FILE_ENTITY_ID)
)^
-- end PLAN_EVENT_FILE_LINK
-- begin PLAN_EVENT_FILES
create table PLAN_EVENT_FILES (
    FILE_ENTITY_ID uuid,
    PLAN_EVENT_ID uuid,
    primary key (FILE_ENTITY_ID, PLAN_EVENT_ID)
)^
-- end PLAN_EVENT_FILES
-- begin ACTIVITY_FILES
create table ACTIVITY_FILES (
    FILE_ENTITY_ID uuid,
    ACTIVITY_ID uuid,
    primary key (FILE_ENTITY_ID, ACTIVITY_ID)
)^
-- end ACTIVITY_FILES
-- begin INCIDENT_FILES
create table INCIDENT_FILES (
    INCIDENTS_ID uuid,
    FILE_ENTITY_ID uuid,
    primary key (INCIDENTS_ID, FILE_ENTITY_ID)
)^
-- end INCIDENT_FILES
-- begin ACTIVITY_FILE_LINK
create table ACTIVITY_FILE_LINK (
    ACTIVITY_ID uuid,
    FILE_ENTITY_ID uuid,
    primary key (ACTIVITY_ID, FILE_ENTITY_ID)
)^
-- end ACTIVITY_FILE_LINK
-- begin INCIDENT_DEPARTMENTS
create table INCIDENT_DEPARTMENTS (
    INCIDENTS_ID uuid,
    DEPARTMENT_ID uuid,
    primary key (INCIDENTS_ID, DEPARTMENT_ID)
)^
-- end INCIDENT_DEPARTMENTS
