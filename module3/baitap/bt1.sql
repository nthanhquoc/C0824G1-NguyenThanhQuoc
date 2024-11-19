create database student_management;
use student_management;
create table classes(
id int auto_increment,
name_class varchar(255) not null,
primary key(id)
);
create table teachers(
id int auto_increment,
name_teacher varchar(255) not null,
age int,
country varchar(255),
primary key (id)
);
