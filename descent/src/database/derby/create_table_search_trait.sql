CREATE TABLE DESCENT.SEARCH_TRAIT (
    SEARCH VARCHAR(30) NOT NULL ,
    EXPANSION VARCHAR(30) NOT NULL,
    TRAIT VARCHAR(30) NOT NULL CONSTRAINT FK_SEARCH_TRAIT_TRAIT REFERENCES DESCENT.TRAIT,
    CONSTRAINT FK_SEARCH_TRAIT_SEARCH FOREIGN KEY (SEARCH, EXPANSION) REFERENCES DESCENT.SEARCH,
    CONSTRAINT SEARCH_TRAIT_PK PRIMARY KEY (SEARCH, EXPANSION, TRAIT));

insert into SEARCH_TRAIT (SEARCH, EXPANSION, TRAIT)
values ('Curse Doll', 'D2E', 'Item');
insert into SEARCH_TRAIT (SEARCH, EXPANSION, TRAIT)
values ('Fire Flask', 'D2E', 'Item');
insert into SEARCH_TRAIT (SEARCH, EXPANSION, TRAIT)
values ('Health Potion', 'D2E', 'Potion');
insert into SEARCH_TRAIT (SEARCH, EXPANSION, TRAIT)
values ('Nothing', 'D2E', 'Special');
insert into SEARCH_TRAIT (SEARCH, EXPANSION, TRAIT)
values ('Power Potion', 'D2E', 'Potion');
insert into SEARCH_TRAIT (SEARCH, EXPANSION, TRAIT)
values ('Stamina Potion', 'D2E', 'Potion');
insert into SEARCH_TRAIT (SEARCH, EXPANSION, TRAIT)
values ('Treasure Chest', 'D2E', 'Special');
insert into SEARCH_TRAIT (SEARCH, EXPANSION, TRAIT)
values ('Warding Talisman', 'D2E', 'Item');
insert into SEARCH_TRAIT (SEARCH, EXPANSION, TRAIT)
values ('Secret Passage', 'LotW', 'Special');
insert into SEARCH_TRAIT (SEARCH, EXPANSION, TRAIT)
values ('Secret Passage', 'TT', 'Special');
