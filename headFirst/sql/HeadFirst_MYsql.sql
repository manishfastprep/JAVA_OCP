ctrl+enter is the shortcut to run the current command

CREATE DATABASE greg_list;
USE greg_list;
create table my_contacts
(
	first_name 	varchar(30),
    last_name  	varchar(20),
    email      	varchar(50),
    birthday 	date,
    profession 	varchar(50),
    location	varchar(50),
	status 	varchar(20),
    interests varchar(100),
    seeking	varchar(100)
);
DROP table my_contacts;
create table my_contacts
(
	first_name 	varchar(30),    last_name  	varchar(20),    email      	varchar(50),    birthday 	date,    profession 	varchar(50),    location	varchar(50),
	status 	varchar(20),    interests varchar(100),    seeking	varchar(100),    gender char(1)
);
desc my_contacts;

INSERT INTO my_contacts
(
	first_name 	,    last_name  	,    email      	,    birthday 	,    profession 	,
    location	,	status 	,    interests ,    seeking	,    gender 	
)
VALUES
(
	'Jillian','Anderson','jill_anderson@breaknechpizza.com','1980-09-05','Technical Writer',
    'Pao Alto,CA', 'Single' , 'Kayaking, Reptiles ','Relationship , Friends' , 'F' 
);
select * from my_contacts;


INSERT INTO my_contacts
(
	first_name 	,     email      	,    profession 	,
    location		
)
VALUES
(
	'Pat','patpost@breakneckpizza.com','Postal Worker',
    'Princeton , NJ'
);

create table my_contacts_not_null
(
	last_name varchar(30) not null , first_name varchar(30) not null
);
INSERT INTO my_contacts_not_null
(
	first_name 	,last_name    		
)
VALUES
(
	'Manish', 'chauhan'
);

create table doughnut_list
(
	doughnut_name varchar(10) not null ,
	doughnut_type varchar(6) not null , 
    doughnut_cost DEC(3,2)  not null DEFAULT 0.0
);

INSERT INTO doughnut_list
values
(
	'doughnut1' , 'type1' , 2.00
);

DROP TABLE my_contacts;
CREATE TABLE my_contacts(
  last_name varchar(30) ,
  first_name varchar(20) ,
  email varchar(50) ,
  gender char(1),
  birthday date ,
  profession varchar(50),
  location varchar(50),
  status varchar(20),
  interests varchar(100),
  seeking varchar(100)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO my_contacts(last_name,first_name,email,gender,birthday,profession,location,status,interests,seeking) VALUES ('Anderson','Jillian','jill_anderson@ \nbreakneckpizza.com','F','1980-09-05','Technical Writer','Palo Alto, CA','single','kayaking, reptiles','relationship, friends');
INSERT INTO my_contacts(last_name,first_name,email,gender,birthday,profession,location,status,interests,seeking) VALUES ('Kenton','Leo','lkenton@starbuzzcoffee.com','M','1974-01-10','Manager','San Francisco, CA','divorced','women','women to date');
INSERT INTO my_contacts(last_name,first_name,email,gender,birthday,profession,location,status,interests,seeking) VALUES ('McGavin','Darrin',' captainlove@headfirsttheater.com','M','1966-01-23','Cruise Ship Captain','San Diego, CA','single','sailing, fishing, yachting','women for casual relationships');
INSERT INTO my_contacts(last_name,first_name,email,gender,birthday,profession,location,status,interests,seeking) VALUES ('Franklin','Joe','joe_franklin@leapinlimos.com','M','1977-04-28','Software Sales','Dallas, TX','married','fishing, drinking','new job');
INSERT INTO my_contacts(last_name,first_name,email,gender,birthday,profession,location,status,interests,seeking) VALUES ('Hamilton','Jamie','dontbother@starbuzzcoffee.com','F','1964-09-10','System Administrator','Princeton, NJ','married','RPG','nothing');
INSERT INTO my_contacts(last_name,first_name,email,gender,birthday,profession,location,status,interests,seeking) VALUES ('Chevrolet','Maurice','bookman4u@objectville.net','M','1962-07-01','Bookshop Owner','Mountain View, CA','married','collecting books, scuba diving','friends');
INSERT INTO my_contacts(last_name,first_name,email,gender,birthday,profession,location,status,interests,seeking) VALUES ('Kroger','Renee','poorrenee@mightygumball.net','F','1976-12-03','Unemployed','San Francisco, CA','divorced','cooking','employment');
INSERT INTO my_contacts(last_name,first_name,email,gender,birthday,profession,location,status,interests,seeking) VALUES ('Mendoza','Angelina','angelina@starbuzzcoffee.com','F','1979-08-19','UNIX Sysadmin','San Francisco, CA','married','acting, dancing','new job');
INSERT INTO my_contacts(last_name,first_name,email,gender,birthday,profession,location,status,interests,seeking) VALUES ('Murphy','Donald','padraic@tikibeanlounge.com','M','1967-01-23','Computer Programmer','New York City, NY','committed relationsh','RPG, anime','friends');
INSERT INTO my_contacts(last_name,first_name,email,gender,birthday,profession,location,status,interests,seeking) VALUES ('Spatner','John','jpoet@objectville.net','M','1963-04-18','Salesman','Woodstock, NY','married','poetry, screenwriting','nothing');
INSERT INTO my_contacts(last_name,first_name,email,gender,birthday, profession,location) VALUES ('Toth','Anne','Anne_Toth@leapinlimos.com','F','1969-11-18', 'Artist','San Fran, CA');
INSERT INTO my_contacts(last_name,first_name,email,gender,birthday, profession,location) VALUES ('Manson','Anne','am86@objectville.net','F','1977-08-09', 'Baker','Seattle, WA');
INSERT INTO my_contacts(last_name,first_name,email,gender,birthday, profession,location) VALUES ('Hardy','Anne','anneh@b0tt0msup.com','F','1963-04-18', 'Teacher','San Fran, CA');
INSERT INTO my_contacts(last_name,first_name,email,gender,birthday, profession,location) VALUES ('Parker','Anne','annep@starbuzzcoffee.com','F','1983-01-10', 'Student','San Fran, CA');
INSERT INTO my_contacts(last_name,first_name,email,gender,birthday, profession,location) VALUES ('Blunt','Anne','anneblunt@breakneckpizza.com','F','1959-10-09', 'Web Designer','San Fran, CA');
INSERT INTO my_contacts(last_name,first_name,email,gender,birthday, profession,location) VALUES ('Jacobs','Anne','anne99@objectville.net','F','1968-02-05', 'Computer Programmer','San Jose, CA');


select * from my_contacts;