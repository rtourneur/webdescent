CREATE TABLE DESCENT.MONSTER_STAT (
    MONSTER_GROUP VARCHAR(30) NOT NULL,
    EXPANSION VARCHAR(30) NOT NULL,
    ACT VARCHAR(30) NOT NULL,
    MONSTER_TYPE VARCHAR(30) NOT NULL CONSTRAINT FK_MONSTER_STAT_MONSTER_TYPE REFERENCES DESCENT.MONSTER_TYPE,
    SPEED DECIMAL(1),
    HEALTH DECIMAL(2),
    CONSTRAINT FK_MONSTER_STAT_MONSTER_GROUP_ACT FOREIGN KEY (MONSTER_GROUP, EXPANSION, ACT) REFERENCES DESCENT.MONSTER_GROUP_ACT,
    CONSTRAINT MONSTER_STAT_PK PRIMARY KEY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE));

insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Goblin Archer', 'D2E', 'Act1', 'Master', 5, 4);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Goblin Archer', 'D2E', 'Act1', 'Minion', 5, 2);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Goblin Archer', 'D2E', 'Act2', 'Master', 5, 6);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Goblin Archer', 'D2E', 'Act2', 'Minion', 5, 4);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Zombie', 'D2E', 'Act1', 'Master', 3, 6);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Zombie', 'D2E', 'Act1', 'Minion', 3, 3);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Zombie', 'D2E', 'Act2', 'Master', 3, 9);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Zombie', 'D2E', 'Act2', 'Minion', 3, 5);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Cave Spider', 'D2E', 'Act1', 'Master', 4, 5);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Cave Spider', 'D2E', 'Act1', 'Minion', 4, 3);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Cave Spider', 'D2E', 'Act2', 'Master', 4, 7);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Cave Spider', 'D2E', 'Act2', 'Minion', 4, 5);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Flesh Moulders', 'D2E', 'Act1', 'Master', 4, 5);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Flesh Moulders', 'D2E', 'Act1', 'Minion', 4, 4);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Flesh Moulders', 'D2E', 'Act2', 'Master', 4, 7);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Flesh Moulders', 'D2E', 'Act2', 'Minion', 4, 5);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Barghest', 'D2E', 'Act1', 'Master', 4, 5);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Barghest', 'D2E', 'Act1', 'Minion', 4, 4);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Barghest', 'D2E', 'Act2', 'Master', 4, 8);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Barghest', 'D2E', 'Act2', 'Minion', 4, 6);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Ettin', 'D2E', 'Act1', 'Master', 3, 8);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Ettin', 'D2E', 'Act1', 'Minion', 3, 5);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Ettin', 'D2E', 'Act2', 'Master', 3, 9);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Ettin', 'D2E', 'Act2', 'Minion', 3, 7);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Elemental', 'D2E', 'Act1', 'Master', 4, 6);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Elemental', 'D2E', 'Act1', 'Minion', 4, 4);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Elemental', 'D2E', 'Act2', 'Master', 4, 10);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Elemental', 'D2E', 'Act2', 'Minion', 4, 8);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Merriod', 'D2E', 'Act1', 'Master', 3, 7);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Merriod', 'D2E', 'Act1', 'Minion', 3, 5);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Merriod', 'D2E', 'Act2', 'Master', 3, 9);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Merriod', 'D2E', 'Act2', 'Minion', 3, 7);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Shadow Dragon', 'D2E', 'Act1', 'Master', 3, 9);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Shadow Dragon', 'D2E', 'Act1', 'Minion', 3, 6);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Shadow Dragon', 'D2E', 'Act2', 'Master', 3, 10);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Shadow Dragon', 'D2E', 'Act2', 'Minion', 3, 8);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Fire Imp', 'LotW', 'Act1', 'Master', 5, 4);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Fire Imp', 'LotW', 'Act1', 'Minion', 5, 2);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Fire Imp', 'LotW', 'Act2', 'Master', 5, 6);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Fire Imp', 'LotW', 'Act2', 'Minion', 5, 4);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'Master', 4, 8);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'Minion', 4, 5);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Master', 4, 9);
insert into MONSTER_STAT (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, SPEED, HEALTH)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Minion', 4, 6);
