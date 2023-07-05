create database redes;
use redes;
create table usuario(
id int primary key auto_increment,
nombre varchar(50) not null,
apellido varchar (50) not null,
usuario varchar (20) not null,
contrasena varchar(100)not null,
fecha_nacimiento varchar (10) not null,
estado enum ("Activo","Inactivo") default "Activo"
);

create table publicacion(
id int primary key auto_increment,
tema varchar(70),
fecha_publicacion varchar (10) not null,
contenido varchar (255) not null,
titulo varchar (40) not null,
id_user int,
foreign key (id_user)references usuario(id)
)
select * from usuario;
select * from usuario where contrasena=1031646772 and usuario="juliperalta";