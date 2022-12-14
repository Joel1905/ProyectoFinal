CREATE DATABASE Proyecto_Final

USE Proyecto_Final

CREATE TABLE Usuarios (
	Id int PRIMARY KEY,
    Nombre VARCHAR (15),
    Correo VARCHAR (20),
    Pass VARCHAR (20),
    Rol VARCHAR (15)
);


INSERT INTO Usuarios (Id,Nombre, Correo, Pass, Rol) 
VALUES (1,'Samuel','samuel@gmail.com','Admin','Administrador'),
(2,'Wilcarol','wilcarol@gmail.com','Admin','Administrador');

CREATE TABLE Lectores (
	Id_Lector int PRIMARY KEY auto_increment,
    Nombre VARCHAR (15),
    Direccion VARCHAR (70),
    Telefono VARCHAR (20),
    Ciudad VARCHAR (30),
    Correo VARCHAR (255)
);

INSERT INTO lectores (Nombre,Direccion,Telefono, Ciudad, Correo) 
VALUES ('Samuel','La cienaga','884324235','Santo Domingo','samuel@gmail.com');

delete from lectores where Id_Lector = 1;
CREATE TABLE Libros (
	IdLibro int PRIMARY KEY AUTO_INCREMENT,
    Titulo VARCHAR (15),
    Editorial varchar(20),
    Año int
);

CREATE TABLE Leyendo (
	Prestado varchar (15),
    Nom_Libro VARCHAR (15),
    Fecha_Prestamo date,
    Fecha_Devolucion date,
    Oservacion Varchar(30)
);

CREATE TABLE Prestamo (
	Id_Salida int PRIMARY KEY AUTO_INCREMENT,
	Nom_Libro VARCHAR (15),
    Autor Varchar (15),
    Fecha_Prestamo date,
    Fecha_Devolucion date,
    Oservacion Varchar (30)
);