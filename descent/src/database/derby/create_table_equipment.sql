CREATE TABLE DESCENT.EQUIPMENT (
    NAME VARCHAR(30) NOT NULL CONSTRAINT DESCENT.EQUIPMENT_PK PRIMARY KEY,
    MESSAGE_CODE VARCHAR(30) NOT NULL,
    ICON VARCHAR(30) NOT NULL);

insert into EQUIPMENT (NAME, MESSAGE_CODE, ICON)
values ('One Hand', 'equipment.onehand','onehand.png');
insert into EQUIPMENT (NAME, MESSAGE_CODE, ICON)
values ('Two Hands', 'equipment.twohands','twohands.png');
insert into EQUIPMENT (NAME, MESSAGE_CODE, ICON)
values ('Armor', 'equipment.armor','armor.png');
insert into EQUIPMENT (NAME, MESSAGE_CODE, ICON)
values ('Other', 'equipment.other','other.png');
