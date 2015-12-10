CREATE TABLE DESCENT.ATTACK_TYPE (
    NAME VARCHAR(30) NOT NULL CONSTRAINT DESCENT.ATTACK_TYPE_PK PRIMARY KEY,
    MESSAGE_CODE VARCHAR(30) NOT NULL,
    ICON VARCHAR(30) NOT NULL);

insert into ATTACK_TYPE (NAME, MESSAGE_CODE, ICON)
values ('Melee', 'attacktype.melee','melee.png');
insert into ATTACK_TYPE (NAME, MESSAGE_CODE, ICON)
values ('Ranged', 'attacktype.ranged','ranged.png');

