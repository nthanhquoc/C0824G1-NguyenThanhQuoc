use quanlysinhvien;

select * from students where students.student_name like 'H%' or 'h%';
select * from class where month(class.start_date)=12;
select * from  subjects where subjects.credit between 3 and 5;

SET SQL_SAFE_UPDATES = 0;
update students set students.class_id=2 where students.student_name='Hung';
SET SQL_SAFE_UPDATES = 1;

select students.student_name,subjects.sub_name,marks.mark
from students
left join marks on students.student_id=marks.student_id
left join subjects on marks.sub_id=subjects.sub_id
order by marks.mark desc, students.student_name asc;

