CREATE TABLE DESCENT.ATTRIBUTE (
    NAME VARCHAR(30) NOT NULL CONSTRAINT DESCENT.ATTRIBUTE_PK PRIMARY KEY,
    MESSAGE_CODE VARCHAR(30) NOT NULL,
    ICON VARCHAR(30) NOT NULL);

insert into ATTRIBUTE (NAME, MESSAGE_CODE, ICON)
values ('Might', 'attribute.might','might.png');
insert into ATTRIBUTE (NAME, MESSAGE_CODE, ICON)
values ('Knowledge', 'attribute.knowledge','knowledge.png');
insert into ATTRIBUTE (NAME, MESSAGE_CODE, ICON)
values ('Willpower', 'attribute.willpower','willpower.png');
insert into ATTRIBUTE (NAME, MESSAGE_CODE, ICON)
values ('Awareness', 'attribute.awareness','awareness.png');
