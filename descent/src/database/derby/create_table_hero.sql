CREATE TABLE DESCENT.HERO (
    NAME VARCHAR(30) NOT NULL,
    EXPANSION VARCHAR(30) NOT NULL CONSTRAINT FK_HERO_EXPANSION REFERENCES DESCENT.EXPANSION,
    ARCHETYPE VARCHAR(30) NOT NULL CONSTRAINT FK_HERO_ARCHETYPE REFERENCES DESCENT.ARCHETYPE,
    MESSAGE_CODE VARCHAR(30) NOT NULL,
    SPEED DECIMAL(1) NOT NULL,
    HEALTH DECIMAL(2) NOT NULL,
    STAMINA DECIMAL(1) NOT NULL,
    DEFENSE VARCHAR(30) NOT NULL CONSTRAINT FK_HERO_DEFENSE REFERENCES DESCENT.DICE,
    MIGHT DECIMAL(1) NOT NULL,
    KNOWLEDGE DECIMAL(1) NOT NULL,
    WILLPOWER DECIMAL(1) NOT NULL,
    AWARENESS DECIMAL(1) NOT NULL,
    ABILITY_CODE VARCHAR(30) NOT NULL,
    FEAT_CODE VARCHAR(30) NOT NULL,
    IMAGE VARCHAR(30) NOT NULL,
    CONSTRAINT HERO_PK PRIMARY KEY (NAME, EXPANSION));

    drop table DESCENT.HERO 
    
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Ashrian', 'D2E','Healer', 'hero.ashrian.d2e', 5, 10, 4, 'Grey', 2, 2, 3, 4, 'hero.ashrian.d2e.ability', 'hero.ashrian.d2e.feat', 'ashrian.d2e.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Avric Albright', 'D2E','Healer', 'hero.avric.d2e', 4, 12, 4, 'Grey', 2, 3, 4, 2, 'hero.avric.d2e.ability', 'hero.avric.d2e.feat', 'avric.d2e.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Grisban the Thirsty', 'D2E','Warrior', 'hero.grisban.d2e', 3, 14, 4, 'Grey', 5, 2, 3, 1, 'hero.grisban.d2e.ability', 'hero.grisban.d2e.feat', 'grisban.d2e.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Jain Fairwood', 'D2E','Scout', 'hero.jain.d2e', 5, 8, 5, 'Grey', 2, 3, 2, 4, 'hero.jain.d2e.ability', 'hero.jain.d2e.feat', 'jain.d2e.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Leoric of the Book', 'D2E','Mage', 'hero.leoric.d2e', 4, 8, 5, 'Grey', 1, 5, 2, 3, 'hero.leoric.d2e.ability', 'hero.leoric.d2e.feat', 'leoric.d2e.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Syndrael', 'D2E','Warrior', 'hero.syndrael.d2e', 4, 12, 4, 'Grey', 4, 3, 2, 2, 'hero.syndrael.d2e.ability', 'hero.syndrael.d2e.feat', 'syndrael.d2e.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Tomble Burrowell', 'D2E','Scout', 'hero.tomble.d2e', 4, 8, 5, 'Grey', 1, 2, 3, 5, 'hero.tomble.d2e.ability', 'hero.tomble.d2e.feat', 'tomble.d2e.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Widow Tarha', 'D2E','Mage', 'hero.tarha.d2e', 4, 10, 4, 'Grey', 2, 4, 3, 2, 'hero.tarha.d2e.ability', 'hero.tarha.d2e.feat', 'tarha.d2e.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('High Mage Quellen', 'LotW','Mage', 'hero.quellen.lotw', 4, 10, 4, 'Grey', 1, 5, 3, 2, 'hero.quellen.lotw.ability', 'hero.quellen.lotw.feat', 'quellen.lotw.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Reynhart the Worthy', 'LotW','Warrior', 'hero.reynhart.lotw', 4, 12, 4, 'Grey', 3, 1, 4, 3, 'hero.reynhart.lotw.ability', 'hero.reynhart.lotw.feat', 'reynhart.lotw.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Dezra the Vile', 'LoR','Mage', 'hero.dezra.lor', 5, 8, 4, 'Grey', 2, 4, 2, 3, 'hero.dezra.lor.ability', 'hero.dezra.lor.feat', 'dezra.lor.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Logan Lashley', 'LoR','Scout', 'hero.logan.lor', 4, 10, 4, 'Grey', 3, 2, 2, 4, 'hero.logan.lor.ability', 'hero.logan.lor.feat', 'logan.lor.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Pathfinder Durik', 'LoR','Warrior', 'hero.durik.lor', 5, 10, 4, 'Grey', 3, 2, 2, 4, 'hero.durik.lor.ability', 'hero.durik.lor.feat', 'durik.lor.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Ulma Grimstone', 'LoR','Healer', 'hero.ulma.lor', 4, 8, 5, 'Grey', 2, 4, 3, 2, 'hero.ulma.lor.ability', 'hero.ulma.lor.feat', 'ulma.lor.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Augur Grison', 'TT','Healer', 'hero.augur.tt', 3, 12, 5, 'Grey', 4, 2, 3, 2, 'hero.augur.tt.ability', 'hero.augur.tt.feat', 'augur.tt.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Roganna the Shade', 'TT','Scout', 'hero.roganna.tt', 5, 10, 4, 'Grey', 2, 2, 4, 3, 'hero.roganna.tt.ability', 'hero.roganna.tt.feat', 'roganna.tt.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Orkell the Swift', 'SoN','Warrior', 'hero.orkell.son', 5, 10, 5, 'Brown', 4, 1, 2, 4, 'hero.orkell.son.ability', 'hero.orkell.son.feat', 'orkell.son.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Ravaella Lightfoot', 'SoN','Mage', 'hero.ravaella.son', 4, 8, 5, 'Black', 1, 4, 2, 4, 'hero.ravaella.son.ability', 'hero.ravaella.son.feat', 'ravaella.son.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Rendiel', 'SoN','Healer', 'hero.rendiel.son', 5, 10, 4, 'Grey', 2, 3, 5, 1, 'hero.rendiel.son.ability', 'hero.rendiel.son.feat', 'rendiel.son.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Tinashi the Wanderer', 'SoN','Scout', 'hero.tinashi.son', 4, 12, 4, 'Grey', 3, 2, 3, 3, 'hero.tinashi.son.ability', 'hero.tinashi.son.feat', 'tinashi.son.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Alys Raine', 'MoR','Warrior', 'hero.alys.mor', 4, 12, 4, 'Grey', 3, 4, 3, 1, 'hero.alys.mor.ability', 'hero.alys.mor.feat', 'alys.mor.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Thaiden Mistpeak', 'MoR','Scout', 'hero.thaiden.mor', 4, 10, 5, 'Grey', 3, 1, 2, 5, 'hero.thaiden.mor.ability', 'hero.thaiden.mor.feat', 'thaiden.mor.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Elder Mok', 'OotO','Healer', 'hero.mok.ooto', 4, 10, 4, 'Grey', 2, 3, 4, 2, 'hero.mok.ooto.ability', 'hero.mok.ooto.feat', 'mok.ooto.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Laurel of Bloodwood', 'OotO','Scout', 'hero.laurel.ooto', 4, 8, 5, 'Grey', 2, 3, 2, 4, 'hero.laurel.ooto.ability', 'hero.laurel.ooto.feat', 'laurel.ooto.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Shiver', 'OotO','Mage', 'hero.shiver.ooto', 4, 8, 4, 'Grey', 2, 3, 3, 3, 'hero.shiver.ooto.ability', 'hero.shiver.ooto.feat', 'shiver.ooto.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Trenloe the Strong', 'OotO','Warrior', 'hero.trenloe.ooto', 3, 12, 3, 'Grey', 4, 1, 4, 2, 'hero.trenloe.ooto.ability', 'hero.trenloe.ooto.feat', 'trenloe.ooto.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Brother Gherinn', 'CoD','Healer', 'hero.gherinn.cod', 3, 12, 4, 'Grey', 1, 4, 4, 2, 'hero.gherinn.cod.ability', 'hero.gherinn.cod.feat', 'gherinn.cod.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Corbin', 'CoD','Warrior', 'hero.corbin.cod', 3, 12, 5, 'Grey', 5, 2, 2, 2, 'hero.corbin.cod.ability', 'hero.corbin.cod.feat', 'corbin.cod.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Jaes the Exile', 'CoD','Mage', 'hero.jaes.cod', 4, 12, 3, 'Grey', 3, 4, 2, 2, 'hero.jaes.cod.ability', 'hero.jaes.cod.feat', 'jaes.cod.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Lindel', 'CoD','Scout', 'hero.lindel.cod', 5, 10, 5, 'Grey', 3, 3, 3, 3, 'hero.lindel.cod.ability', 'hero.lindel.cod.feat', 'lindel.cod.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Andira Runehand', 'CotF','Healer', 'hero.andira.cotf', 4, 12, 4, 'Grey', 2, 3, 4, 2, 'hero.andira.cotf.ability', 'hero.andira.cotf.feat', 'andira.cotf.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Astarra', 'CotF','Mage', 'hero.astarra.cotf', 4, 10, 5, 'Grey', 1, 4, 4, 2, 'hero.astarra.cotf.ability', 'hero.astarra.cotf.feat', 'astarra.cotf.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Tahlia', 'CotF','Warrior', 'hero.tahlia.cotf', 3, 14, 4, 'Grey', 3, 2, 3, 3, 'hero.tahlia.cotf.ability', 'hero.tahlia.cotf.feat', 'tahlia.cotf.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Thetherys', 'CotF','Scout', 'hero.thetherys.cotf', 4, 10, 4, 'Grey', 3, 2, 1, 5, 'hero.thetherys.cotf.ability', 'hero.thetherys.cotf.feat', 'thetherys.cotf.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Lord Hauwthorne', 'GoD','Warrior', 'hero.hauwthorne.god', 4, 12, 3, 'Grey', 4, 3, 2, 2, 'hero.hauwthorne.god.ability', 'hero.hauwthorne.god.feat', 'hauwthorne.god.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Mordrog', 'GoD','Warrior', 'hero.mordrog.god', 4, 14, 4, 'Grey', 5, 1, 3, 2, 'hero.mordrog.god.ability', 'hero.mordrog.god.feat', 'mordrog.god.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Sahla', 'GoD','Healer', 'hero.sahla.god', 4, 10, 4, 'Grey', 2, 3, 3, 3, 'hero.sahla.god.ability', 'hero.sahla.god.feat', 'sahla.god.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Silhouette', 'GoD','Scout', 'hero.silhouette.god', 5, 10, 4, 'Grey', 3, 2, 1, 5, 'hero.silhouette.god.ability', 'hero.silhouette.god.feat', 'silhouette.god.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Ispher', 'VoD','Healer', 'hero.ispher.vod', 4, 10, 4, 'Grey', 2, 3, 3, 3, 'hero.ispher.vod.ability', 'hero.ispher.vod.feat', 'ispher.vod.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Master Thorn', 'VoD','Mage', 'hero.thorn.vod', 5, 8, 4, 'Grey', 1, 5, 3, 2, 'hero.thorn.vod.ability', 'hero.thorn.vod.feat', 'thorn.vod.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Nara the Fang', 'VoD','Warrior', 'hero.nara.vod', 5, 10, 4, 'Grey', 4, 1, 2, 4, 'hero.nara.vod.ability', 'hero.nara.vod.feat', 'nara.vod.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Sir Valadir', 'VoD','Warrior', 'hero.valadir.vod', 4, 12, 4, 'Grey', 3, 3, 4, 1, 'hero.valadir.vod.ability', 'hero.valadir.vod.feat', 'valadir.vod.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Andira Runehand', 'DCK', 'Healer', 'hero.andira.dck', 4, 12, 4, 'Grey', 2, 3, 4, 2, 'hero.andira.dck.ability', 'hero.andira.dck.feat', 'andira.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Astarra', 'DCK', 'Mage', 'hero.astarra.dck', 4, 10, 5, 'Grey', 1, 4, 4, 2, 'hero.astarra.dck.ability', 'hero.astarra.dck.feat', 'astarra.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Bogran the Shadow', 'DCK', 'Scout', 'hero.bogran.dck', 4, 10, 4, 'Grey', 2, 2, 3, 4, 'hero.bogran.dck.ability', 'hero.bogran.dck.feat', 'bogran.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Elder Mok', 'DCK', 'Healer', 'hero.mok.dck', 4, 10, 4, 'Grey', 2, 3, 4, 2, 'hero.mok.dck.ability', 'hero.mok.dck.feat', 'mok.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Grey Ker', 'DCK', 'Scout', 'hero.ker.dck', 4, 10, 5, 'Grey', 2, 2, 3, 4, 'hero.ker.dck.ability', 'hero.ker.dck.feat', 'ker.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Ispher', 'DCK', 'Healer', 'hero.ispher.dck', 4, 8, 4, 'Grey', 2, 3, 3, 3, 'hero.ispher.dck.ability', 'hero.ispher.dck.feat', 'ispher.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Jaes the Exile', 'DCK', 'Mage', 'hero.jaes.dck', 4, 12, 3, 'Grey', 3, 4, 2, 2, 'hero.jaes.dck.ability', 'hero.jaes.dck.feat', 'jaes.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Landrec the Wise', 'DCK', 'Mage', 'hero.landrec.dck', 3, 10, 4, 'Brown', 1, 5, 3, 2, 'hero.landrec.dck.ability', 'hero.landrec.dck.feat', 'landrec.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Lyssa', 'DCK', 'Mage', 'hero.lyssa.dck', 5, 8, 5, 'Grey', 2, 3, 2, 4, 'hero.lyssa.dck.ability', 'hero.lyssa.dck.feat', 'lyssa.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Mad Carthos', 'DCK', 'Mage', 'hero.carthos.dck', 4, 8, 3, 'Grey', 1, 4, 4, 2, 'hero.carthos.dck.ability', 'hero.carthos.dck.feat', 'carthos.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Mordrog', 'DCK', 'Warrior', 'hero.mordrog.dck', 3, 14, 3, 'Grey', 5, 1, 3, 2, 'hero.mordrog.dck.ability', 'hero.mordrog.dck.feat', 'mordrog.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('One Fist', 'DCK', 'Warrior', 'hero.onefist.dck', 4, 10, 4, 'Grey', 3, 2, 3, 3, 'hero.onefist.dck.ability', 'hero.onefist.dck.feat', 'onefist.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Red Scorpion', 'DCK', 'Scout', 'hero.redscorpion.dck', 5, 8, 5, 'Grey', 3, 3, 3, 3, 'hero.redscorpion.dck.ability', 'hero.redscorpion.dck.feat', 'redscorpion.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Ronan of the Wild', 'DCK', 'Scout', 'hero.ronan.dck', 4, 10, 5, 'Grey', 3, 1, 4, 3, 'hero.ronan.dck.ability', 'hero.ronan.dck.feat', 'ronan.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Silhouette', 'DCK', 'Scout', 'hero.silhouette.dck', 5, 10, 4, 'Grey', 3, 2, 1, 5, 'hero.silhouette.dck.ability', 'hero.silhouette.dck.feat', 'silhouette.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Sir Valadir', 'DCK', 'Warrior', 'hero.valadir.dck', 4, 12, 3, 'Grey', 3, 3, 4, 1, 'hero.valadir.dck.ability', 'hero.valadir.dck.feat', 'valadir.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Steelhorns', 'DCK', 'Warrior', 'hero.steelhorns.dck', 4, 14, 3, 'Grey', 5, 1, 3, 2, 'hero.steelhorns.dck.ability', 'hero.steelhorns.dck.feat', 'steelhorns.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Trenloe the Strong', 'DCK', 'Warrior', 'hero.trenloe.dck', 3, 12, 3, 'Grey', 4, 1, 4, 2, 'hero.trenloe.dck.ability', 'hero.trenloe.dck.feat', 'trenloe.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Varikas the Dead', 'DCK', 'Warrior', 'hero.varikas.dck', 3, 12, 3, 'Grey', 4, 2, 3, 2, 'hero.varikas.dck.ability', 'hero.varikas.dck.feat', 'varikas.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Vyrah the Falconer', 'DCK', 'Scout', 'hero.vyrah.dck', 4, 10, 4, 'Grey', 3, 2, 2, 4, 'hero.vyrah.dck.ability', 'hero.vyrah.dck.feat', 'vyrah.dck.jpg');

insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Brother Glyr', 'DCK', 'Healer', 'hero.glyr.dck', 2, 12, 3, 'Grey', 4, 1, 3, 3, 'hero.glyr.dck.ability', 'hero.glyr.dck.feat', 'glyr.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Laurel of Bloodwood', 'DCK', 'Scout', 'hero.laurel.dck', 4, 8, 3, 'Grey', 2, 3, 2, 4, 'hero.laurel.dck.ability', 'hero.laurel.dck.feat', 'laurel.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Lord Hauwthorne', 'DCK', 'Warrior', 'hero.hauwthorne.dck', 4, 12, 3, 'Grey', 4, 3, 2, 2, 'hero.hauwthorne.dck.ability', 'hero.hauwthorne.dck.feat', 'hauwthorne.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Master Thorn', 'DCK', 'Mage', 'hero.thorn.dck', 5, 8, 4, 'Grey', 1, 5, 3, 2, 'hero.thorn.dck.ability', 'hero.thorn.dck.feat', 'thorn.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Nanok of the Blade', 'DCK', 'Warrior', 'hero.nanok.dck', 4, 12, 4, 'Black', 4, 2, 2, 3, 'hero.nanok.dck.ability', 'hero.nanok.dck.feat', 'nanok.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Thetherys', 'DCK', 'Scout', 'hero.thetherys.dck', 4, 10, 4, 'Grey', 3, 2, 1, 5, 'hero.thetherys.dck.ability', 'hero.thetherys.dck.feat', 'thetherys.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Aurim', 'DCK', 'Healer', 'hero.aurim.dck', 5, 8, 5, 'Grey', 2, 4, 3, 2, 'hero.aurim.dck.ability', 'hero.aurim.dck.feat', 'aurim.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Corbin', 'DCK', 'Warrior', 'hero.corbin.dck', 3, 12, 5, 'Grey', 5, 2, 2, 2, 'hero.corbin.dck.ability', 'hero.corbin.dck.feat', 'corbin.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Eliam', 'DCK', 'Warrior', 'hero.eliam.dck', 5, 12, 5, 'Brown', 3, 2, 3, 3, 'hero.eliam.dck.ability', 'hero.eliam.dck.feat', 'eliam.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Kirga', 'DCK', 'Scout', 'hero.kirga.dck', 4, 12, 3, 'Grey', 3, 2, 1, 5, 'hero.kirga.dck.ability', 'hero.kirga.dck.feat', 'kirga.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Sahla', 'DCK', 'Healer', 'hero.sahla.dck', 4, 10, 4, 'Grey', 2, 3, 3, 3, 'hero.sahla.dck.ability', 'hero.sahla.dck.feat', 'sahla.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Tahlia', 'DCK', 'Warrior', 'hero.tahlia.dck', 3, 14, 3, 'Grey', 3, 2, 3, 3, 'hero.tahlia.dck.ability', 'hero.tahlia.dck.feat', 'tahlia.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Arvel Worldwalker', 'DCK', 'Scout', 'hero.arvel.dck', 4, 10, 4, 'Grey', 3, 3, 3, 3, 'hero.arvel.dck.ability', 'hero.arvel.dck.feat', 'arvel.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Karnon ', 'DCK', 'Warrior', 'hero.karnon .dck', 4, 14, 3, 'Grey', 6, 1, 2, 2, 'hero.karnon .dck.ability', 'hero.karnon .dck.feat', 'karnon .dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Laughin Buldar', 'DCK', 'Warrior', 'hero.buldar.dck', 3, 14, 3, 'Grey', 4, 2, 2, 3, 'hero.buldar.dck.ability', 'hero.buldar.dck.feat', 'buldar.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Okaluk and Rakash', 'DCK', 'Healer', 'hero.okaluk.dck', 2, 8, 3, 'Grey', 3, 2, 3, 3, 'hero.okaluk.dck.ability', 'hero.okaluk.dck.feat', 'okaluk.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Shiver', 'DCK', 'Mage', 'hero.shiver.dck', 4, 8, 4, 'Grey', 2, 3, 3, 3, 'hero.shiver.dck.ability', 'hero.shiver.dck.feat', 'shiver.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Zyla', 'DCK', 'Mage', 'hero.zyla.dck', 4, 8, 5, 'Grey', 1, 4, 3, 3, 'hero.zyla.dck.ability', 'hero.zyla.dck.feat', 'zyla.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Jonas the Kind', 'DCK', 'Healer', 'hero.jonas.dck', 4, 8, 4, 'Grey', 2, 3, 4, 2, 'hero.jonas.dck.ability', 'hero.jonas.dck.feat', 'jonas.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Nara the Fang', 'DCK', 'Warrior', 'hero.nara.dck', 5, 10, 4, 'Grey', 4, 1, 2, 4, 'hero.nara.dck.ability', 'hero.nara.dck.feat', 'nara.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Tobin Farslayer', 'DCK', 'Scout', 'hero.tobin.dck', 4, 12, 3, 'Grey', 3, 2, 2, 4, 'hero.tobin.dck.ability', 'hero.tobin.dck.feat', 'tobin.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Truthseer Kel', 'DCK', 'Mage', 'hero.kel.dck', 4, 10, 4, 'Grey', 1, 4, 2, 4, 'hero.kel.dck.ability', 'hero.kel.dck.feat', 'kel.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Brother Gherinn', 'DCK', 'Healer', 'hero.gherinn.dck', 3, 12, 3, 'Grey', 1, 4, 4, 2, 'hero.gherinn.dck.ability', 'hero.gherinn.dck.feat', 'gherinn.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Challara', 'DCK', 'Mage', 'hero.challara.dck', 3, 10, 5, 'Grey', 3, 4, 3, 1, 'hero.challara.dck.ability', 'hero.challara.dck.feat', 'challara.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Hugo the Glorious', 'DCK', 'Warrior', 'hero.hugo.dck', 3, 12, 3, 'Black', 4, 1, 4, 2, 'hero.hugo.dck.ability', 'hero.hugo.dck.feat', 'hugo.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Krutsbeck', 'DCK', 'Warrior', 'hero.krutsbeck.dck', 3, 12, 3, 'Grey', 4, 2, 3, 2, 'hero.krutsbeck.dck.ability', 'hero.krutsbeck.dck.feat', 'krutsbeck.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Lindel', 'DCK', 'Scout', 'hero.lindel.dck', 5, 10, 5, 'Grey', 3, 3, 3, 3, 'hero.lindel.dck.ability', 'hero.lindel.dck.feat', 'lindel.dck.jpg');
insert into HERO (NAME, EXPANSION, ARCHETYPE, MESSAGE_CODE, SPEED, HEALTH, STAMINA, DEFENSE, MIGHT, KNOWLEDGE, WILLPOWER, AWARENESS, ABILITY_CODE, FEAT_CODE, IMAGE)
values ('Tatianna', 'DCK', 'Scout', 'hero.tatianna.dck', 5, 12, 4, 'Grey', 2, 2, 2, 5, 'hero.tatianna.dck.ability', 'hero.tatianna.dck.feat', 'tatianna.dck.jpg');
