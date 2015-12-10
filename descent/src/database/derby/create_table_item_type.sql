CREATE TABLE DESCENT.ITEM_TYPE (
    NAME VARCHAR(30) NOT NULL CONSTRAINT DESCENT.ITEM_TYPE_PK PRIMARY KEY,
    MESSAGE_CODE VARCHAR(30) NOT NULL);

insert into ITEM_TYPE (NAME, MESSAGE_CODE)
values ('Act1', 'itemtype.act1');
insert into ITEM_TYPE (NAME, MESSAGE_CODE)
values ('Act2', 'itemtype.act2');
insert into ITEM_TYPE (NAME, MESSAGE_CODE)
values ('Class', 'itemtype.class');
insert into ITEM_TYPE (NAME, MESSAGE_CODE)
values ('Relic', 'itemtype.relic');
