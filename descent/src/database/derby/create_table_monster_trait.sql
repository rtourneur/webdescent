CREATE TABLE DESCENT.MONSTER_TRAIT (
    NAME VARCHAR(30) NOT NULL CONSTRAINT DESCENT.MONSTER_TRAIT_PK PRIMARY KEY,
    MESSAGE_CODE VARCHAR(30) NOT NULL,
    ICON VARCHAR(30) NOT NULL);

insert into MONSTER_TRAIT (NAME, MESSAGE_CODE, ICON)
values ('Civilized', 'monstertrait.civilized','civilized.png');
insert into MONSTER_TRAIT (NAME, MESSAGE_CODE, ICON)
values ('Cold', 'monstertrait.cold','cold.png');
insert into MONSTER_TRAIT (NAME, MESSAGE_CODE, ICON)
values ('Dark', 'monstertrait.dark','dark.png');
insert into MONSTER_TRAIT (NAME, MESSAGE_CODE, ICON)
values ('Hot', 'monstertrait.hot','hot.png');
insert into MONSTER_TRAIT (NAME, MESSAGE_CODE, ICON)
values ('Building', 'monstertrait.building','building.png');
insert into MONSTER_TRAIT (NAME, MESSAGE_CODE, ICON)
values ('Water', 'monstertrait.water','water.png');
insert into MONSTER_TRAIT (NAME, MESSAGE_CODE, ICON)
values ('Mountain', 'monstertrait.mountain','mountain.png');
insert into MONSTER_TRAIT (NAME, MESSAGE_CODE, ICON)
values ('Wilderness', 'monstertrait.wilderness','wilderness.png');
insert into MONSTER_TRAIT (NAME, MESSAGE_CODE, ICON)
values ('Cursed', 'monstertrait.cursed','cursed.png');
insert into MONSTER_TRAIT (NAME, MESSAGE_CODE, ICON)
values ('Cave', 'monstertrait.cave','cave.png');
