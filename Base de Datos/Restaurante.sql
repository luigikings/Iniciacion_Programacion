CREATE DATABASE Restaurante;

CREATE TABLE Reservas (
idreservas INT(5) primary key auto_increment,
usuarios INT(5),
N_depersonas INT(2) not null,
FechadeReserva DATETIME not null,
Horario INT(2) not null,
Evento varchar(45),
foreign key (Horario) REFERENCES horario(idHorario),
foreign key (usuarios) REFERENCES Usuarios(idusuarios)
);

CREATE TABLE Usuarios (
idusuarios INT(10) primary key,
nombre varchar(45) not null,
telefono varchar(45) not null,
correo varchar(45) not null,
fechadecreacion date 
);

CREATE TABLE horario (
idHorario INT(10) primary key, 
turno varchar(45) not null,
diadelasemana INT(10) not null,
foreign key (diadelasemana) REFERENCES diadelasemana(iddiadelasemana)
);

CREATE TABLE diadelasemana (
iddiadelasemana INT(12) primary key,
dia varchar(45) not null,
Festivo varchar(45)
);

CREATE TABLE Evento (
idevento INT(10) primary key,
nombre varchar(45) not null,
descripcion varchar(200),
presupuesto int(5) not null,
plato_barco int(10),
foreign key (plato_barco) references PlatoBarco(idPlatobarco)
);

CREATE TABLE PlatoBarco (
idPlatobarco INT(10) primary key,
futomakis INT(3) default 0,
uromakis INT(3) default 0,
sin_arroz INT(3) default 0,
niguiris INT(3) default 0
);

drop table reservas;
drop table usuarios;
drop table horario;
drop table diadelasemana;
drop table evento;
drop table platobarco;

select * from platobarco;
INSERT INTO platobarco(idplatobarco,futomakis,uromakis,sin_arroz,niguiris) values
('1','2','2','2','2'),
('2','1','5','5','0'),
('3','0','0','5','5');

select * from evento;
INSERT INTO evento(idevento,nombre,descripcion,presupuesto,plato_barco) values
('1','Aniversario','Celebracion de anniversario con mi esposo que llevamos 12 meses casados','800','2'),
('2','Cumpleaños',Null,'500','1'),
('3','Halloween',Null,'200','3');

select * from diadelasemana;
INSERT INTO diadelasemana(iddiadelasemana,dia,festivo) values
('1','Sabado','Halloween'),
('2','Sabado',null),
('3','Sabado',null),
('4','Sabado',null);

select * from horario;
INSERT INTO horario(idHorario,turno,diadelasemana) values
('1','tarde','4'),
('2','noche','1'),
('3','tarde','3'),
('4','noche','2');

select * from usuarios;
INSERT INTO usuarios(idusuarios,nombre,telefono,correo,fechadecreacion) values
('1','Pedro','658127797','Pedromariodelbosque@gmail.com','2007-08-14'),
('2','Refael','658127797','rafarafa@gmail.com','2012-03-23'),
('3','Maria','658127797','maria123@gmail.com',null),
('4','Juan','658127797','Juanillo33@gmail.com',null);

select * from reservas;
INSERT INTO reservas(idreservas,usuarios,N_depersonas,Fechadereserva,horario,Evento) values
('1','1','4','2020/11/23 13:45','1','2'),
('2','3','12','2020/12/01 15:00','3','1'),
('3','2','5','2020/10/31 18:30','2','3'),
('4','4','2','2020/11/23 22:00','4',null);

UPDATE reservas 
set N_depersonas='3'
where N_depersonas='4' and idreservas='1';

UPDATE reservas
set Fechadereserva='2020/12/02'
where Fechadereserva='2020/12/01' and idreservas='2';

DELETE from reservas where usuarios='2';

Select usuarios, N_depersonas, Evento from reservas where Fechadereserva between "2020/12/01 00:00" and "2020/12/01 23:30";

Select nombre, telefono,correo,fechadecreacion from usuarios where fechadecreacion < '2010-01-01';

Select nombre,descripcion,presupuesto,plato_barco from evento where idevento='2';

select futomakis,uromakis,sin_arroz,niguiris from platobarco where idplatobarco ='1';
