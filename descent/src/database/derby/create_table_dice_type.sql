CREATE TABLE DESCENT.DICE_TYPE (
    NAME VARCHAR(30) NOT NULL CONSTRAINT DESCENT.DICE_TYPE_PK PRIMARY KEY,
    MESSAGE_CODE VARCHAR(30) NOT NULL);

insert into DICE_TYPE (NAME, MESSAGE_CODE)
values ('Attack', 'dicetype.attack');
insert into DICE_TYPE (NAME, MESSAGE_CODE)
values ('Power', 'dicetype.power');
insert into DICE_TYPE (NAME, MESSAGE_CODE)
values ('Defense', 'dicetype.defense');"

