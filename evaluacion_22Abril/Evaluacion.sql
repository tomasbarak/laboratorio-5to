create database veterinaria;
use veterinaria;

create table Dueño(id_dueño int NOT NULL primary key, id_mascota int, nombre varchar(50));
create table Mascota(id_mascota int NOT NULL primary key, edad int, peso int, id_veterinario int);
create table Veterinario(id_veterinario int NOT NULL primary key, telefono int);

##1
select * from Mascota group by edad;

##2
select * from Mascota group by peso;

##3
select COUNT(edad), edad from Mascota group by edad;

##4
select COUNT(peso), peso from Mascota group by peso;

##5
select SUM(peso) from Mascota where edad >= 5 AND edad <= 10;

##6
select avg(peso) from Mascota;

##7
DELIMITER //

CREATE PROCEDURE mascotasAsignadas(IN id_amo INT)
BEGIN
SELECT COUNT(Mascota) FROM Mascota WHERE id_mascota in (SELECT id_mascota WHERE id_amo = id_dueño);
END //

CALL mascotasAsignadas(1);

##8
DELIMITER //

CREATE PROCEDURE pesaMucho(IN id_mascota_in INT)
BEGIN
DECLARE respuesta VARCHAR(100);
IF (SELECT peso FROM Mascota WHERE id_mascota = id_mascota_in > 15) THEN
SET respuesta = 'Pesa mas de 15Kg';
ELSE
SET respuesta = "Pesa menos de 15Kg";
END IF;
SELECT respuesta;
END //

CALL pesaMucho(1);

##9
DELIMITER //

CREATE PROCEDURE getVetInfo(IN id_veterinario_in INT)
BEGIN
SELECT * FROM Veterinario WHERE id_veterinario = id_veterinario_in;
END //

CALL getVetInfo(1)

##10
DELIMITER //

CREATE PROCEDURE pesaMasDe(IN pesoComparacion INT)
BEGIN
SELECT * FROM Mascota WHERE peso >= pesoComparacion;
END //

CALL pesaMasDe(6);
