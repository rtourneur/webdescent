CREATE TABLE DESCENT.MONSTER_GROUP_ACT (
    MONSTER_GROUP VARCHAR(30) NOT NULL ,
    EXPANSION VARCHAR(30) NOT NULL,
    ACT VARCHAR(30) NOT NULL CONSTRAINT FK_MONSTER_GROUP_ACT_ACT REFERENCES DESCENT.ACT,
    IMAGE VARCHAR(30) NOT NULL,
    CONSTRAINT FK_MONSTER_GROUP_ACT_MONSTER_GROUP FOREIGN KEY (MONSTER_GROUP, EXPANSION) REFERENCES DESCENT.MONSTER_GROUP,
    CONSTRAINT MONSTER_GROUP_ACT_PK PRIMARY KEY (MONSTER_GROUP, EXPANSION, ACT));

    drop table DESCENT.MONSTER_GROUP_ACT;
    
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Goblin Archer', 'D2E', 'Act1', 'goblinarcheract1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Goblin Archer', 'D2E', 'Act2', 'goblinarcheract2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Zombie', 'D2E', 'Act1', 'zombieact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Zombie', 'D2E', 'Act2', 'zombieact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Cave Spider', 'D2E', 'Act1', 'cavespideract1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Cave Spider', 'D2E', 'Act2', 'cavespideract2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Flesh Moulders', 'D2E', 'Act1', 'fleshmouldersact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Flesh Moulders', 'D2E', 'Act2', 'fleshmouldersact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Barghest', 'D2E', 'Act1', 'barghestact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Barghest', 'D2E', 'Act2', 'barghestact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ettin', 'D2E', 'Act1', 'ettinact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ettin', 'D2E', 'Act2', 'ettinact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Elemental', 'D2E', 'Act1', 'elementalact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Elemental', 'D2E', 'Act2', 'elementalact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Merriod', 'D2E', 'Act1', 'merriodact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Merriod', 'D2E', 'Act2', 'merriodact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Shadow Dragon', 'D2E', 'Act1', 'shadowdragonact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Shadow Dragon', 'D2E', 'Act2', 'shadowdragonact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Fire Imp', 'LotW', 'Act1', 'fireimpact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Fire Imp', 'LotW', 'Act2', 'fireimpact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Hybrid Sentinel', 'LotW', 'Act1', 'hybridsentinelact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Hybrid Sentinel', 'LotW', 'Act2', 'hybridsentinelact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Goblin Witcher', 'LoR', 'Act1', 'goblinwitcheract1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Goblin Witcher', 'LoR', 'Act2', 'goblinwitcheract2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Volucrix Reaver', 'LoR', 'Act1', 'volucrixreaveract1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Volucrix Reaver', 'LoR', 'Act2', 'volucrixreaveract2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Arachyura', 'LoR', 'Act1', 'arachyuraact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Arachyura', 'LoR', 'Act2', 'arachyuraact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Carrion Drake', 'LoR', 'Act1', 'carriondrakeact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Carrion Drake', 'LoR', 'Act2', 'carriondrakeact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Harpy', 'TT', 'Act1', 'harpyact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Harpy', 'TT', 'Act2', 'harpyact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Plague Worm', 'TT', 'Act1', 'plaguewormact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Plague Worm', 'TT', 'Act2', 'plaguewormact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Rat Swarm', 'SoN', 'Act1', 'ratswarmact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Rat Swarm', 'SoN', 'Act2', 'ratswarmact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Changelin', 'SoN', 'Act1', 'changelinact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Changelin', 'SoN', 'Act2', 'changelinact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ironbound', 'SoN', 'Act1', 'ironboundact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ironbound', 'SoN', 'Act2', 'ironboundact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ynfernael Hulk', 'SoN', 'Act1', 'ynfernaelhulkact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ynfernael Hulk', 'SoN', 'Act2', 'ynfernaelhulkact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Bandit', 'MoR', 'Act1', 'banditact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Bandit', 'MoR', 'Act2', 'banditact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Wraith', 'MoR', 'Act1', 'wraithact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Wraith', 'MoR', 'Act2', 'wraithact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Beastman', 'DCK', 'Act1', 'beastmanact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Beastman', 'DCK', 'Act2', 'beastmanact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Skeleton Archer', 'DCK', 'Act1', 'skeletonarcheract1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Skeleton Archer', 'DCK', 'Act2', 'skeletonarcheract2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Bane Spider', 'DCK', 'Act1', 'banespideract1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Bane Spider', 'DCK', 'Act2', 'banespideract2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Razorwing', 'DCK', 'Act1', 'razorwingact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Razorwing', 'DCK', 'Act2', 'razorwingact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Hell Hound', 'DCK', 'Act1', 'hellhoundact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Hell Hound', 'DCK', 'Act2', 'hellhoundact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Sorcerer', 'DCK', 'Act1', 'sorcereract1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Sorcerer', 'DCK', 'Act2', 'sorcereract2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ogre', 'DCK', 'Act1', 'ogreact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ogre', 'DCK', 'Act2', 'ogreact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Manticore', 'DCK', 'Act1', 'manticoreact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Manticore', 'DCK', 'Act2', 'manticoreact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Naga', 'DCK', 'Act1', 'nagaact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Naga', 'DCK', 'Act2', 'nagaact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Giant', 'DCK', 'Act1', 'giantact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Giant', 'DCK', 'Act2', 'giantact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Crypt Dragon', 'DCK', 'Act1', 'cryptdragonact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Crypt Dragon', 'DCK', 'Act2', 'cryptdragonact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Demon Lord', 'DCK', 'Act1', 'demonlordact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Demon Lord', 'DCK', 'Act2', 'demonlordact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Kobold', 'DCK', 'Act1', 'koboldact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Kobold', 'DCK', 'Act2', 'koboldact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ferrox', 'DCK', 'Act1', 'ferroxact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ferrox', 'DCK', 'Act2', 'ferroxact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Golem', 'DCK', 'Act1', 'golemact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Golem', 'DCK', 'Act2', 'golemact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Dark Priest', 'DCK', 'Act1', 'darkpriestact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Dark Priest', 'DCK', 'Act2', 'darkpriestact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Blood Ape', 'DCK', 'Act1', 'bloodapeact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Blood Ape', 'DCK', 'Act2', 'bloodapeact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Chaos Beast', 'DCK', 'Act1', 'chaosbeastact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Chaos Beast', 'DCK', 'Act2', 'chaosbeastact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Deep Elf', 'DCK', 'Act1', 'deepelfact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Deep Elf', 'DCK', 'Act2', 'deepelfact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Troll', 'DCK', 'Act1', 'trollact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Troll', 'DCK', 'Act2', 'trollact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Shade', 'DCK', 'Act1', 'shadeact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Shade', 'DCK', 'Act2', 'shadeact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Lava Beetle', 'DCK', 'Act1', 'lavabeetleact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Lava Beetle', 'DCK', 'Act2', 'lavabeetleact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Medusa', 'DCK', 'Act1', 'medusaact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Medusa', 'DCK', 'Act2', 'medusaact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Wendigo', 'DCK', 'Act1', 'wendigoact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Wendigo', 'DCK', 'Act2', 'wendigoact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ice Wyrm', 'DCK', 'Act1', 'icewyrmact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ice Wyrm', 'DCK', 'Act2', 'icewyrmact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Beastman', 'OotO', 'Act1', 'beastmanact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Beastman', 'OotO', 'Act2', 'beastmanact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Bane Spider', 'OotO', 'Act1', 'banespideract1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Bane Spider', 'OotO', 'Act2', 'banespideract2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Razorwing', 'OotO', 'Act1', 'razorwingact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Razorwing', 'OotO', 'Act2', 'razorwingact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Giant', 'CoD', 'Act1', 'giantact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Giant', 'CoD', 'Act2', 'giantact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Chaos Beast', 'CoD', 'Act1', 'chaosbeastact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Chaos Beast', 'CoD', 'Act2', 'chaosbeastact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Lava Beetle', 'CoD', 'Act1', 'lavabeetleact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Lava Beetle', 'CoD', 'Act2', 'lavabeetleact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Sorcerer', 'CotF', 'Act1', 'sorcereract1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Sorcerer', 'CotF', 'Act2', 'sorcereract2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Golem', 'CotF', 'Act1', 'golemact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Golem', 'CotF', 'Act2', 'golemact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Medusa', 'CotF', 'Act1', 'medusaact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Medusa', 'CotF', 'Act2', 'medusaact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Crypt Dragon', 'GoD', 'Act1', 'cryptdragonact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Crypt Dragon', 'GoD', 'Act2', 'cryptdragonact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Dark Priest', 'GoD', 'Act1', 'darkpriestact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Dark Priest', 'GoD', 'Act2', 'darkpriestact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Wendigo', 'GoD', 'Act1', 'wendigoact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Wendigo', 'GoD', 'Act2', 'wendigoact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ogre', 'VoD', 'Act1', 'ogreact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ogre', 'VoD', 'Act2', 'ogreact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Manticore', 'VoD', 'Act1', 'manticoreact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Manticore', 'VoD', 'Act2', 'manticoreact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Troll', 'VoD', 'Act1', 'trollact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Troll', 'VoD', 'Act2', 'trollact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Hell Hound', 'BotW', 'Act1', 'hellhoundact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Hell Hound', 'BotW', 'Act2', 'hellhoundact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Kobold', 'BotW', 'Act1', 'koboldact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Kobold', 'BotW', 'Act2', 'koboldact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Deep Elf', 'BotW', 'Act1', 'deepelfact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Deep Elf', 'BotW', 'Act2', 'deepelfact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Skeleton Archer', 'ToC', 'Act1', 'skeletonarcheract1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Skeleton Archer', 'ToC', 'Act2', 'skeletonarcheract2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Demon Lord', 'ToC', 'Act1', 'demonlordact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Demon Lord', 'ToC', 'Act2', 'demonlordact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Crow Hag', 'ToC', 'Act1', 'crowhagact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Crow Hag', 'ToC', 'Act2', 'crowhagact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Naga', 'SotS', 'Act1', 'nagaact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Naga', 'SotS', 'Act2', 'nagaact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ferrox', 'SotS', 'Act1', 'ferroxact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Ferrox', 'SotS', 'Act2', 'ferroxact2.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Blood Ape', 'SotS', 'Act1', 'bloodapeact1.png');
insert into MONSTER_GROUP_ACT (MONSTER_GROUP, EXPANSION, ACT, IMAGE)
values ('Blood Ape', 'SotS', 'Act2', 'bloodapeact2.png');
