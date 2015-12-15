CREATE TABLE DESCENT.SURGE (
    ID INTEGER NOT NULL CONSTRAINT DESCENT.SURGE_PK PRIMARY KEY,
    RULE_CODE VARCHAR(30) NOT NULL,
    SURGE DECIMAL(1) NOT NULL,
    DAMAGE DECIMAL(1),
    RANGE DECIMAL(1),
    ABILITY VARCHAR(30) CONSTRAINT FK_SURGE_ABILITY REFERENCES DESCENT.ABILITY,
    ABILITY_VALUE DECIMAL(1));

insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (1, 'surge.1', 1, 1, null , null, null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (2, 'surge.2', 1, 2, null , null, null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (3, 'surge.3', 2, 2, null , null, null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (4, 'surge.4', 2, 3, null , null, null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (5, 'surge.5', 2, 4, null , null, null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (6, 'surge.6', 2, 5, null , null, null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (7, 'surge.7', 3, 5, null , null, null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (8, 'surge.8', 1, 1, 1 , null, null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (9, 'surge.9', 1, 1, 2 , null, null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (10, 'surge.10', 2, 3, 1 , null, null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (11, 'surge.11', 1, null, 1 , null, null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (12, 'surge.12', 1, null, 2 , null, null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (13, 'surge.13', 1, null, 3 , null, null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (14, 'surge.14', 1, null, null , 'Pierce', 1);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (15, 'surge.15', 1, null, null , 'Pierce', 2);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (16, 'surge.16', 1, null, null , 'Pierce', 3);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (17, 'surge.17', 1, null, null , 'Pierce', 4);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (18, 'surge.18', 1, null, null , 'Stun', null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (19, 'surge.19', 2, 2, null , 'Stun', null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (20, 'surge.20', 1, null, null , 'Immobilize', null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (21, 'surge.21', 1, null, null , 'Poison', null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (22, 'surge.22', 1, 1, null , 'Poison', null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (23, 'surge.23', 2, null, null , 'Poison', null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (24, 'surge.24', 1, null, null , 'Disease', null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (25, 'surge.25', 1, null, null , 'Burn', null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (26, 'surge.26', 1, null, null , 'Curse', null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (27, 'surge.27', 1, null, null , 'Blast', null);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (28, 'surge.28', 1, null, null , 'Mend', 1);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (29, 'surge.29', 1, null, null , 'Mend', 2);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (30, 'surge.30', 1, null, null , 'Mend', 3);
insert into SURGE (ID, RULE_CODE, SURGE, DAMAGE, RANGE, ABILITY, ABILITY_VALUE)
values (31, 'surge.31', 1, null, null , 'Fire Breath', null);
