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
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Dark Priest', 'DCK', 'Civilized');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Dark Priest', 'DCK', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Blood Ape', 'DCK', 'Hot');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Blood Ape', 'DCK', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Chaos Beast', 'DCK', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Chaos Beast', 'DCK', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Deep Elf', 'DCK', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Deep Elf', 'DCK', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Troll', 'DCK', 'Mountain');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Troll', 'DCK', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Shade', 'DCK', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Shade', 'DCK', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Lava Beetle', 'DCK', 'Hot');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Lava Beetle', 'DCK', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Medusa', 'DCK', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Medusa', 'DCK', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Wendigo', 'DCK', 'Cold');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Wendigo', 'DCK', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ice Wyrm', 'DCK', 'Cold');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ice Wyrm', 'DCK', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Beastman', 'OotO', 'Mountain');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Beastman', 'OotO', 'Wilderness');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Bane Spider', 'OotO', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Bane Spider', 'OotO', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Razorwing', 'OotO', 'Wilderness');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Razorwing', 'OotO', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Giant', 'CoD', 'Mountain');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Giant', 'CoD', 'Wilderness');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Chaos Beast', 'CoD', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Chaos Beast', 'CoD', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Lava Beetle', 'CoD', 'Hot');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Lava Beetle', 'CoD', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Sorcerer', 'CotF', 'Civilized');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Sorcerer', 'CotF', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Golem', 'CotF', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Golem', 'CotF', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Medusa', 'CotF', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Medusa', 'CotF', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Crypt Dragon', 'GoD', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Crypt Dragon', 'GoD', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Dark Priest', 'GoD', 'Civilized');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Dark Priest', 'GoD', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Wendigo', 'GoD', 'Cold');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Wendigo', 'GoD', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ogre', 'VoD', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ogre', 'VoD', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Manticore', 'VoD', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Manticore', 'VoD', 'Wilderness');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Troll', 'VoD', 'Mountain');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Troll', 'VoD', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Hell Hound', 'BotW', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Hell Hound', 'BotW', 'Hot');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Kobold', 'BotW', 'Building');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Kobold', 'BotW', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Deep Elf', 'BotW', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Deep Elf', 'BotW', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Skeleton Archer', 'ToC', 'Civilized');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Skeleton Archer', 'ToC', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Demon Lord', 'ToC', 'Cursed');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Demon Lord', 'ToC', 'Hot');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Crow Hag', 'ToC', 'Dark');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Crow Hag', 'ToC', 'Civilized');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Naga', 'SotS', 'Water');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Naga', 'SotS', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ferrox', 'SotS', 'Water');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Ferrox', 'SotS', 'Cave');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Blood Ape', 'SotS', 'Hot');
insert into MONSTER_GROUP_TRAIT (MONSTER_GROUP, EXPANSION, MONSTER_TRAIT)
values ('Blood Ape', 'SotS', 'Cave');
