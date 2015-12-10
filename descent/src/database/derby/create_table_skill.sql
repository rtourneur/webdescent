CREATE TABLE DESCENT.SKILL (
    NAME VARCHAR(30) NOT NULL,
    CLASS VARCHAR(30) NOT NULL CONSTRAINT FK_SKILL_CLASS REFERENCES DESCENT.CLASS,
    MESSAGE_CODE VARCHAR(40) NOT NULL,
    EXPERIENCE DECIMAL(1) NOT NULL,
    RULE_CODE VARCHAR(40) NOT NULL,
    COST VARCHAR(1) NOT NULL,
    CONSTRAINT SKILL_PK PRIMARY KEY (NAME, CLASS));

    alter table DESCENT.SKILL
alter MESSAGE_CODE  set
data type VARCHAR(40)

    
    
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Rage', 'Berserker', 'name.berserker.rage', 0, 'name.berserker.rage.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Brute', 'Berserker', 'name.berserker.brute', 1, 'name.berserker.brute.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Counter Attack', 'Berserker', 'name.berserker.counterattack', 1, 'name.berserker.counterattack.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Cripple', 'Berserker', 'name.berserker.cripple', 1, 'name.berserker.cripple.rule','2');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Charge', 'Berserker', 'name.berserker.charge', 2, 'name.berserker.charge.rule','2');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Weapon Mastery', 'Berserker', 'name.berserker.weaponmastery', 2, 'name.berserker.weaponmastery.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Whirlwind', 'Berserker', 'name.berserker.whirlwind', 2, 'name.berserker.whirlwind.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Death Rage', 'Berserker', 'name.berserker.deathrage', 3, 'name.berserker.deathrage.rule','2');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Execute', 'Berserker', 'name.berserker.execute', 3, 'name.berserker.execute.rule','X');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Oath of Honor', 'Knight', 'name.knight.oathofhonor', 0, 'name.knight.oathofhonor.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Advance', 'Knight', 'name.knight.advance', 1, 'name.knight.advance.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Challenge', 'Knight', 'name.knight.challenge', 1, 'name.knight.challenge.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Defend', 'Knight', 'name.knight.defend', 1, 'name.knight.defend.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Defense Training', 'Knight', 'name.knight.defensetraining', 2, 'name.knight.defensetraining.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Guard', 'Knight', 'name.knight.guard', 2, 'name.knight.guard.rule','2');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Shield Slam', 'Knight', 'name.knight.shieldslam', 2, 'name.knight.shieldslam.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Inspiration', 'Knight', 'name.knight.inspiration', 3, 'name.knight.inspiration.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Stalwart', 'Knight', 'name.knight.stalwart', 3, 'name.knight.stalwart.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Greedy', 'Thief', 'name.thief.greedy', 0, 'name.thief.greedy.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Appraisal', 'Thief', 'name.thief.appraisal', 1, 'name.thief.appraisal.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Dirty Tricks', 'Thief', 'name.thief.dirtytricks', 1, 'name.thief.dirtytricks.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Sneakly', 'Thief', 'name.thief.sneakly', 1, 'name.thief.sneakly.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Caltrops', 'Thief', 'name.thief.caltrops', 2, 'name.thief.caltrops.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Tumble', 'Thief', 'name.thief.tumble', 2, 'name.thief.tumble.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Unseen', 'Thief', 'name.thief.unseen', 2, 'name.thief.unseen.rule','2');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Bushwhack', 'Thief', 'name.thief.bushwhack', 3, 'name.thief.bushwhack.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Lurk', 'Thief', 'name.thief.lurk', 3, 'name.thief.lurk.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Nimble', 'Wildlander', 'name.wildlander.nimble', 0, 'name.wildlander.nimble.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Accurate', 'Wildlander', 'name.wildlander.accurate', 1, 'name.wildlander.accurate.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Danger Sense', 'Wildlander', 'name.wildlander.dangersense', 1, 'name.wildlander.dangersense.rule','2');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Eagle Eyes', 'Wildlander', 'name.wildlander.eagleeyes', 1, 'name.wildlander.eagleeyes.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Bow Mastery', 'Wildlander', 'name.wildlander.bowmastery', 2, 'name.wildlander.bowmastery.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('First Strike', 'Wildlander', 'name.wildlander.firststrike', 2, 'name.wildlander.firststrike.rule','2');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Fleet of Foot', 'Wildlander', 'name.wildlander.fleetoffoot', 2, 'name.wildlander.fleetoffoot.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Black Arrow', 'Wildlander', 'name.wildlander.blackarrow', 3, 'name.wildlander.blackarrow.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Running Shot', 'Wildlander', 'name.wildlander.runningshot', 3, 'name.wildlander.runningshot.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Runic Knowledge', 'Runemaster', 'name.runemaster.runicknowledge', 0, 'name.runemaster.runicknowledge.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Exploding Rune', 'Runemaster', 'name.runemaster.explodingrune', 1, 'name.runemaster.explodingrune.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Ghost Armor', 'Runemaster', 'name.runemaster.ghostarmor', 1, 'name.runemaster.ghostarmor.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Inscribe Rune', 'Runemaster', 'name.runemaster.inscriberune', 1, 'name.runemaster.inscriberune.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Iron Will', 'Runemaster', 'name.runemaster.ironwill', 2, 'name.runemaster.ironwill.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Rune Mastery', 'Runemaster', 'name.runemaster.runemastery', 2, 'name.runemaster.runemastery.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Runic Sorcery', 'Runemaster', 'name.runemaster.runicsorcery', 2, 'name.runemaster.runicsorcery.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Break the Rune', 'Runemaster', 'name.runemaster.breaktherune', 3, 'name.runemaster.breaktherune.rule','4');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Quick Casting', 'Runemaster', 'name.runemaster.quickcasting', 3, 'name.runemaster.quickcasting.rule','2');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Raise Dead', 'Necromancer', 'name.necromancer.raisedead', 0, 'name.necromancer.raisedead.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Corpse Blast', 'Necromancer', 'name.necromancer.corpseblast', 1, 'name.necromancer.corpseblast.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Deathly Haste', 'Necromancer', 'name.necromancer.deathlyhaste', 1, 'name.necromancer.deathlyhaste.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Fury of Undeath', 'Necromancer', 'name.necromancer.furyofundeath', 1, 'name.necromancer.furyofundeath.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Dark Pact', 'Necromancer', 'name.necromancer.darkpact', 2, 'name.necromancer.darkpact.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Undead Might', 'Necromancer', 'name.necromancer.undeadmight', 2, 'name.necromancer.undeadmight.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Vampiric Blood', 'Necromancer', 'name.necromancer.vampiricblood', 2, 'name.necromancer.vampiricblood.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Army of Death', 'Necromancer', 'name.necromancer.armyofdeath', 3, 'name.necromancer.armyofdeath.rule','2');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Dying Command', 'Necromancer', 'name.necromancer.dyingcommand', 3, 'name.necromancer.dyingcommand.rule','2');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Prayer of Healing', 'Disciple', 'name.disciple.prayerofhealing', 0, 'name.disciple.prayerofhealing.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Armor of Faith', 'Disciple', 'name.disciple.armoroffaith', 1, 'name.disciple.armoroffaith.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Blessed Strike', 'Disciple', 'name.disciple.blessedstrike', 1, 'name.disciple.blessedstrike.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Cleansing Touch', 'Disciple', 'name.disciple.cleansingtouch', 1, 'name.disciple.cleansingtouch.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Divine Fury', 'Disciple', 'name.disciple.divinefury', 2, 'name.disciple.divinefury.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Prayer of Peace', 'Disciple', 'name.disciple.prayerofpeace', 2, 'name.disciple.prayerofpeace.rule','2');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Time of Need', 'Disciple', 'name.disciple.timeofneed', 2, 'name.disciple.timeofneed.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Holy Power', 'Disciple', 'name.disciple.holypower', 3, 'name.disciple.holypower.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Radiant Light', 'Disciple', 'name.disciple.radiantlight', 3, 'name.disciple.radiantlight.rule','3');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Stoneskin', 'Spiritspeaker', 'name.spiritspeaker.stoneskin', 0, 'name.spiritspeaker.stoneskin.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Drain Spirit', 'Spiritspeaker', 'name.spiritspeaker.drainspirit', 1, 'name.spiritspeaker.drainspirit.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Healing Rain', 'Spiritspeaker', 'name.spiritspeaker.healingrain', 1, 'name.spiritspeaker.healingrain.rule','2');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Shared Pain', 'Spiritspeaker', 'name.spiritspeaker.sharedpain', 1, 'name.spiritspeaker.sharedpain.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Cloud of Mist', 'Spiritspeaker', 'name.spiritspeaker.cloudofmist', 2, 'name.spiritspeaker.cloudofmist.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Nature''s Bounty', 'Spiritspeaker', 'name.spiritspeaker.naturesbounty', 2, 'name.spiritspeaker.naturesbounty.rule','0');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Tempest', 'Spiritspeaker', 'name.spiritspeaker.tempest', 2, 'name.spiritspeaker.tempest.rule','2');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Ancestor Spirits', 'Spiritspeaker', 'name.spiritspeaker.ancestorspirits', 3, 'name.spiritspeaker.ancestorspirits.rule','1');
insert into SKILL (NAME, CLASS, MESSAGE_CODE, EXPERIENCE, RULE_CODE, COST)
values ('Vigor', 'Spiritspeaker', 'name.spiritspeaker.vigor', 3, 'name.spiritspeaker.vigor.rule','0');
