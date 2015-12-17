CREATE TABLE DESCENT.MONSTER_ATTACK (
    MONSTER_GROUP VARCHAR(30) NOT NULL,
    EXPANSION VARCHAR(30) NOT NULL,
    ACT VARCHAR(30) NOT NULL,
    MONSTER_TYPE VARCHAR(30) NOT NULL,
    DICE VARCHAR(30) NOT NULL CONSTRAINT FK_MONSTER_ATTACK_DICE REFERENCES DESCENT.DICE,
    INDEX DECIMAL(1) NOT NULL,
    CONSTRAINT FK_MONSTER_ATTACK_MONSTER_STAT FOREIGN KEY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE) REFERENCES DESCENT.MONSTER_STAT,
    CONSTRAINT MONSTER_ATTACK_PK PRIMARY KEY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX));

insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Goblin Archer', 'D2E', 'Act1', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Goblin Archer', 'D2E', 'Act1', 'Master', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Goblin Archer', 'D2E', 'Act1', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Goblin Archer', 'D2E', 'Act1', 'Minion', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Goblin Archer', 'D2E', 'Act2', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Goblin Archer', 'D2E', 'Act2', 'Master', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Goblin Archer', 'D2E', 'Act2', 'Master', 'Yellow', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Goblin Archer', 'D2E', 'Act2', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Goblin Archer', 'D2E', 'Act2', 'Minion', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Zombie', 'D2E', 'Act1', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Zombie', 'D2E', 'Act1', 'Master', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Zombie', 'D2E', 'Act1', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Zombie', 'D2E', 'Act1', 'Minion', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Zombie', 'D2E', 'Act2', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Zombie', 'D2E', 'Act2', 'Master', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Zombie', 'D2E', 'Act2', 'Master', 'Yellow', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Zombie', 'D2E', 'Act2', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Zombie', 'D2E', 'Act2', 'Minion', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Cave Spider', 'D2E', 'Act1', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Cave Spider', 'D2E', 'Act1', 'Master', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Cave Spider', 'D2E', 'Act1', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Cave Spider', 'D2E', 'Act1', 'Minion', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Cave Spider', 'D2E', 'Act2', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Cave Spider', 'D2E', 'Act2', 'Master', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Cave Spider', 'D2E', 'Act2', 'Master', 'Yellow', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Cave Spider', 'D2E', 'Act2', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Cave Spider', 'D2E', 'Act2', 'Minion', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Cave Spider', 'D2E', 'Act2', 'Minion', 'Yellow', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act1', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act1', 'Master', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act1', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act1', 'Minion', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act2', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act2', 'Master', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act2', 'Master', 'Yellow', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act2', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Flesh Moulders', 'D2E', 'Act2', 'Minion', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Barghest', 'D2E', 'Act1', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Barghest', 'D2E', 'Act1', 'Master', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Barghest', 'D2E', 'Act1', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Barghest', 'D2E', 'Act1', 'Minion', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Barghest', 'D2E', 'Act2', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Barghest', 'D2E', 'Act2', 'Master', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Barghest', 'D2E', 'Act2', 'Master', 'Yellow', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Barghest', 'D2E', 'Act2', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Barghest', 'D2E', 'Act2', 'Minion', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act1', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act1', 'Master', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act1', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act1', 'Minion', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act2', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act2', 'Master', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act2', 'Master', 'Red', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act2', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act2', 'Minion', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Ettin', 'D2E', 'Act2', 'Minion', 'Red', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act1', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act1', 'Master', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act1', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act1', 'Minion', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act2', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act2', 'Master', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act2', 'Master', 'Yellow', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act2', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act2', 'Minion', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Elemental', 'D2E', 'Act2', 'Minion', 'Yellow', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act1', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act1', 'Master', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act1', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act1', 'Minion', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act2', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act2', 'Master', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act2', 'Master', 'Yellow', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act2', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act2', 'Minion', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Merriod', 'D2E', 'Act2', 'Minion', 'Yellow', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act1', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act1', 'Master', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act1', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act1', 'Minion', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act2', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act2', 'Master', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act2', 'Master', 'Red', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act2', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act2', 'Minion', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Shadow Dragon', 'D2E', 'Act2', 'Minion', 'Red', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Fire Imp', 'LotW', 'Act1', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Fire Imp', 'LotW', 'Act1', 'Master', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Fire Imp', 'LotW', 'Act1', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Fire Imp', 'LotW', 'Act1', 'Minion', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Fire Imp', 'LotW', 'Act2', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Fire Imp', 'LotW', 'Act2', 'Master', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Fire Imp', 'LotW', 'Act2', 'Master', 'Yellow', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Fire Imp', 'LotW', 'Act2', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Fire Imp', 'LotW', 'Act2', 'Minion', 'Yellow', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'Master', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'Minion', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Master', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Master', 'Red', 2);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Master', 'Yellow', 3);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Minion', 'Blue', 1);
insert into MONSTER_ATTACK (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, DICE, INDEX)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Minion', 'Red', 2);
