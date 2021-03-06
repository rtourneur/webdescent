CREATE TABLE DESCENT.SEARCH_DICE (
    SEARCH VARCHAR(30) NOT NULL,
    EXPANSION VARCHAR(30) NOT NULL,
    DICE VARCHAR(30) NOT NULL CONSTRAINT FK_SEARCH_DICE_DICE REFERENCES DESCENT.DICE,
    INDEX DECIMAL(1)  NOT NULL, 
    CONSTRAINT SEARCH_DICE_PK PRIMARY KEY (SEARCH, EXPANSION, DICE, INDEX),
    CONSTRAINT FK_SEARCH_DICE_SEARCH FOREIGN KEY (SEARCH, EXPANSION) REFERENCES DESCENT.SEARCH);


insert into SEARCH_DICE (SEARCH, EXPANSION, DICE, INDEX)
values ('Fire Flask', 'D2E', 'Blue', 1);
insert into SEARCH_DICE (SEARCH, EXPANSION, DICE, INDEX)
values ('Fire Flask', 'D2E', 'Yellow', 2);
