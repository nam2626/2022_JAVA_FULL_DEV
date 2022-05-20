select s.sno, s.sname, m.major_name, s.score
from STUDENT s, MAJOR m
where s.major_no = m.major_no;

select * from 
(select s.sno, s.sname, m.major_name, s.score, 
rank() over(order by s.score desc) as rk from STUDENT s, MAJOR m 
where s.major_no = m.major_no) 
where rk = 1;

select * from (select s.sno, s.sname, m.major_name, s.score, rank() over(order by s.score desc) as rk from STUDENT s, MAJOR m where s.major_no = m.major_no) where rk = 1;
