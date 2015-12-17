CREATE TABLE DESCENT.MONSTER_ABILITY (
    MONSTER_GROUP VARCHAR(30) NOT NULL,
    EXPANSION VARCHAR(30) NOT NULL,
    ACT VARCHAR(30) NOT NULL,
    MONSTER_TYPE VARCHAR(30) NOT NULL,
    ABILITY VARCHAR(30) NOT NULL CONSTRAINT FK_MONSTER_ABILITY_ABILITY REFERENCES DESCENT.ABILITY,
    VALUE DECIMAL(1),
    ACTION BOOLEAN,
    CONSTRAINT FK_MONSTER_ABILITY_MONSTER_STAT FOREIGN KEY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE) REFERENCES DESCENT.MONSTER_STAT,
    CONSTRAINT MONSTER_ABILITY_PK PRIMARY KEY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY));

insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Goblin Archer', 'D2E', 'Act1', 'Master', 'Scamper', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Goblin Archer', 'D2E', 'Act1', 'Minion', 'Scamper', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Goblin Archer', 'D2E', 'Act1', 'Minion', 'Cowardly', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Goblin Archer', 'D2E', 'Act2', 'Master', 'Scamper', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Goblin Archer', 'D2E', 'Act2', 'Minion', 'Scamper', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Goblin Archer', 'D2E', 'Act2', 'Minion', 'Cowardly', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Zombie', 'D2E', 'Act1', 'Master', 'Shambling', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Zombie', 'D2E', 'Act1', 'Master', 'Grab', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Zombie', 'D2E', 'Act1', 'Minion', 'Shambling', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Zombie', 'D2E', 'Act2', 'Master', 'Shambling', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Zombie', 'D2E', 'Act2', 'Master', 'Grab', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Zombie', 'D2E', 'Act2', 'Minion', 'Shambling', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Cave Spider', 'D2E', 'Act1', 'Master', 'Web', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Cave Spider', 'D2E', 'Act2', 'Master', 'Web', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Flesh Moulders', 'D2E', 'Act1', 'Master', 'Heal', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Flesh Moulders', 'D2E', 'Act2', 'Master', 'Heal', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Barghest', 'D2E', 'Act1', 'Master', 'Howl', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Barghest', 'D2E', 'Act1', 'Master', 'Night Stalker', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Barghest', 'D2E', 'Act1', 'Minion', 'Howl', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Barghest', 'D2E', 'Act2', 'Master', 'Howl', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Barghest', 'D2E', 'Act2', 'Master', 'Night Stalker', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Barghest', 'D2E', 'Act2', 'Minion', 'Howl', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Ettin', 'D2E', 'Act1', 'Master', 'Reach', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Ettin', 'D2E', 'Act1', 'Master', 'Throw', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Ettin', 'D2E', 'Act1', 'Minion', 'Reach', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Ettin', 'D2E', 'Act2', 'Master', 'Reach', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Ettin', 'D2E', 'Act2', 'Master', 'Throw', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Ettin', 'D2E', 'Act2', 'Minion', 'Reach', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act1', 'Master', 'Fire', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act1', 'Master', 'Water', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act1', 'Master', 'Earth', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act1', 'Master', 'Air', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act1', 'Minion', 'Fire', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act1', 'Minion', 'Water', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act1', 'Minion', 'Earth', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act1', 'Minion', 'Air', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act2', 'Master', 'Fire', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act2', 'Master', 'Water', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act2', 'Master', 'Earth', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act2', 'Master', 'Air', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act2', 'Minion', 'Fire', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act2', 'Minion', 'Water', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act2', 'Minion', 'Earth', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Elemental', 'D2E', 'Act2', 'Minion', 'Air', null, true);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Merriod', 'D2E', 'Act1', 'Master', 'Reach', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Merriod', 'D2E', 'Act1', 'Master', 'Flail', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Merriod', 'D2E', 'Act1', 'Minion', 'Reach', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Merriod', 'D2E', 'Act2', 'Master', 'Reach', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Merriod', 'D2E', 'Act2', 'Master', 'Flail', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Merriod', 'D2E', 'Act2', 'Minion', 'Reach', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Shadow Dragon', 'D2E', 'Act1', 'Master', 'Shadow', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Shadow Dragon', 'D2E', 'Act1', 'Minion', 'Shadow', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Shadow Dragon', 'D2E', 'Act2', 'Master', 'Shadow', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Shadow Dragon', 'D2E', 'Act2', 'Minion', 'Shadow', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Fire Imp', 'LotW', 'Act1', 'Master', 'Flame Fiend', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Fire Imp', 'LotW', 'Act1', 'Master', 'Combustible', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Fire Imp', 'LotW', 'Act1', 'Minion', 'Flame Fiend', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Fire Imp', 'LotW', 'Act2', 'Master', 'Flame Fiend', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Fire Imp', 'LotW', 'Act2', 'Master', 'Combustible', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Fire Imp', 'LotW', 'Act2', 'Minion', 'Flame Fiend', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'Master', 'Fly', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'Master', 'Prey on the Weak', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'Minion', 'Fly', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'Minion', 'Prey on the Weak', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Master', 'Fly', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Master', 'Prey on the Weak', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Minion', 'Fly', null, null);
insert into MONSTER_ABILITY (MONSTER_GROUP, EXPANSION, ACT, MONSTER_TYPE, ABILITY, VALUE, ACTION)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'Minion', 'Prey on the Weak', null, null);
