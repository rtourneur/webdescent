CREATE TABLE DESCENT.CLASS (
    NAME VARCHAR(30) NOT NULL CONSTRAINT CLASS_PK PRIMARY KEY,
    MESSAGE_CODE VARCHAR(30) NOT NULL,
    EXPANSION VARCHAR(30) NOT NULL CONSTRAINT FK_CLASS_EXPANSION REFERENCES DESCENT.EXPANSION,
    ARCHETYPE VARCHAR(30) NOT NULL CONSTRAINT FK_CLASS_ARCHETYPE REFERENCES DESCENT.ARCHETYPE);

insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Berserker', 'class.berserker', 'Warrior', 'D2E');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Disciple', 'class.disciple', 'Healer', 'D2E');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Knight', 'class.knight', 'Warrior', 'D2E');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Necromancer', 'class.necromancer', 'Mage', 'D2E');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Runemaster', 'class.runemaster', 'Mage', 'D2E');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Spiritspeaker', 'class.spiritspeaker', 'Healer', 'D2E');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Thief', 'class.thief', 'Scout', 'D2E');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Wildlander', 'class.wildlander', 'Scout', 'D2E');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Champion', 'class.champion', 'Warrior', 'LotW');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Geomancer', 'class.geomancer', 'Mage', 'LotW');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Apothecary', 'class.apothecary', 'Healer', 'LoR');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Beastmaster', 'class.beastmaster', 'Warrior', 'LoR');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Hexer', 'class.hexer', 'Mage', 'LoR');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Treasure Hunter', 'class.treasurehunter', 'Scout', 'LoR');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Prophet', 'class.prophet', 'Healer', 'TT');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Stalker', 'class.stalker', 'Scout', 'TT');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Bard', 'class.bard', 'Healer', 'SoN');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Conjurer', 'class.conjurer', 'Mage', 'SoN');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Shadow Walker', 'class.shadowwalker', 'Scout', 'SoN');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Skirmisher', 'class.skirmisher', 'Warrior', 'SoN');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Bounty Hunter', 'class.bountyhunter', 'Scout', 'MoR');
insert into CLASS (NAME, MESSAGE_CODE, ARCHETYPE, EXPANSION)
values ('Marshal', 'class.marshal', 'Warrior', 'MoR');
