create database quanlybanhang;
use quanlybanhang;

create table customers(
c_id int auto_increment,
c_name varchar(40),
c_age int,
primary key(c_id)
);

create table orders(
o_id int auto_increment,
c_id int,
o_date date,
o_total_price double,
primary key(o_id),
foreign key (c_id) references customers(c_id)
);

create table products(
p_id int auto_increment,
p_name varchar(40),
p_price double,
primary key(p_id)
);

create table order_details(
p_id int,
o_id int,
od_qty varchar(30),
primary key (p_id,o_id),
foreign key (p_id) references products(p_id),
foreign key (o_id) references orders(o_id)
);