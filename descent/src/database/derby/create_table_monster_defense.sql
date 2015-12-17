CREATE TABLE DESCENT.MONSTER_DEFENSE (
    MONSTER_GROUP VARCHAR(30) NOT NULL,
    EXPANSION VARCHAR(30) NOT NULL,
    ACT VARCHAR(30) NOT NULL,
    MONSTER_TYPE VARCHAR(30) NOT NULL,
    DICE VARCHAR(30) NOT NULL CONSTRAINT FK_MONSTER_DEFENSE_DICE REFERENCES DESCENT.DICE,
    INDEX DECIMAL(1) NOT NULL,
    CONSTRAINT FK_MONSTER_DEFENSE_MONSTER_STAT FOREIGN KEY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE) REFERENCES DESCENT.MONSTER_STAT,
    CONSTRAINT MONSTER_DEFENSE_PK PRIMARY KEY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX));

insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Goblin Archer', 'D2E', 'Act1', 'Master', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Goblin Archer', 'D2E', 'Act1', 'Minion', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Goblin Archer', 'D2E', 'Act2', 'Master', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Goblin Archer', 'D2E', 'Act2', 'Minion', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Zombie', 'D2E', 'Act1', 'Master', 'Brown', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Zombie', 'D2E', 'Act1', 'Minion', 'Brown', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Zombie', 'D2E', 'Act2', 'Master', 'Brown', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Zombie', 'D2E', 'Act2', 'Minion', 'Brown', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Cave Spider', 'D2E', 'Act1', 'Master', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Cave Spider', 'D2E', 'Act1', 'Minion', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Cave Spider', 'D2E', 'Act2', 'Master', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Cave Spider', 'D2E', 'Act2', 'Minion', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act1', 'Master', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act1', 'Minion', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act2', 'Master', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act2', 'Master', 'Brown', 2);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act2', 'Minion', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act2', 'Minion', 'Brown', 2);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Barghest', 'D2E', 'Act1', 'Master', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Barghest', 'D2E', 'Act1', 'Minion', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Barghest', 'D2E', 'Act2', 'Master', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Barghest', 'D2E', 'Act2', 'Minion', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act1', 'Master', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act1', 'Master', 'Grey', 2);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act1', 'Minion', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act1', 'Minion', 'Grey', 2);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act2', 'Master', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act2', 'Master', 'Grey', 2);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act2', 'Minion', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act2', 'Minion', 'Grey', 2);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act1', 'Master', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act1', 'Minion', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act2', 'Master', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act2', 'Master', 'Brown', 2);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act2', 'Minion', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act2', 'Minion', 'Brown', 2);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act1', 'Master', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act1', 'Minion', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act2', 'Master', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act2', 'Master', 'Grey', 2);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act2', 'Minion', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act2', 'Minion', 'Grey', 2);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act1', 'Master', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act1', 'Master', 'Grey', 2);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act1', 'Minion', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act1', 'Minion', 'Grey', 2);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act2', 'Master', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act2', 'Master', 'Grey', 2);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act2', 'Minion', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act2', 'Minion', 'Grey', 2);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Fire Imp', 'LotW', 'Act1', 'Master', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Fire Imp', 'LotW', 'Act1', 'Minion', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Fire Imp', 'LotW', 'Act2', 'Master', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Fire Imp', 'LotW', 'Act2', 'Minion', 'Grey', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'Master', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'Minion', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Master', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Master', 'Brown', 2);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Minion', 'Black', 1);
insert into MONSTER_DEFENSE (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Minion', 'Grey', 2);
