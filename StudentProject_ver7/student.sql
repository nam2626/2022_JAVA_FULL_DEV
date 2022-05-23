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

CREATE OR REPLACE PROCEDURE INSERT_STUDENT
(
	IN_SNO IN VARCHAR2,
	IN_SNAME IN VARCHAR2,
	IN_MAJOR_NO IN NUMBER,
	IN_SCORE IN NUMBER
) AS
BEGIN
	INSERT INTO STUDENT VALUES(IN_SNO, IN_SNAME, IN_MAJOR_NO, IN_SCORE);
	COMMIT;
	DBMS_OUTPUT.PUT_LINE('정상적으로 데이터가 등록되었습니다.');
	EXCEPTION
		WHEN OTHERS THEN
			DBMS_OUTPUT.PUT_LINE('데이터등록 작업을 실패하였습니다.');
			ROLLBACK;
			
END INSERT_STUDENT;

SET SERVEROUTPUT ON;

EXEC INSERT_STUDENT('AAAA1','BBBBB',21,3.14);

--------------------------------------------------------------------------------------
CREATE OR REPLACE PROCEDURE INSERT_STUDENT
(
	IN_SNO IN VARCHAR2,
	IN_SNAME IN VARCHAR2,
	IN_MAJOR_NO IN NUMBER,
	IN_SCORE IN NUMBER,
    OUT_RESULT OUT NUMBER
) AS
BEGIN
	INSERT INTO STUDENT VALUES(IN_SNO, IN_SNAME, IN_MAJOR_NO, IN_SCORE);
	COMMIT;
	DBMS_OUTPUT.PUT_LINE('정상적으로 데이터가 등록되었습니다.');
    OUT_RESULT := 1;
	EXCEPTION
		WHEN OTHERS THEN
			DBMS_OUTPUT.PUT_LINE('데이터등록 작업을 실패하였습니다.');
			ROLLBACK;
            OUT_RESULT := 0;
			
END INSERT_STUDENT;
--프로시저 실행
DECLARE
    RESULT NUMBER;
BEGIN
    INSERT_STUDENT('BBBB1','AAAA',21,1.1,RESULT);
    DBMS_OUTPUT.PUT_LINE(RESULT);
END;
















