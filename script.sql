CREATE DATABASE QuoteApp;
GO

USE QuoteApp;
GO

CREATE TABLE Regiones (
	id int primary key identity(1, 1) not null,
	nombre varchar(50) not null,
	tarifaGTQ float not null
);

CREATE TABLE Paises (
	id int primary key identity(1, 1) not null,
	nombre varchar(50) not null,
	region_id int not null foreign key references Regiones(id)
);

CREATE TABLE Categorias_Cliente (
	id int primary key identity(1, 1) not null,
	descripcion varchar(50) not null,
	descuento float
);

CREATE TABLE Cotizaciones (
	id int primary key identity(1, 1) not null,
	peso_lb float not null,
	ancho_m float not null,
	alto_m float not null,
	largo_m float not null,
	pais_id int not null foreign key references Paises(id),
	categoria_cliente_id int not null foreign key references Categorias_Cliente(id)
);

INSERT INTO Regiones (nombre, tarifaGTQ)
VALUES 
	('Centro América', 150),
	('Norte América', 200),
	('Asia', 300),
	('Oceanía', 250),
	('Sur América', 175);

INSERT INTO Paises (nombre, region_id)
VALUES
	('Guatemala', 1),
	('El Salvador', 1),
	('Honduras', 1),
	('Estados Unidos', 2),
	('México', 2),
	('Australia', 4)

INSERT INTO Categorias_Cliente (descripcion, descuento)
VALUES 
	('Golden', 30),
	('Silver', 20),
	('Bronce', 10),
	('Visitante', 0)
