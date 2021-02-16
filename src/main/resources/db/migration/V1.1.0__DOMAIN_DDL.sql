CREATE TABLE COMPANY(
	ID BIGINT NOT NULL AUTO_INCREMENT,
	NAME VARCHAR(255) NOT NULL,
	CITY_ID BIGINT,
	PRIMARY KEY (ID)
);

CREATE TABLE CITY(
	ID BIGINT NOT NULL AUTO_INCREMENT,
	NAME VARCHAR(255) NOT NULL,
	STATE_ID BIGINT,
	PRIMARY KEY (ID)
);

CREATE TABLE STATE(
    ID BIGINT NOT NULL AUTO_INCREMENT,
    NAME VARCHAR(255) NOT NULL,
    COUNTRY_ID BIGINT,
	PRIMARY KEY (ID)
);

CREATE TABLE COUNTRY(
	ID BIGINT NOT NULL AUTO_INCREMENT,
	NAME VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID)
);

ALTER TABLE COMPANY
	ADD FOREIGN KEY (CITY_ID)
	REFERENCES CITY(ID);
	
ALTER TABLE CITY
    ADD FOREIGN KEY (STATE_ID)
    REFERENCES STATE(ID);

ALTER TABLE STATE
    ADD FOREIGN KEY (COUNTRY_ID)
    REFERENCES COUNTRY(ID);