use quanlybanhang;
insert into customers
values(1,'Minh Quan',10),
(2,'Ngoc Oanh',20),
(3,'Hong Ha',50);

insert into orders(o_id,c_id,o_date)
values(1,1,'2006-3-11'),
(2,2,'2006-3-23'),
(3,1,'2006-3-16');

insert into products
values(1,'Máy giặt',3),
(2,'Tu Lanh',5),
(3,'Dieu hoa',7),
(4,'Quat',1),
(5,'Bep Dien',2);

insert into order_details(o_id,p_id,od_qty)
values(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

select orders.o_id,orders.o_date,orders.o_total_price
from orders;

select customers.c_name,products.p_name
from orders
left join order_details on orders.o_id=order_details.o_id
left join customers on orders.c_id=customers.c_id
left join products on order_details.p_id=products.p_id
order by customers.c_name;

select customers.c_name
from customers
where customers.c_id not in (
select orders.c_id from orders);

select orders.o_id,orders.o_date,sum(order_details.od_qty*products.p_price) as 'total_price'
from orders
left join order_details on orders.o_id=order_details.o_id
left join products on order_details.p_id=products.p_id
group by orders.o_id,orders.o_date;