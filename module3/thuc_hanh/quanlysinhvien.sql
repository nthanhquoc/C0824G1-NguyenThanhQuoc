create database quanlysinhvien;
use quanlysinhvien;
create table class (
class_id int not null auto_increment,
class_name varchar(60) not null,
start_date datetime not null,
status bit,
primary key (class_id)
);
create table students(
student_id int not null auto_increment,
student_name varchar(30),
address varchar(30),
phone varchar(20),
status bit,
class_id int not null,
primary key (student_id),
foreign key (class_id) references class(class_id)
);

create table subjects(
sub_id int not null auto_increment,
sub_name varchar(30) not null,
credit tinyint not null default 1,
check (credit >=1),
status bit default 1,
primary key(sub_id)
);

create table marks(
mark_id int not null auto_increment,
sub_id int not null,
student_id int not null,
mark float default 0,
exam_times tinyint default 1,
primary key (mark_id),
foreign key (sub_id) references subjects(sub_id),
foreign key (student_id) references students(student_id),
check (mark >=0 And mark <=100)
);


