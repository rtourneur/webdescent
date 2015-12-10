CREATE TABLE DESCENT.DICE_SIDE (
    DICE VARCHAR(30) NOT NULL CONSTRAINT FK_DICE_SIDE_DICE REFERENCES DESCENT.DICE,
    SIDE DECIMAL(1) NOT NULL,
    MISS BOOLEAN, 
    RANGE DECIMAL(1),
    HEART DECIMAL(1),
    SURGE DECIMAL(1),
    SHIELD DECIMAL(1),
    ICON VARCHAR(30),
    CONSTRAINT DICE_SIDE_PK PRIMARY KEY (DICE, SIDE));

insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Blue', 1,'true',null,null,null,null,'blue_1.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Blue', 2,null,2,2,1,null,'blue_2.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Blue', 3,null,3,2,null,null,'blue_3.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Blue', 4,null,4,2,null,null,'blue_4.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Blue', 5,null,5,1,null,null,'blue_5.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Blue', 6,null,6,1,1,null,'blue_6.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Red', 1,null,null,1,null,null,'red_1.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Red', 2,null,null,2,null,null,'red_2.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Red', 3,null,null,2,null,null,'red_3.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Red', 4,null,null,2,null,null,'red_4.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Red', 5,null,null,3,null,null,'red_5.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Red', 6,null,null,3,1,null,'red_6.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Yellow', 1,null,1,null,1,null,'yellow_1.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Yellow', 2,null,1,1,null,null,'yellow_2.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Yellow', 3,null,2,1,null,null,'yellow_3.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Yellow', 4,null,null,1,1,null,'yellow_4.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Yellow', 5,null,null,2,null,null,'yellow_5.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Yellow', 6,null,null,2,1,null,'yellow_6.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Green', 1,null,1,1,1,null,'green_1.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Green', 2,null,1,1,null,null,'green_2.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Green', 3,null,null,1,1,null,'green_3.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Green', 4,null,null,1,null,null,'green_4.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Green', 5,null,null,null,1,null,'green_5.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Green', 6,null,1,null,1,null,'green_6.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Brown', 1,null,null,null,null,null,'brown_1.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Brown', 2,null,null,null,null,null,'brown_2.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Brown', 3,null,null,null,null,null,'brown_3.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Brown', 4,null,null,null,null,1,'brown_4.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Brown', 5,null,null,null,null,1,'brown_5.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Brown', 6,null,null,null,null,2,'brown_6.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Grey', 1,null,null,null,null,null,'grey_1.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Grey', 2,null,null,null,null,1,'grey_2.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Grey', 3,null,null,null,null,1,'grey_3.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Grey', 4,null,null,null,null,1,'grey_4.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Grey', 5,null,null,null,null,2,'grey_5.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Grey', 6,null,null,null,null,3,'grey_6.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Black', 1,null,null,null,null,null,'black_1.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Black', 2,null,null,null,null,2,'black_2.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Black', 3,null,null,null,null,2,'black_3.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Black', 4,null,null,null,null,2,'black_4.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Black', 5,null,null,null,null,3,'black_5.png');
insert into DICE_SIDE (DICE, SIDE, MISS, RANGE, HEART, SURGE, SHIELD, ICON)
values ('Black', 6,null,null,null,null,4,'black_6.png');
