use quanlysinhvien;
select subjects.sub_id, subjects.sub_name, subjects.credit, subjects.status, MAX(marks.mark) as max_mark
from subjects
join marks on subjects.sub_id = marks.sub_id
group by subjects.sub_id, subjects.sub_name, subjects.credit, subjects.status
having max_mark = (select max(mark) from marks);

select
    students.student_id,
    students.student_name,
    avg (marks.mark) as avg_mark
from students
join marks on students.student_id = marks.student_id
group by students.student_id, students.student_name
order by avg_mark desc;