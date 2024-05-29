/*define la tabla DDL*/

create database c24116;

use c24116;

drop database c24116;

···· ejemplo····

create table personal
(
    id int auto_increment primary key,
    nombre varchar(50),
    email varchar(50) unique,
    provincia varchar(50),
);

alter table personal
add column apellido varchar(50) after nombre


truncate personal

/*DML*/

insert 

update

delete

insert into personal(nombre,apellido,email,provincia) values ('camila','gomez','lalal@gmail.com','buenos aires');

/*se elimna a una persona por su primary key*/

delete from personal where id=5   /* borrado fisico*/

insert into personal(nombre,apellido,email,provincia) values
('juan','gomez','lalal@gmail.com','buenos aires'),
('miguel','gomez','lalal@gmail.com','buenos aires'),
('camila','gomez','lalal@gmail.com','buenos aires');

create table provincias
(
    id int auto_increment primary key,
    nombre varchar(40)
);
/*cargar la tabla */
insert into provincias(nombre) values
(Buenos Aires),
(La Pampa),
(Santa Cruz);

alter table personal 
drop column provincia;

alter table personal
add column provincia_id int after email;

/*LINKEO LA TABLA CON LA TABLA DE PROVINCIAS */
alter table personal 
add foreing key (provincia_id)
references provincias(id);  


update personal set nombre='Nicolas' where id=1;
update personal set habilitado=false where id=4;

select * from personal;  /*acceso a todos los registros y campos*/

select nombre as 'Nombre',habilitado as 'Activo' from personal;

select * from personal where id>3;
select * from personal where id>=3;

select * from personal where id=2 or id =6;
select * from personal where id in (2,4,6);

select * from personal where id not in (2,4,6);

select * from personal where id between 3 and 6;

/*el % reemplaza genericamente a un conjunto de caracteres*/
select * from personal where email like '%@gmail.com'; 

/*el % reemplaza genericamente a un conjunto de caracteres al principio y al final*/
select * from personal where email like '%@yahoo.com%'; 
/* el _ (guion bajo) es para 1 sola letra y % varios caracteres */
select * from personal where apellido like '_e%';  

/*REGLAS NEMOTECNICAS PARA CREAR UNA BASE DE DATOS*/



