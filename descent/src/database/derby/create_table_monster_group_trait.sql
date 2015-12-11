CREATE TABLE DESCENT.MONSTER_GROUP_TRAIT (
    MONSTER_GROUP VARCHAR(30) NOT NULL ,
    EXPANSION VARCHAR(30) NOT NULL,
    MONSTER_TRAIT VARCHAR(30) NOT NULL CONSTRAINT FK_MONSTER_GROUP_TRAIT_MONSTER_TRAIT REFERENCES DESCENT.MONSTER_TRAIT,
    CONSTRAINT FK_MONSTER_GROUP_TRAIT_MONSTER_GROUP FOREIGN KEY (MONSTER_GROUP, EXPANSION) REFERENCES DESCENT.MONSTER_GROUP,
    CONSTRAINT MONSTER_GROUP_TRAIT_PK PRIMARY KEY (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT));

insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Goblin Archer', 'D2E', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Goblin Archer', 'D2E', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Zombie', 'D2E', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Zombie', 'D2E', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Cave Spider', 'D2E', 'Wilderness');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Cave Spider', 'D2E', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Flesh Moulders', 'D2E', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Flesh Moulders', 'D2E', 'Civilized');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Barghest', 'D2E', 'Wilderness');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Barghest', 'D2E', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ettin', 'D2E', 'Mountain');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ettin', 'D2E', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Elemental', 'D2E', 'Cold');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Elemental', 'D2E', 'Hot');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Merriod', 'D2E', 'Wilderness');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Merriod', 'D2E', 'Water');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Shadow Dragon', 'D2E', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Shadow Dragon', 'D2E', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Fire Imp', 'LotW', 'Hot');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Fire Imp', 'LotW', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Hybrid Sentinel', 'LotW', 'Mountain');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Hybrid Sentinel', 'LotW', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Goblin Witcher', 'LoR', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Goblin Witcher', 'LoR', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Volucrix Reaver', 'LoR', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Volucrix Reaver', 'LoR', 'Mountain');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Arachyura', 'LoR', 'Wilderness');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Arachyura', 'LoR', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Carrion Drake', 'LoR', 'Water');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Carrion Drake', 'LoR', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Harpy', 'TT', 'Wilderness');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Harpy', 'TT', 'Mountain');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Plague Worm', 'TT', 'Water');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Plague Worm', 'TT', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Rat Swarm', 'SoN', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Rat Swarm', 'SoN', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Changelin', 'SoN', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Changelin', 'SoN', 'Civilized');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ironbound', 'SoN', 'Civilized');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ironbound', 'SoN', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ynfernael Hulk', 'SoN', 'Hot');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ynfernael Hulk', 'SoN', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Bandit', 'MoR', 'Wilderness');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Bandit', 'MoR', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Wraith', 'MoR', 'Civilized');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Wraith', 'MoR', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Beastman', 'DCK', 'Mountain');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Beastman', 'DCK', 'Wilderness');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Skeleton Archer', 'DCK', 'Civilized');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Skeleton Archer', 'DCK', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Bane Spider', 'DCK', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Bane Spider', 'DCK', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Razorwing', 'DCK', 'Wilderness');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Razorwing', 'DCK', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Hell Hound', 'DCK', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Hell Hound', 'DCK', 'Hot');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Sorcerer', 'DCK', 'Civilized');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Sorcerer', 'DCK', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ogre', 'DCK', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ogre', 'DCK', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Manticore', 'DCK', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Manticore', 'DCK', 'Wilderness');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Naga', 'DCK', 'Water');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Naga', 'DCK', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Giant', 'DCK', 'Mountain');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Giant', 'DCK', 'Wilderness');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Crypt Dragon', 'DCK', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Crypt Dragon', 'DCK', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Demon Lord', 'DCK', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Demon Lord', 'DCK', 'Hot');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Kobold', 'DCK', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Kobold', 'DCK', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ferrox', 'DCK', 'Water');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ferrox', 'DCK', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Golem', 'DCK', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Golem', 'DCK', 'Cursed');
