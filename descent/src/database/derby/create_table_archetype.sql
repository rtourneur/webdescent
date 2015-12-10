CREATE TABLE DESCENT.ARCHETYPE (
    NAME VARCHAR(30) NOT NULL CONSTRAINT DESCENT.ARCHETYPE_PK PRIMARY KEY,
    MESSAGE_CODE VARCHAR(30) NOT NULL,
    ICON VARCHAR(30) NOT NULL);

insert into ARCHETYPE (NAME, MESSAGE_CODE, ICON)
values ('Warrior', 'archetype.warrior','warrior.png');
insert into ARCHETYPE (NAME, MESSAGE_CODE, ICON)
values ('Healer', 'archetype.healer','healer.png');
insert into ARCHETYPE (NAME, MESSAGE_CODE, ICON)
values ('Mage', 'archetype.mage','mage.png');
insert into ARCHETYPE (NAME, MESSAGE_CODE, ICON)
values ('Scout', 'archetype.scout','scout.png');
