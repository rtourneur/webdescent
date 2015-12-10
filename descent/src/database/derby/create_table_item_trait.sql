CREATE TABLE DESCENT.ITEM_TRAIT (
    ITEM VARCHAR(30) NOT NULL CONSTRAINT FK_ITEM_TRAIT_ITEM REFERENCES DESCENT.ITEM,
    TRAIT VARCHAR(30) NOT NULL CONSTRAINT FK_ITEM_TRAIT_TRAIT REFERENCES DESCENT.TRAIT,
    CONSTRAINT ITEM_TRAIT_PK PRIMARY KEY (ITEM, TRAIT));

insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Iron Longsword', 'Blade');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Knight Wooden Shield', 'Shield');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Chipped Greataxe', 'Axe');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Iron Mace', 'Hammer');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Disciple Wooden Shield', 'Shield');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Oak Staff', 'Staff');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Arcane Bolt', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Arcane Bolt', 'Rune');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Reaper''s Scythe', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Reaper''s Scythe', 'Staff');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Yew Shortbow', 'Bow');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Throwing Knives', 'Blade');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Thief Lucky Charm', 'Trinket');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Worn Greatsword', 'Blade');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Horn of Courage', 'Trinket');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Stasis Rune', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Stasis Rune', 'Rune');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('The Dead Man''s Compass', 'Trinket');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Leather Whip', 'Exotic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Smoking Vials', 'Exotic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Hunting Spear', 'Exotic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Skinning Knife', 'Blade');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Staff of the Grave', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Staff of the Grave', 'Staff');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Iron Battleaxe', 'Axe');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Steel Broadsword', 'Blade');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Light Hammer', 'Hammer');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Iron Spear', 'Exotic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Magic Staff', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Magic Staff', 'Staff');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Immolation', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Immolation', 'Rune');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Sunburst', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Sunburst', 'Rune');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Elm Greatbow', 'Bow');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Crossbow', 'Bow');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Crossbow', 'Exotic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Sling', 'Exotic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Iron Shield', 'Shield');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Heavy Cloak', 'Cloak');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Leather Armor', 'Light Armor');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Chainmail', 'Heavy Armor');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Scorpion Helm', 'Helmet');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Lucky Charm', 'Trinket');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Mana Weave', 'Rune');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Ring of Power', 'Ring');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Halberd', 'Blade');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Halberd', 'Staff');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Magma Wave', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Magma Wave', 'Rune');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Handbow', 'Bow');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Handbow', 'Exotic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Flash Powder', 'Trinket');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Bearded Axe', 'Axe');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Mace of Aver', 'Hammer');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Serpet Dagger', 'Blade');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Bow of Bone', 'Bow');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Teleportation Rune', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Teleportation Rune', 'Rune');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Poisoned Blowgun', 'Exotic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Shield of Light', 'Shield');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Thief''s Vest', 'Light Armor');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Rune Plate', 'Heavy Armor');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Elven Boots', 'Boots');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Jinn''s Lamp', 'Trinket');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Steel Greatsword', 'Blade');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Grinding Axe', 'Axe');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Mace of Kellos', 'Hammer');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Dragontooth Hammer', 'Hammer');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Latari Longbow', 'Bow');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Lightning Strike', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Lightning Strike', 'Rune');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Ice Storm', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Ice Storm', 'Rune');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Dwarven Firebomb', 'Exotic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Heavy Steel Shield', 'Shield');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Elven Cloack', 'Cloak');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Demonhide Leather', 'Light Armor');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Platemail', 'Heavy Armor');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Iron-Bound Ring', 'Ring');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Tival Crystal', 'Trinket');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Scalemail', 'Heavy Armor');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Bow of the Sky', 'Bow');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Merciful Boots', 'Boots');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Inscribed Robes', 'Cloak');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Staff of Kellos', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Staff of Kellos', 'Staff');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Black Iron Helm', 'Helmet');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Bow of the Eclipse', 'Bow');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Bow of the Eclipse', 'Exotic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Cloak of Deception', 'Cloak');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Iron Claws', 'Blade');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Iron Claws', 'Exotic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Obsidian Greataxe', 'Axe');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Obsidian Scalemail', 'Heavy Armor');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Rage Blade', 'Blade');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Rune of Misery', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Rune of Misery', 'Rune');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Shroud of Dusk', 'Helmet');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Staff of the Wild', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Staff of the Wild', 'Staff');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Shield of the Dark God', 'Shield');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Trueshot', 'Bow');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Fortuna''s Dice', 'Trinket');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Staff of Light', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Staff of Light', 'Staff');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('The Shadow Rune', 'Magic');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('The Shadow Rune', 'Rune');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Dawnblade', 'Blade');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Valyndra''s Bane', 'Blade');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Aurium Mail', 'Heavy Armor');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Sun Stone', 'Trinket');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Living Heart', 'Trinket');
insert into ITEM_TRAIT (ITEM, TRAIT)
values ('Gauntlets of Power', 'Trinket');
