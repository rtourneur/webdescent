CREATE TABLE DESCENT.MONSTER_SIZE (
    NAME VARCHAR(30) NOT NULL CONSTRAINT DESCENT.MONSTER_SIZE_PK PRIMARY KEY,
    MESSAGE_CODE VARCHAR(30) NOT NULL);

insert into MONSTER_SIZE (NAME, MESSAGE_CODE)
values ('Small', 'monstersize.small');
insert into MONSTER_SIZE (NAME, MESSAGE_CODE)
values ('Medium', 'monstersize.medium');
insert into MONSTER_SIZE (NAME, MESSAGE_CODE)
values ('Huge', 'monstersize.huge');
insert into MONSTER_SIZE (NAME, MESSAGE_CODE)
values ('Massive', 'monstersize.massive');
