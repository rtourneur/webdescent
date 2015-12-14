CREATE TABLE DESCENT.CONDITION (
    NAME VARCHAR(30) NOT NULL CONSTRAINT DESCENT.CONDITION_PK PRIMARY KEY,
    MESSAGE_CODE VARCHAR(30) NOT NULL,
    RULE_CODE VARCHAR(30) NOT NULL,
    EXPANSION VARCHAR(30) NOT NULL CONSTRAINT FK_CONDITION_EXPANSION REFERENCES DESCENT.EXPANSION,
    IMAGE VARCHAR(30) NOT NULL);

insert into CONDITION (NAME, MESSAGE_CODE, RULE_CODE, EXPANSION, IMAGE)
values ('Diseased', 'condition.diseased', 'condition.diseased.rule', 'D2E', 'diseased.png');
insert into CONDITION (NAME, MESSAGE_CODE, RULE_CODE, EXPANSION, IMAGE)
values ('Immobilized', 'condition.immobilized', 'condition.immobilized.rule', 'D2E', 'immobilized.png');
insert into CONDITION (NAME, MESSAGE_CODE, RULE_CODE, EXPANSION, IMAGE)
values ('Poisonned', 'condition.poisonned', 'condition.poisonned.rule', 'D2E', 'poisonned.png');
insert into CONDITION (NAME, MESSAGE_CODE, RULE_CODE, EXPANSION, IMAGE)
values ('Stunned', 'condition.stunned', 'condition.stunned.rule', 'D2E', 'stunned.png');
insert into CONDITION (NAME, MESSAGE_CODE, RULE_CODE, EXPANSION, IMAGE)
values ('Burning', 'condition.burning', 'condition.burning.rule', 'LotW', 'burning.png');
insert into CONDITION (NAME, MESSAGE_CODE, RULE_CODE, EXPANSION, IMAGE)
values ('Cursed', 'condition.cursed', 'condition.cursed.rule', 'LoR', 'cursed.png');
insert into CONDITION (NAME, MESSAGE_CODE, RULE_CODE, EXPANSION, IMAGE)
values ('Weakened', 'condition.weakened', 'condition.weakened.rule', 'TT', 'weakened.png');
insert into CONDITION (NAME, MESSAGE_CODE, RULE_CODE, EXPANSION, IMAGE)
values ('Bleeding', 'condition.bleeding', 'condition.bleeding.rule', 'SoN', 'bleeding.png');
insert into CONDITION (NAME, MESSAGE_CODE, RULE_CODE, EXPANSION, IMAGE)
values ('Doomed', 'condition.doomed', 'condition.doomed.rule', 'MoR', 'doomed.png');
