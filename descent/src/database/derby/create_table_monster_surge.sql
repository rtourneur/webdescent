CREATE TABLE DESCENT.MONSTER_SURGE (
    MONSTER_GROUP VARCHAR(30) NOT NULL,
    EXPANSION VARCHAR(30) NOT NULL,
    ACT VARCHAR(30) NOT NULL,
    MONSTER_TYPE VARCHAR(30) NOT NULL,
    SURGE INTEGER NOT NULL CONSTRAINT FK_MONSTER_SURGE_SURGE REFERENCES DESCENT.SURGE,
    INDEX DECIMAL(1) NOT NULL,
    CONSTRAINT FK_MONSTER_SURGE_MONSTER_STAT FOREIGN KEY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE) REFERENCES DESCENT.MONSTER_STAT,
    CONSTRAINT MONSTER_SURGE_PK PRIMARY KEY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX));

insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Goblin Archer', 'D2E', 'Act1', 'Master', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Goblin Archer', 'D2E', 'Act1', 'Master', 12, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Goblin Archer', 'D2E', 'Act1', 'Minion', 1, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Goblin Archer', 'D2E', 'Act1', 'Minion', 11, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Goblin Archer', 'D2E', 'Act2', 'Master', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Goblin Archer', 'D2E', 'Act2', 'Master', 13, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Goblin Archer', 'D2E', 'Act2', 'Minion', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Goblin Archer', 'D2E', 'Act2', 'Minion', 12, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Zombie', 'D2E', 'Act1', 'Master', 1, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Zombie', 'D2E', 'Act1', 'Master', 24, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Zombie', 'D2E', 'Act1', 'Minion', 1, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Zombie', 'D2E', 'Act1', 'Minion', 24, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Zombie', 'D2E', 'Act2', 'Master', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Zombie', 'D2E', 'Act2', 'Master', 24, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Zombie', 'D2E', 'Act2', 'Minion', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Zombie', 'D2E', 'Act2', 'Minion', 24, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Cave Spider', 'D2E', 'Act1', 'Master', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Cave Spider', 'D2E', 'Act1', 'Master', 21, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Cave Spider', 'D2E', 'Act1', 'Minion', 1, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Cave Spider', 'D2E', 'Act1', 'Minion', 21, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Cave Spider', 'D2E', 'Act2', 'Master', 1, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Cave Spider', 'D2E', 'Act2', 'Master', 2, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Cave Spider', 'D2E', 'Act2', 'Master', 21, 3);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Cave Spider', 'D2E', 'Act2', 'Minion', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Cave Spider', 'D2E', 'Act2', 'Minion', 21, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act1', 'Master', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act1', 'Master', 29, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act1', 'Minion', 1, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act1', 'Minion', 28, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act2', 'Master', 3, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act2', 'Master', 30, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act2', 'Minion', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act2', 'Minion', 29, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Barghest', 'D2E', 'Act1', 'Master', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Barghest', 'D2E', 'Act1', 'Minion', 1, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Barghest', 'D2E', 'Act2', 'Master', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Barghest', 'D2E', 'Act2', 'Minion', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Ettin', 'D2E', 'Act1', 'Master', 3, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Ettin', 'D2E', 'Act1', 'Minion', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Ettin', 'D2E', 'Act2', 'Master', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Ettin', 'D2E', 'Act2', 'Minion', 1, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Merriod', 'D2E', 'Act1', 'Master', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Merriod', 'D2E', 'Act1', 'Master', 20, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Merriod', 'D2E', 'Act1', 'Minion', 1, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Merriod', 'D2E', 'Act1', 'Minion', 20, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Merriod', 'D2E', 'Act2', 'Master', 3, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Merriod', 'D2E', 'Act2', 'Master', 20, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Merriod', 'D2E', 'Act2', 'Minion', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Merriod', 'D2E', 'Act2', 'Minion', 20, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act1', 'Master', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act1', 'Master', 31, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act1', 'Minion', 1, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act2', 'Master', 3, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act2', 'Master', 31, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act2', 'Minion', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Fire Imp', 'LotW', 'Act1', 'Master', 1, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Fire Imp', 'LotW', 'Act1', 'Master', 25, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Fire Imp', 'LotW', 'Act1', 'Minion', 11, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Fire Imp', 'LotW', 'Act1', 'Minion', 25, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Fire Imp', 'LotW', 'Act2', 'Master', 1, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Fire Imp', 'LotW', 'Act2', 'Master', 25, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Fire Imp', 'LotW', 'Act2', 'Minion', 11, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Fire Imp', 'LotW', 'Act2', 'Minion', 25, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'Master', 1, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'Master', 31, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'Minion', 1, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Master', 2, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Master', 31, 2);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Minion', 1, 1);
insert into MONSTER_SURGE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SURGE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Minion', 1, 2);
