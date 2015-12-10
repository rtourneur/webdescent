CREATE TABLE DESCENT.ITEM_DICE (
    ITEM VARCHAR(30) NOT NULL CONSTRAINT FK_ITEM_DICE_ITEM REFERENCES DESCENT.ITEM,
    DICE VARCHAR(30) NOT NULL CONSTRAINT FK_ITEM_DICE_DICE REFERENCES DESCENT.DICE,
    INDEX DECIMAL(1)  NOT NULL, 
    CONSTRAINT ITEM_DICE_PK PRIMARY KEY (ITEM, DICE, INDEX));

insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Iron Longsword', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Iron Longsword', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Chipped Greataxe', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Chipped Greataxe', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Iron Mace', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Iron Mace', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Oak Staff', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Oak Staff', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Arcane Bolt', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Arcane Bolt', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Reaper''s Scythe', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Reaper''s Scythe', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Yew Shortbow', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Yew Shortbow', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Throwing Knives', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Throwing Knives', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Worn Greatsword', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Worn Greatsword', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Stasis Rune', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Stasis Rune', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Leather Whip', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Leather Whip', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Smoking Vials', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Smoking Vials', 'Green', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Hunting Spear', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Hunting Spear', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Skinning Knife', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Skinning Knife', 'Green', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Staff of the Grave', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Staff of the Grave', 'Green', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Iron Battleaxe', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Iron Battleaxe', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Steel Broadsword', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Steel Broadsword', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Light Hammer', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Light Hammer', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Iron Spear', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Iron Spear', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Magic Staff', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Magic Staff', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Immolation', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Immolation', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Sunburst', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Sunburst', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Elm Greatbow', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Elm Greatbow', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Crossbow', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Crossbow', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Sling', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Sling', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Leather Armor', 'Brown', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Chainmail', 'Grey', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Halberd', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Halberd', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Magma Wave', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Magma Wave', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Handbow', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Handbow', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Bearded Axe', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Bearded Axe', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Mace of Aver', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Mace of Aver', 'Green', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Mace of Aver', 'Green', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Serpet Dagger', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Serpet Dagger', 'Green', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Bow of Bone', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Bow of Bone', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Teleportation Rune', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Teleportation Rune', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Poisoned Blowgun', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Poisoned Blowgun', 'Green', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Thief''s Vest', 'Brown', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Rune Plate', 'Grey', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Steel Greatsword', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Steel Greatsword', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Grinding Axe', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Grinding Axe', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Grinding Axe', 'Red', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Mace of Kellos', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Mace of Kellos', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Dragontooth Hammer', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Dragontooth Hammer', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Dragontooth Hammer', 'Red', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Latari Longbow', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Latari Longbow', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Latari Longbow', 'Yellow', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Lightning Strike', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Lightning Strike', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Lightning Strike', 'Yellow', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Ice Storm', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Ice Storm', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Ice Storm', 'Yellow', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Dwarven Firebomb', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Dwarven Firebomb', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Dwarven Firebomb', 'Yellow', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Demonhide Leather', 'Grey', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Platemail', 'Black', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Scalemail', 'Grey', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Bow of the Sky', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Bow of the Sky', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Staff of Kellos', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Staff of Kellos', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Bow of the Eclipse', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Bow of the Eclipse', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Bow of the Eclipse', 'Green', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Cloak of Deception', 'Grey', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Iron Claws', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Iron Claws', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Iron Claws', 'Yellow', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Obsidian Greataxe', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Obsidian Greataxe', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Obsidian Greataxe', 'Red', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Obsidian Scalemail', 'Black', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Rage Blade', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Rage Blade', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Rage Blade', 'Yellow', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Rune of Misery', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Rune of Misery', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Rune of Misery', 'Green', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Staff of the Wild', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Staff of the Wild', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Staff of the Wild', 'Green', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Staff of the Wild', 'Green', 4);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Trueshot', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Trueshot', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Trueshot', 'Yellow', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Staff of Light', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Staff of Light', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('The Shadow Rune', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('The Shadow Rune', 'Yellow', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('The Shadow Rune', 'Yellow', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Dawnblade', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Dawnblade', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Dawnblade', 'Yellow', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Valyndra''s Bane', 'Blue', 1);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Valyndra''s Bane', 'Red', 2);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Valyndra''s Bane', 'Yellow', 3);
insert into ITEM_DICE (ITEM, DICE, INDEX)
values ('Aurium Mail', 'Black', 1);
