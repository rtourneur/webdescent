CREATE TABLE DESCENT.MONSTER_GROUP (
    NAME VARCHAR(30) NOT NULL,
    EXPANSION VARCHAR(30) NOT NULL CONSTRAINT FK_MONSTER_GROUP_EXPANSION REFERENCES DESCENT.EXPANSION,
    MESSAGE_CODE VARCHAR(40) NOT NULL,
    ATTACK_TYPE VARCHAR(30)  NOT NULL CONSTRAINT FK_MONSTER_GROUP_ATTACK_TYPE REFERENCES DESCENT.ATTACK_TYPE,
    MONSTER_SIZE VARCHAR(30)  NOT NULL CONSTRAINT FK_MONSTER_GROUP_MONSTER_SIZE REFERENCES DESCENT.MONSTER_SIZE,
    MASTER DECIMAL(1),
    MINION DECIMAL(1),
    CONSTRAINT MONSTER_GROUP_PK PRIMARY KEY (NAME, EXPANSION));

insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Goblin Archer', 'D2E', 'monstergroup.goblinarcher.d2e', 'Ranged', 'Small', 1, 4);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Zombie', 'D2E', 'monstergroup.zombie.d2e', 'Melee', 'Small', 1, 4);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Cave Spider', 'D2E', 'monstergroup.cavespider.d2e', 'Melee', 'Small', 1, 4);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Flesh Moulders', 'D2E', 'monstergroup.fleshmoulders.d2e', 'Ranged', 'Small', 1, 3);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Barghest', 'D2E', 'monstergroup.barghest.d2e', 'Melee', 'Medium', 1, 3);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Ettin', 'D2E', 'monstergroup.ettin.d2e', 'Melee', 'Huge', 1, 1);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Elemental', 'D2E', 'monstergroup.elemental.d2e', 'Ranged', 'Huge', 1, 1);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Merriod', 'D2E', 'monstergroup.merriod.d2e', 'Melee', 'Huge', 1, 1);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Shadow Dragon', 'D2E', 'monstergroup.shadowdragon.d2e', 'Melee', 'Massive', 1, 1);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Fire Imp', 'LotW', 'monstergroup.fireimp.lotw', 'Ranged', 'Small', 2, 3);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Hybrid Sentinel', 'LotW', 'monstergroup.hybridsentinel.lotw', 'Melee', 'Small', 1, 2);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Goblin Witcher', 'LoR', 'monstergroup.goblinwitcher.lor', 'Ranged', 'Small', 1, 3);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Volucrix Reaver', 'LoR', 'monstergroup.volucrixreaver.lor', 'Melee', 'Small', 1, 3);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Arachyura', 'LoR', 'monstergroup.arachyura.lor', 'Melee', 'Huge', 1, 1);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Carrion Drake', 'LoR', 'monstergroup.carriondrake.lor', 'Melee', 'Small', 1, 2);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Harpy', 'TT', 'monstergroup.harpy.tt', 'Melee', 'Small', 1, 3);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Plague Worm', 'TT', 'monstergroup.plagueworm.tt', 'Melee', 'Medium', 1, 2);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Rat Swarm', 'SoN', 'monstergroup.ratswarm.son', 'Melee', 'Medium', 1, 3);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Changelin', 'SoN', 'monstergroup.changelin.son', 'Melee', 'Small', 1, 3);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Ironbound', 'SoN', 'monstergroup.ironbound.son', 'Melee', 'Small', 1, 1);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Ynfernael Hulk', 'SoN', 'monstergroup.ynfernaelhulk.son', 'Melee', 'Huge', 1, 1);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Bandit', 'MoR', 'monstergroup.bandit.mor', 'Ranged', 'Small', 1, 4);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Wraith', 'MoR', 'monstergroup.wraith.mor', 'Ranged', 'Small', 1, 2);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Beastman', 'DCK', 'monstergroup.beastman.dck', 'Melee', 'Small', 1, 3);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Skeleton Archer', 'DCK', 'monstergroup.skeletonarcher.dck', 'Ranged', 'Small', 1, 4);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Bane Spider', 'DCK', 'monstergroup.banespider.dck', 'Ranged', 'Huge', 1, 2);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Razorwing', 'DCK', 'monstergroup.razorwing.dck', 'Melee', 'Small', 1, 3);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Hell Hound', 'DCK', 'monstergroup.hellhound.dck', 'Melee', 'Medium', 1, 3);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Sorcerer', 'DCK', 'monstergroup.sorcerer.dck', 'Ranged', 'Small', 1, 3);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Ogre', 'DCK', 'monstergroup.ogre.dck', 'Melee', 'Huge', 1, 1);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Manticore', 'DCK', 'monstergroup.manticore.dck', 'Ranged', 'Huge', 1, 1);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Naga', 'DCK', 'monstergroup.naga.dck', 'Ranged', 'Huge', 1, 2);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Giant', 'DCK', 'monstergroup.giant.dck', 'Melee', 'Huge', 1, 1);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Crypt Dragon', 'DCK', 'monstergroup.cryptdragon.dck', 'Ranged', 'Massive', 1, 1);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Demon Lord', 'DCK', 'monstergroup.demonlord.dck', 'Ranged', 'Huge', 1, 1);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Kobold', 'DCK', 'monstergroup.kobold.dck', 'Melee', 'Small', 3, 6);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Ferrox', 'DCK', 'monstergroup.ferrox.dck', 'Melee', 'Small', 1, 3);
insert into MONSTER_GROUP (NAME, EXPANSION, MESSAGE_CODE, ATTACK_TYPE, MONSTER_SIZE, MASTER, MINION)
values ('Golem', 'DCK', 'monstergroup.golem.dck', 'Melee', 'Huge', 1, 1);
