\c template1
DROP DATABASE IF EXISTS finch;
CREATE DATABASE finch;
\c finch

CREATE TABLE moveForward (
	moveType varchar(20),
	duration int,
	left_wheel int,
	right_wheel int
	);

CREATE TABLE moveBackward (
	moveType varchar(20),
	duration int,
	left_wheel int,
	right_wheel int
	);

CREATE TABLE moveLeft (
	moveType varchar(20),
	duration int,
	left_wheel int,
	right_wheel int
	);

CREATE TABLE moveRight (
	moveType varchar(20),
	duration int,
	left_wheel int,
	right_wheel int
	);

CREATE TABLE colorGreen (
	r int,
	g int,
	b int
	);

CREATE TABLE colorRed (
	r int,
	g int,
	b int
    );

CREATE TABLE colorBlue (
	r int,
	g int,
	b int
	);

INSERT INTO moveForward VALUES
	('normal',1000,250,250),
	('doble',2000,250,250);

INSERT INTO moveBackward VALUES
	('normal',1000,-250,-250),
	('doble',2000,250,250);

INSERT INTO moveLeft VALUES
	('giro90',1000,-90,90),
	('giro45',1000,-45,45);

INSERT INTO moveRight VALUES
	('giro90',1000,90,-90),
	('giro45',1000,45,-45);

INSERT INTO colorGreen VALUES
	(0,255,0);

INSERT INTO colorRed VALUES
	(255,0,0);

INSERT INTO colorBlue VALUES
	(0,0,255);
