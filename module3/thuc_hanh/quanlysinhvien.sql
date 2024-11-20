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

insert into class
values(1,'A1','2008-12-20',1);
insert into class
values(2,'A2','2008-12-22',1);
insert into class
values(3,'B3',current_date,0);

insert into students(student_name,address,phone,status,class_id)
Values('Hung','Ha Noi','0912113113',1,1);
insert into students(student_name,address,status,class_id)
values('Hoa','Hai Phong',1,1);
insert into students(student_name,address,phone,status,class_id)
values('Manh','HCM','0123123123',0,2);

insert into subjects
values (1,'CF',5,1),
(2,'C',6,1),
(3,'HDJ',5,1),
(4,'RDBMS',10,1);

insert into marks (sub_id,student_id,mark,exam_times)
values(1,1,8,1),
(1,2,10,2),
(2,1,12,1);

select * from students;
select * from students where status=true;
select * from subjects where credit<10;
select s.student_id, s.student_name,c.class_name
from students s join class c on s.class_id=c.class_id;
select s.student_id,s.student_name,c.class_name
from students s join class c on s.class_id=c.class_id
where c.class_name='A1';
select s.student_id ,s.student_name,sub.sub_name,m.mark
from students s join marks m on s.student_id=m.student_id join subjects sub on sub.sub_id=m.sub_id;