--create tb_account
DROP TABLE IF EXISTS TB_ACCOUNT;
CREATE TABLE TB_ACCOUNT(
USER_ID VARCHAR(10) COMMENT '用户ID',
USER_NAME VARCHAR(50) COMMENT '用户名',
PWD VARCHAR(50) COMMENT '密码',
PHONE VARCHAR(11) COMMENT '手机号码',
EMAIL VARCHAR(50) COMMENT '邮件',
ROLE_ID VARCHAR(10) COMMENT '角色ID',
IND_STATUS VARCHAR(1) COMMENT '状态',
CONSTRAINT pk_userId PRIMARY KEY (USER_ID)
)charset=utf8mb4;
--create tb_sequence
DROP TABLE IF EXISTS TB_SEQUENCE;
CREATE TABLE TB_SEQUENCE(
SEQ_NAME VARCHAR(50) COMMENT '序号名',
INIT_VALUE VARCHAR(10) COMMENT '初始值',
MAX_VALUE VARCHAR(10) COMMENT '最大值',
CURR_VALUE VARCHAR(10) COMMENT '当前值',
STEP VARCHAR(10) COMMENT '步长',
IND_STATUS VARCHAR(1) COMMENT '状态',
CONSTRAINT pk_seqName PRIMARY KEY (SEQ_NAME)
)charset=utf8mb4;
--create tb_role
DROP TABLE IF EXISTS TB_ROLE;
CREATE TABLE TB_ROLE(
ROLE_ID VARCHAR(10) COMMENT '角色ID',
ROLE_NAME VARCHAR(50) COMMENT '角色名',
IND_STATUS VARCHAR(1) COMMENT '状态',
CONSTRAINT pk_roleId PRIMARY KEY (ROLE_ID)
)charset=utf8mb4;
--create tb_permission
DROP TABLE IF EXISTS TB_PERMISSION;
CREATE TABLE TB_PERMISSION(
ROLE_ID VARCHAR(10) COMMENT '角色ID',
MENUS VARCHAR(1000) COMMENT '菜单ID集合',
IND_STATUS VARCHAR(1) COMMENT '状态',
CONSTRAINT pk_roleId PRIMARY KEY (ROLE_ID)
)charset=utf8mb4;
--create tb_menu
DROP TABLE IF EXISTS TB_MENU;
CREATE TABLE TB_MENU(
MENU_ID VARCHAR(10) COMMENT '菜单ID',
MENU_NAME VARCHAR(50) COMMENT '菜单名',
PARENT_MENU_ID VARCHAR(10) COMMENT '父菜单ID',
IND_STATUS VARCHAR(1) COMMENT '状态',
CONSTRAINT pk_menuId PRIMARY KEY (MENU_ID)
)charset=utf8mb4;
--create root user and role id
insert into TB_ROLE (ROLE_ID, ROLE_NAME, IND_STATUS) VALUES ('0000000000', 'root', '1');
