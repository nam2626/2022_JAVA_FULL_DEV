select s.sno, s.sname, m.major_name, s.score
from STUDENT s, MAJOR m
where s.major_no = m.major_no;

select * from 
(select s.sno, s.sname, m.major_name, s.score, 
rank() over(order by s.score desc) as rk from STUDENT s, MAJOR m 
where s.major_no = m.major_no) 
where rk = 1;

select * from (select s.sno, s.sname, m.major_name, s.score, rank() over(order by s.score desc) as rk from STUDENT s, MAJOR m where s.major_no = m.major_no) where rk = 1;

select m.major_name, trunc(avg(s.score),2) from STUDENT s, MAJOR m
where s.major_no = m.major_no(+) group by m.major_name;

select s.sno, s.sname, m.major_name, ss.money
from STUDENT s, MAJOR m, STUDENT_SCHOLARSHIP ss
where s.major_no = m.major_no(+) and s.sno = ss.student_no;

select s.sno || '\t' || s.sname || '\t' || m.major_name || '\t' || ss.money
from STUDENT s, MAJOR m, STUDENT_SCHOLARSHIP ss
where s.major_no = m.major_no(+) and s.sno = ss.student_no;








