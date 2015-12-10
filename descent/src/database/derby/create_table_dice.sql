CREATE TABLE DESCENT.DICE (
    NAME VARCHAR(30) NOT NULL CONSTRAINT DESCENT.DICE_PK PRIMARY KEY,
    MESSAGE_CODE VARCHAR(30) NOT NULL,
    DICE_TYPE VARCHAR(30) NOT NULL CONSTRAINT FK_DICE_DICE_TYPE REFERENCES DESCENT.DICE_TYPE);

insert into DICE (NAME, MESSAGE_CODE, DICE_TYPE)
values ('Blue', 'dice.blue','Attack');
insert into DICE (NAME, MESSAGE_CODE, DICE_TYPE)
values ('Red', 'dice.red','Power');
insert into DICE (NAME, MESSAGE_CODE, DICE_TYPE)
values ('Yellow', 'dice.yellow','Power');
insert into DICE (NAME, MESSAGE_CODE, DICE_TYPE)
values ('Green', 'dice.green','Power');
insert into DICE (NAME, MESSAGE_CODE, DICE_TYPE)
values ('Brown', 'dice.brown','Defense');
insert into DICE (NAME, MESSAGE_CODE, DICE_TYPE)
values ('Grey', 'dice.grey','Defense');
insert into DICE (NAME, MESSAGE_CODE, DICE_TYPE)
values ('Black', 'dice.black','Defense');
