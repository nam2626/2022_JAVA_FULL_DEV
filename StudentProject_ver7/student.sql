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
--------------------------------------------------
CREATE OR REPLACE FUNCTION GET_GRADE
(
	SCORE IN NUMBER
) RETURN VARCHAR2
AS
RESULT VARCHAR2(1 BYTE) := 'F';
BEGIN
	IF SCORE >= 90 THEN
		RESULT := 'A';
	ELSIF SCORE >= 80 THEN
		RESULT := 'B';
	ELSIF SCORE >= 70 THEN
		RESULT := 'C';
	ELSIF SCORE >= 60 THEN
		RESULT := 'D';
	ELSE
		RESULT := 'F';
	END IF;
	RETURN RESULT;	
END GET_GRADE;
	
----------------------------------
CREATE OR REPLACE FUNCTION TOTAL_NUM
(
	NUM IN NUMBER
)RETURN NUMBER
AS
	TOTAL NUMBER := 0;
	I NUMBER := 1;
BEGIN
	LOOP
		TOTAL := TOTAL + I;
		I := I + 1;
		EXIT WHEN I > NUM;
	END LOOP;
	RETURN TOTAL;
END TOTAL_NUM;
---------------------------------------
CREATE OR REPLACE FUNCTION TOTAL_NUM
(
	NUM IN NUMBER
)RETURN NUMBER
AS
	TOTAL NUMBER := 0;
	I NUMBER := 1;
BEGIN
	WHILE(I <= NUM)
	LOOP
		TOTAL := TOTAL + I
		I := I + 1
	END LOOP;
	
	RETURN TOTAL;
END TOTAL_NUM;
-----------------------------------------
CREATE OR REPLACE FUNCTION TOTAL_NUM
(
	NUM IN NUMBER
)RETURN NUMBER
AS
	TOTAL NUMBER := 0;
	I NUMBER := 1;
BEGIN
	FOR I IN 1 .. NUM
	LOOP
		TOTAL := TOTAL + I;
	END LOOP;
	RETURN TOTAL;
END TOTAL_NUM;
--------------------------------------------
CREATE OR REPLACE TRIGGER STUDENT_TRRIGER 
AFTER DELETE OR INSERT OR UPDATE OF MAJOR_NO,SCORE,SNAME,SNO ON STUDENT 
FOR EACH ROW
BEGIN
    IF INSERTING THEN
        INSERT INTO LOG(NO, KIND, CONTENT) 
        VALUES(LOG_SEQ.NEXTVAL, 'INSERT',:NEW.SNO || ',' ||
        :NEW.SNAME || ',' || :NEW.MAJOR_NO || ',' || :NEW.SCORE);
    ELSIF UPDATING THEN
        INSERT INTO LOG(NO, KIND, CONTENT) 
        VALUES(LOG_SEQ.NEXTVAL, 'UPDATE',:NEW.SNO || '->' || :OLD.SNO|| ',' ||
        :NEW.SNAME || '->' || :OLD.SNAME|| ','|| 
        :NEW.MAJOR_NO || '->' || :OLD.MAJOR_NO|| ','||
        :NEW.SCORE || '->' || :OLD.SCORE);
    ELSE
        INSERT INTO LOG(NO, KIND, CONTENT) 
        VALUES(LOG_SEQ.NEXTVAL, 'DELETE',:OLD.SNO || ',' ||
        :OLD.SNAME || ',' || :OLD.MAJOR_NO || ',' || :OLD.SCORE);
    END IF;
END;












