show databases;
drop database library;

create database library;
use library;

create table Users(
    IdUse varchar(10),
	Nom varchar(50),
	Prenom varchar(50),
	Adresse varchar(100),
	Telephone varchar(10),
	Email varchar(100),
	Pass varchar(25),
	DateInscription date,
    Rolee varchar(50),
    PRIMARY KEY (IdUse)
);
SELECT * FROM Users WHERE IdUse LIKE ? OR Nom LIKE ?;
insert into Users (IdUse,Nom,Prenom,Adresse,Telephone,Email,Pass,DateInscription,Rolee) value('1MK','Khazzani','Mohammed','Rue el kady ayyad','0722334455','MK213@gmail.com','1234MK','2017-06-15','Adherent');
update Users set Nom='El Hassane',Prenom='Mohammed',Adresse='Badr',Telephone='0755667788',Email='MH332@gmail.com',Pass='1223MH',DateInscription='2023-01-05',Rolee='Bibliothecaire' where IdUse='1ZM';
select IdUse,Nom from Users where Rolee like "Adh";
select * from Users;

create table Auteur( 
	IdAut varchar(20),
    nom varchar(200),
    primary key(IdAut)
);
insert into auteur(IdAut,nom) value (11,'Martin R.R Goerge');
select * from auteur;
create table Livre (
    IdLiv varchar(50),
    Statut boolean,
    ISBN varchar(20),
    CONSTRAINT FK_isbnOuv FOREIGN KEY (ISBN) references Ouvrage(ISBN),
    primary key(IdLiv)
);
drop table Livre;
select * from Livre;
select 
insert into Livre value('L1',true,'0000000001');
create table Emprunt (
    IdEmp varchar(20),
    DateEmprunt date,
    DateRetour date,
    IdUse varchar(10),
    IdLiv varchar(50),
    primary key(IdEmp),
    CONSTRAINT FK_iduse FOREIGN KEY (IdUse) references Users(IdUse),
    CONSTRAINT FK_idliv FOREIGN KEY (IdLiv) references Livre(IdLiv)
    
);
drop table Emprunt;
select * from Emprunt;
insert into Emprunt value('e1','2019-04-04','2019-04-15','1MK','L1');
create table Localisation (
    IdLiv varchar(50), 
    Rayon varchar(10),
    Etagere varchar(10),
    FOREIGN KEY (IdLiv) REFERENCES Livre(IdLiv)
);
drop table Localisation;
select * from Localisation;
create table Ouvrage(
	ISBN varchar(20),
    title varchar(100),
    datepublication date,
    discription varchar(300),
    primary key (ISBN)
);
insert into Ouvrage value('0000000001','Fire & Flod','2019-05-07','Very good');
select * from Ouvrage;
drop table Ouvrage;


/***********drop************/
create table books(
	id int,
    title varchar(200),
    author varchar(100),
    available boolean,
    primary key(id)
);
drop table books;
insert into books value (1,'Le petit Prince','Froncois',1);
insert into books value (2,'Al Mokaddimah','Ibn Khaldoun',1);
insert into books value (3,'Berserke','japonise',0);
select * from books;









/**************************************************************************************/
create table Livres(
    id int,
    Statut bool,
    PRIMARY KEY (id)
);

select * from Adherent;
select * from Livres;
insert into Adherent value(11,'Khazzani',21,'Moe@gmail.com');
insert into Adherent value(22,'Ziane',21,'Zia@gmail.com');

insert into Livres value(11, true);




create database auteur;
use auteur;
drop table auteur;
create table auteur(
	id int NOT NULL,
	nom varchar(200) Not Null,
    
    PRIMARY KEY (id)
);
select * from auteur;
insert into auteur value(1, 'ibn battutah');
delete from auteur where id=3;






