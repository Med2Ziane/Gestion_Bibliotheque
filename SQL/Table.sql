create database library;
use library;
create table Users(
    IdUse varchar(30),/* Benisba l User_name kan 10 redito 30*/
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

create table auteur(
	id int NOT NULL,
	nom varchar(200) Not Null,
    
    PRIMARY KEY (id)
);

create table Ouvrage(
	ISBN varchar(20),
    title varchar(100),
    datepublication date,
    discription TEXT,
    primary key (ISBN)
);

create table Livre (
    IdLiv varchar(50),
    Statut boolean,
    ISBN varchar(20),
    CONSTRAINT FK_isbnOuv FOREIGN KEY (ISBN) references Ouvrage(ISBN),
    primary key(IdLiv)
);
create table Reservation (
   
    DateReservation date NOT NULL,
    /*
     Id Adherent && INSBOuvrage // Ghadi ykounu homa PRIMARY key
    */
    IdAdherent varchar(30),
    INSBOuvrage varchar(30),
    /**/
    IdLivre varchar(50),
     PRIMARY KEY (IdAdherent, INSBOuvrage),
    FOREIGN KEY(IdAdherent) REFERENCES Users(IdUse),
    FOREIGN KEY(INSBOuvrage) REFERENCES Ouvrage(ISBN)

    CONSTRAINT FK_IdLivre FOREIGN KEY (IdLivre) references Livre(IdLiv),
    
);

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



