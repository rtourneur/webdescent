CREATE TABLE DESCENT.SEARCH (
    NAME VARCHAR(30) NOT NULL,
    EXPANSION VARCHAR(30) NOT NULL CONSTRAINT FK_SEARCH_EXPANSION REFERENCES DESCENT.EXPANSION,
    MESSAGE_CODE VARCHAR(30) NOT NULL,
    ABILITY_CODE VARCHAR(40) NOT NULL,
    ATTACK_TYPE VARCHAR(30) CONSTRAINT FK_SEARCH_ATTACK_TYPE REFERENCES DESCENT.ATTACK_TYPE,
    GOLD DECIMAL(2),
    COUNT DECIMAL(1),
    IMAGE VARCHAR(30) NOT NULL,
    CONSTRAINT SEARCH_PK PRIMARY KEY (NAME, EXPANSION));

insert into SEARCH (NAME, EXPANSION, MESSAGE_CODE, ABILITY_CODE, ATTACK_TYPE, GOLD, COUNT, IMAGE)
values ('Curse Doll', 'D2E', 'search.cursedoll.d2e', 'search.cursedoll.d2e.ability', null, 50, 1, 'cursedoll.d2e.jpg');
insert into SEARCH (NAME, EXPANSION, MESSAGE_CODE, ABILITY_CODE, ATTACK_TYPE, GOLD, COUNT, IMAGE)
values ('Fire Flask', 'D2E', 'search.fireflask.d2e', 'search.fireflask.d2e.ability', 'Ranged', 50, 1, 'fireflask.d2e.jpg');
insert into SEARCH (NAME, EXPANSION, MESSAGE_CODE, ABILITY_CODE, ATTACK_TYPE, GOLD, COUNT, IMAGE)
values ('Health Potion', 'D2E', 'search.healthpotion.d2e', 'search.healthpotion.d2e.ability', null, 25, 3, 'healthpotion.d2e.jpg');
insert into SEARCH (NAME, EXPANSION, MESSAGE_CODE, ABILITY_CODE, ATTACK_TYPE, GOLD, COUNT, IMAGE)
values ('Nothing', 'D2E', 'search.nothing.d2e', 'search.nothing.d2e.ability', null, 0, 1, 'nothing.d2e.jpg');
insert into SEARCH (NAME, EXPANSION, MESSAGE_CODE, ABILITY_CODE, ATTACK_TYPE, GOLD, COUNT, IMAGE)
values ('Power Potion', 'D2E', 'search.powerpotion.d2e', 'search.powerpotion.d2e.ability', null, 50, 1, 'powerpotion.d2e.jpg');
insert into SEARCH (NAME, EXPANSION, MESSAGE_CODE, ABILITY_CODE, ATTACK_TYPE, GOLD, COUNT, IMAGE)
values ('Stamina Potion', 'D2E', 'search.staminapotion.d2e', 'search.staminapotion.d2e.ability', null, 25, 3, 'staminapotion.d2e.jpg');
insert into SEARCH (NAME, EXPANSION, MESSAGE_CODE, ABILITY_CODE, ATTACK_TYPE, GOLD, COUNT, IMAGE)
values ('Treasure Chest', 'D2E', 'search.treasurechest.d2e', 'search.treasurechest.d2e.ability', null, 0, 1, 'treasurechest.d2e.jpg');
insert into SEARCH (NAME, EXPANSION, MESSAGE_CODE, ABILITY_CODE, ATTACK_TYPE, GOLD, COUNT, IMAGE)
values ('Warding Talisman', 'D2E', 'search.wardingtalisman.d2e', 'search.wardingtalisman.d2e.ability', null, 50, 1, 'wardingtalisman.d2e.jpg');
insert into SEARCH (NAME, EXPANSION, MESSAGE_CODE, ABILITY_CODE, ATTACK_TYPE, GOLD, COUNT, IMAGE)
values ('Secret Passage', 'LotW', 'search.secretpassage.lotw', 'search.secretpassage.lotw.ability', null, 0, 1, 'secretpassage.lotw.jpg');
insert into SEARCH (NAME, EXPANSION, MESSAGE_CODE, ABILITY_CODE, ATTACK_TYPE, GOLD, COUNT, IMAGE)
values ('Secret Passage', 'TT', 'search.secretpassage.tt', 'search.secretpassage.tt.ability', null, 0, 1, 'secretpassage.tt.jpg');

