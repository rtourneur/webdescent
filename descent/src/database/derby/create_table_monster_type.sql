CREATE TABLE DESCENT.MONSTER_TYPE (
    NAME VARCHAR(30) NOT NULL CONSTRAINT DESCENT.MONSTER_TYPE_PK PRIMARY KEY,
    MESSAGE_CODE VARCHAR(30) NOT NULL);

insert into MONSTER_TYPE (NAME, MESSAGE_CODE)
values ('Master', 'monstertype.master');
insert into MONSTER_TYPE (NAME, MESSAGE_CODE)
values ('Minion', 'monstertype.minion');
insert into MONSTER_TYPE (NAME, MESSAGE_CODE)
values ('Lieutenant', 'monstertype.lieutenant');
