create database student_management;
use student_management;
create table class(
id int unique,
name_class varchar(255) not null,
primary key(id)
);
create table teacher(
id int unique,
name_teacher varchar(255) not null,
age int,
country varchar(255),
primary key (id)
);
