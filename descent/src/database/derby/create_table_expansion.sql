CREATE TABLE DESCENT.EXPANSION (
    NAME VARCHAR(30) NOT NULL CONSTRAINT DESCENT.EXPANSION_PK PRIMARY KEY,
    MESSAGE_CODE VARCHAR(30) NOT NULL,
    ICON VARCHAR(30));

insert into EXPANSION (NAME, MESSAGE_CODE, ICON)
values ('D2E', 'expansion.d2e',null);
insert into EXPANSION (NAME, MESSAGE_CODE, ICON)
values ('DCK', 'expansion.dck',null);
insert into EXPANSION (NAME, MESSAGE_CODE, ICON)
values ('LotW', 'expansion.lotw','Lair_of_the_Wyrm,jpg');
insert into EXPANSION (NAME, MESSAGE_CODE, ICON)
values ('LoR', 'expansion.lor','Labyrinth_of_Ruin,jpg');
insert into EXPANSION (NAME, MESSAGE_CODE, ICON)
values ('TT', 'expansion.tt','The_Trollfens,jpg');
insert into EXPANSION (NAME, MESSAGE_CODE, ICON)
values ('SoN', 'expansion.son','Shadow_of_Nerekhall,jpg');
insert into EXPANSION (NAME, MESSAGE_CODE, ICON)
values ('MoR', 'expansion.mor','Manor_of_Ravens,jpg');
insert into EXPANSION (NAME, MESSAGE_CODE, ICON)
values ('CotF', 'expansion.cotf',null);
insert into EXPANSION (NAME, MESSAGE_CODE, ICON)
values ('OotO', 'expansion.ooto',null);
insert into EXPANSION (NAME, MESSAGE_CODE, ICON)
values ('CoD', 'expansion.cod',null);
insert into EXPANSION (NAME, MESSAGE_CODE, ICON)
values ('GoD', 'expansion.god',null);
insert into EXPANSION (NAME, MESSAGE_CODE, ICON)
values ('VoD', 'expansion.vod',null);
insert into EXPANSION (NAME, MESSAGE_CODE, ICON)
values ('BotW', 'expansion.botw',null);
