CREATE TABLE DESCENT.ITEM (
    NAME VARCHAR(30) NOT NULL CONSTRAINT DESCENT.ITEM_PK PRIMARY KEY,
    MESSAGE_CODE VARCHAR(30) NOT NULL,
    EXPANSION VARCHAR(30) NOT NULL CONSTRAINT FK_ITEM_EXPANSION REFERENCES DESCENT.EXPANSION,
    ITEM_TYPE VARCHAR(30) NOT NULL CONSTRAINT FK_ITEM_ITEM_TYPE REFERENCES DESCENT.ITEM_TYPE,
    ATTACK_TYPE VARCHAR(30) CONSTRAINT FK_ITEM_ATTACK_TYPE REFERENCES DESCENT.ATTACK_TYPE,
    EQUIPMENT VARCHAR(30) NOT NULL CONSTRAINT FK_ITEM_EQUIPMENT REFERENCES DESCENT.EQUIPMENT,
    COST DECIMAL(3),
    RULE_CODE VARCHAR(30) NOT NULL,
    COUNT DECIMAL(1) DEFAULT 1 NOT NULL,
    CLASS VARCHAR(30) CONSTRAINT FK_ITEM_CLASS REFERENCES DESCENT.CLASS,
    IMAGE VARCHAR(30) NOT NULL);

insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Iron Longsword', 'item.ironlongsword', 'D2E', 'Class', 'Melee', 'One Hand', null, 'item.ironlongsword.rule', 1, 'Knight', 'ironlongsword.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Knight Wooden Shield', 'item.knightwoodenshield', 'D2E', 'Class', null, 'One Hand', null, 'item.knightwoodenshield.rule', 1, 'Knight', 'knightwoodenshield.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Chipped Greataxe', 'item.chippedgreataxe', 'D2E', 'Class', 'Melee', 'Two Hands', null, 'item.chippedgreataxe.rule', 1, 'Berserker', 'chippedgreataxe.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Iron Mace', 'item.ironmace', 'D2E', 'Class', 'Melee', 'One Hand', null, 'item.ironmace.rule', 1, 'Disciple', 'ironmace.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Disciple Wooden Shield', 'item.disciplewoodenshield', 'D2E', 'Class', null, 'One Hand', null, 'item.disciplewoodenshield.rule', 1, 'Disciple', 'disciplewoodenshield.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Oak Staff', 'item.oakstaff', 'D2E', 'Class', 'Melee', 'Two Hands', null, 'item.oakstaff.rule', 1, 'Spiritspeaker', 'oakstaff.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Arcane Bolt', 'item.arcanebolt', 'D2E', 'Class', 'Ranged', 'Two Hands', null, 'item.arcanebolt.rule', 1, 'Runemaster', 'arcanebolt.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Reaper''s Scythe', 'item.reapersscythe', 'D2E', 'Class', 'Ranged', 'Two Hands', null, 'item.reapersscythe.rule', 1, 'Necromancer', 'reapersscythe.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Yew Shortbow', 'item.yewshortbow', 'D2E', 'Class', 'Ranged', 'Two Hands', null, 'item.yewshortbow.rule', 1, 'Wildlander', 'yewshortbow.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Throwing Knives', 'item.throwingknives', 'D2E', 'Class', 'Ranged', 'One Hand', null, 'item.throwingknives.rule', 1, 'Thief', 'throwingknives.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Thief Lucky Charm', 'item.thiefluckycharm', 'D2E', 'Class', null, 'Other', null, 'item.thiefluckycharm.rule', 1, 'Thief', 'thiefluckycharm.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Worn Greatsword', 'item.worngreatsword', 'LotW', 'Class', 'Melee', 'Two Hands', null, 'item.worngreatsword.rule', 1, 'Champion', 'worngreatsword.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Horn of Courage', 'item.hornofcourage', 'LotW', 'Class', null, 'Other', null, 'item.hornofcourage.rule', 1, 'Champion', 'hornofcourage.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Stasis Rune', 'item.stasisrune', 'LotW', 'Class', 'Ranged', 'Two Hands', null, 'item.stasisrune.rule', 1, 'Geomancer', 'stasisrune.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('The Dead Man''s Compass', 'item.thedeadmanscompass', 'LoR', 'Class', null, 'Other', null, 'item.thedeadmanscompass.rule', 1, 'Treasure Hunter', 'thedeadmanscompass.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Leather Whip', 'item.leatherwhip', 'LoR', 'Class', 'Melee', 'One Hand', null, 'item.leatherwhip.rule', 1, 'Treasure Hunter', 'leatherwhip.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Smoking Vials', 'item.smokingvials', 'LoR', 'Class', 'Ranged', 'One Hand', null, 'item.smokingvials.rule', 1, 'Apothecary', 'smokingvials.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Hunting Spear', 'item.huntingspear', 'LoR', 'Class', 'Melee', 'One Hand', null, 'item.huntingspear.rule', 1, 'Beastmaster', 'huntingspear.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Skinning Knife', 'item.skinningknife', 'LoR', 'Class', 'Melee', 'One Hand', null, 'item.skinningknife.rule', 1, 'Beastmaster', 'skinningknife.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Staff of the Grave', 'item.staffofthegrave', 'LoR', 'Class', 'Ranged', 'Two Hands', null, 'item.staffofthegrave.rule', 1, 'Hexer', 'staffofthegrave.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Iron Battleaxe', 'item.ironbattleaxe', 'D2E', 'Act1', 'Melee', 'Two Hands', 100, 'item.ironbattleaxe.rule', 1, null, 'ironbattleaxe.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Steel Broadsword', 'item.steelbroadsword', 'D2E', 'Act1', 'Melee', 'One Hand', 100, 'item.steelbroadsword.rule', 1, null, 'steelbroadsword.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Light Hammer', 'item.lighthammer', 'D2E', 'Act1', 'Melee', 'One Hand', 75, 'item.lighthammer.rule', 1, null, 'lighthammer.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Iron Spear', 'item.ironspear', 'D2E', 'Act1', 'Melee', 'One Hand', 75, 'item.ironspear.rule', 1, null, 'ironspear.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Magic Staff', 'item.magicstaff', 'D2E', 'Act1', 'Ranged', 'Two Hands', 150, 'item.magicstaff.rule', 1, null, 'magicstaff.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Immolation', 'item.immolation', 'D2E', 'Act1', 'Ranged', 'Two Hands', 150, 'item.immolation.rule', 1, null, 'immolation.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Sunburst', 'item.sunburst', 'D2E', 'Act1', 'Ranged', 'Two Hands', 125, 'item.sunburst.rule', 1, null, 'sunburst.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Elm Greatbow', 'item.elmgreatbow', 'D2E', 'Act1', 'Ranged', 'Two Hands', 100, 'item.elmgreatbow.rule', 1, null, 'elmgreatbow.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Crossbow', 'item.crossbow', 'D2E', 'Act1', 'Ranged', 'One Hand', 175, 'item.crossbow.rule', 1, null, 'crossbow.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Sling', 'item.sling', 'D2E', 'Act1', 'Ranged', 'One Hand', 75, 'item.sling.rule', 1, null, 'sling.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Iron Shield', 'item.ironshield', 'D2E', 'Act1', null, 'One Hand', 50, 'item.ironshield.rule', 2, null, 'ironshield.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Heavy Cloak', 'item.heavycloak', 'D2E', 'Act1', null, 'Armor', 75, 'item.heavycloak.rule', 1, null, 'heavycloak.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Leather Armor', 'item.leatherarmor', 'D2E', 'Act1', null, 'Armor', 75, 'item.leatherarmor.rule', 2, null, 'leatherarmor.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Chainmail', 'item.chainmail', 'D2E', 'Act1', null, 'Armor', 150, 'item.chainmail.rule', 1, null, 'chainmail.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Scorpion Helm', 'item.scorpionhelm', 'D2E', 'Act1', null, 'Other', 75, 'item.scorpionhelm.rule', 1, null, 'scorpionhelm.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Lucky Charm', 'item.luckycharm', 'D2E', 'Act1', null, 'Other', 100, 'item.luckycharm.rule', 1, null, 'luckycharm.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Mana Weave', 'item.manaweave', 'D2E', 'Act1', null, 'Other', 125, 'item.manaweave.rule', 1, null, 'manaweave.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Ring of Power', 'item.ringofpower', 'D2E', 'Act1', null, 'Other', 100, 'item.ringofpower.rule', 1, null, 'ringofpower.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Halberd', 'item.halberd', 'LotW', 'Act1', 'Melee', 'Two Hands', 125, 'item.halberd.rule', 1, null, 'halberd.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Magma Wave', 'item.magmawave', 'LotW', 'Act1', 'Ranged', 'Two Hands', 150, 'item.magmawave.rule', 1, null, 'magmawave.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Handbow', 'item.handbow', 'LotW', 'Act1', 'Ranged', 'Other', 150, 'item.handbow.rule', 1, null, 'handbow.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Flash Powder', 'item.flashpowder', 'LotW', 'Act1', null, 'Other', 100, 'item.flashpowder.rule', 1, null, 'flashpowder.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Bearded Axe', 'item.beardedaxe', 'LoR', 'Act1', 'Melee', 'Two Hands', 175, 'item.beardedaxe.rule', 1, null, 'beardedaxe.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Mace of Aver', 'item.maceofaver', 'LoR', 'Act1', 'Melee', 'Two Hands', 150, 'item.maceofaver.rule', 1, null, 'maceofaver.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Serpet Dagger', 'item.serpetdagger', 'LoR', 'Act1', 'Melee', 'One Hand', 125, 'item.serpetdagger.rule', 1, null, 'serpetdagger.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Bow of Bone', 'item.bowofbone', 'LoR', 'Act1', 'Ranged', 'Two Hands', 125, 'item.bowofbone.rule', 1, null, 'bowofbone.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Teleportation Rune', 'item.teleportationrune', 'LoR', 'Act1', 'Ranged', 'Two Hands', 125, 'item.teleportationrune.rule', 1, null, 'teleportationrune.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Poisoned Blowgun', 'item.poisonedblowgun', 'LoR', 'Act1', 'Ranged', 'One Hand', 100, 'item.poisonedblowgun.rule', 1, null, 'poisonedblowgun.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Shield of Light', 'item.shieldoflight', 'LoR', 'Act1', null, 'One Hand', 75, 'item.shieldoflight.rule', 1, null, 'shieldoflight.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Thief''s Vest', 'item.thiefsvest', 'LoR', 'Act1', null, 'Armor', 100, 'item.thiefsvest.rule', 1, null, 'thiefsvest.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Rune Plate', 'item.runeplate', 'LoR', 'Act1', null, 'Armor', 175, 'item.runeplate.rule', 1, null, 'runeplate.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Elven Boots', 'item.elvenboots', 'LoR', 'Act1', null, 'Other', 50, 'item.elvenboots.rule', 1, null, 'elvenboots.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Jinn''s Lamp', 'item.jinnslamp', 'LoR', 'Act1', null, 'Other', 100, 'item.jinnslamp.rule', 1, null, 'jinnslamp.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Steel Greatsword', 'item.steelgreatsword', 'D2E', 'Act2', 'Melee', 'Two Hands', 200, 'item.steelgreatsword.rule', 1, null, 'steelgreatsword.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Grinding Axe', 'item.grindingaxe', 'D2E', 'Act2', 'Melee', 'Two Hands', 175, 'item.grindingaxe.rule', 1, null, 'grindingaxe.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Mace of Kellos', 'item.maceofkellos', 'D2E', 'Act2', 'Melee', 'One Hand', 175, 'item.maceofkellos.rule', 1, null, 'maceofkellos.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Dragontooth Hammer', 'item.dragontoothhammer', 'D2E', 'Act2', 'Melee', 'One Hand', 250, 'item.dragontoothhammer.rule', 1, null, 'dragontoothhammer.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Latari Longbow', 'item.latarilongbow', 'D2E', 'Act2', 'Ranged', 'Two Hands', 200, 'item.latarilongbow.rule', 1, null, 'latarilongbow.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Lightning Strike', 'item.lightningstrike', 'D2E', 'Act2', 'Ranged', 'Two Hands', 200, 'item.lightningstrike.rule', 1, null, 'lightningstrike.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Ice Storm', 'item.icestorm', 'D2E', 'Act2', 'Ranged', 'Two Hands', 150, 'item.icestorm.rule', 1, null, 'icestorm.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Dwarven Firebomb', 'item.dwarvenfirebomb', 'D2E', 'Act2', 'Ranged', 'One Hand', 175, 'item.dwarvenfirebomb.rule', 1, null, 'dwarvenfirebomb.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Heavy Steel Shield', 'item.heavysteelshield', 'D2E', 'Act2', null, 'One Hand', 100, 'item.heavysteelshield.rule', 1, null, 'heavysteelshield.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Elven Cloack', 'item.elvencloack', 'D2E', 'Act2', null, 'Armor', 225, 'item.elvencloack.rule', 1, null, 'elvencloack.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Demonhide Leather', 'item.demonhideleather', 'D2E', 'Act2', null, 'Armor', 200, 'item.demonhideleather.rule', 1, null, 'demonhideleather.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Platemail', 'item.platemail', 'D2E', 'Act2', null, 'Armor', 250, 'item.platemail.rule', 1, null, 'platemail.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Iron-Bound Ring', 'item.ironboundring', 'D2E', 'Act2', null, 'Other', 150, 'item.ironboundring.rule', 1, null, 'ironboundring.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Tival Crystal', 'item.tivalcrystal', 'D2E', 'Act2', null, 'Other', 175, 'item.tivalcrystal.rule', 1, null, 'tivalcrystal.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Scalemail', 'item.scalemail', 'LotW', 'Act2', null, 'Armor', 225, 'item.scalemail.rule', 1, null, 'scalemail.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Bow of the Sky', 'item.bowofthesky', 'LotW', 'Act2', 'Ranged', 'Two Hands', 225, 'item.bowofthesky.rule', 1, null, 'bowofthesky.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Merciful Boots', 'item.mercifulboots', 'LotW', 'Act2', null, 'Other', 100, 'item.mercifulboots.rule', 1, null, 'mercifulboots.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Inscribed Robes', 'item.inscribedrobes', 'LotW', 'Act2', null, 'Armor', 225, 'item.inscribedrobes.rule', 1, null, 'inscribedrobes.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Staff of Kellos', 'item.staffofkellos', 'LotW', 'Act2', 'Ranged', 'Two Hands', 175, 'item.staffofkellos.rule', 1, null, 'staffofkellos.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Black Iron Helm', 'item.blackironhelm', 'LoR', 'Act2', null, 'Other', 150, 'item.blackironhelm.rule', 1, null, 'blackironhelm.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Bow of the Eclipse', 'item.bowoftheeclipse', 'LoR', 'Act2', 'Ranged', 'Two Hands', 250, 'item.bowoftheeclipse.rule', 1, null, 'bowoftheeclipse.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Cloak of Deception', 'item.cloakofdeception', 'LoR', 'Act2', null, 'Armor', 200, 'item.cloakofdeception.rule', 1, null, 'cloakofdeception.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Iron Claws', 'item.ironclaws', 'LoR', 'Act2', 'Melee', 'One Hand', 175, 'item.ironclaws.rule', 1, null, 'ironclaws.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Obsidian Greataxe', 'item.obsidiangreataxe', 'LoR', 'Act2', 'Melee', 'Two Hands', 225, 'item.obsidiangreataxe.rule', 1, null, 'obsidiangreataxe.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Obsidian Scalemail', 'item.obsidianscalemail', 'LoR', 'Act2', null, 'Armor', 275, 'item.obsidianscalemail.rule', 1, null, 'obsidianscalemail.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Rage Blade', 'item.rageblade', 'LoR', 'Act2', 'Melee', 'One Hand', 200, 'item.rageblade.rule', 1, null, 'rageblade.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Rune of Misery', 'item.runeofmisery', 'LoR', 'Act2', 'Ranged', 'Two Hands', 250, 'item.runeofmisery.rule', 1, null, 'runeofmisery.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Shroud of Dusk', 'item.shroudofdusk', 'LoR', 'Act2', null, 'Other', 150, 'item.shroudofdusk.rule', 1, null, 'shroudofdusk.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Staff of the Wild', 'item.staffofthewild', 'LoR', 'Act2', 'Ranged', 'Two Hands', 175, 'item.staffofthewild.rule', 1, null, 'staffofthewild.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Shield of the Dark God', 'item.shieldofthedarkgod', 'D2E', 'Relic', null, 'One Hand', null, 'item.shieldofthedarkgod.rule', 1, null, 'shieldofthedarkgod.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Trueshot', 'item.trueshot', 'D2E', 'Relic', 'Ranged', 'Two Hands', null, 'item.trueshot.rule', 1, null, 'trueshot.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Fortuna''s Dice', 'item.fortunasdice', 'D2E', 'Relic', null, 'Other', null, 'item.fortunasdice.rule', 1, null, 'fortunasdice.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Staff of Light', 'item.staffoflight', 'D2E', 'Relic', 'Ranged', 'Two Hands', null, 'item.staffoflight.rule', 1, null, 'staffoflight.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('The Shadow Rune', 'item.theshadowrune', 'D2E', 'Relic', 'Ranged', 'Two Hands', null, 'item.theshadowrune.rule', 1, null, 'theshadowrune.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Dawnblade', 'item.dawnblade', 'D2E', 'Relic', 'Melee', 'One Hand', null, 'item.dawnblade.rule', 1, null, 'dawnblade.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Valyndra''s Bane', 'item.valyndrasbane', 'LotW', 'Relic', 'Melee', 'Two Hands', null, 'item.valyndrasbane.rule', 1, null, 'valyndrasbane.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Aurium Mail', 'item.auriummail', 'LotW', 'Relic', null, 'Armor', null, 'item.auriummail.rule', 1, null, 'auriummail.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Sun Stone', 'item.sunstone', 'LoR', 'Relic', null, 'Other', null, 'item.sunstone.rule', 1, null, 'sunstone.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Living Heart', 'item.livingheart', 'LoR', 'Relic', null, 'Other', null, 'item.livingheart.rule', 1, null, 'livingheart.jpg');
insert into ITEM (NAME, MESSAGE_CODE, EXPANSION, ITEM_TYPE, ATTACK_TYPE, EQUIPMENT, COST, RULE_CODE, COUNT, CLASS, IMAGE)
values ('Gauntlets of Power', 'item.gauntletsofpower', 'LoR', 'Relic', null, 'Other', null, 'item.gauntletsofpower.rule', 1, null, 'gauntletsofpower.jpg');


delete from ITEM;