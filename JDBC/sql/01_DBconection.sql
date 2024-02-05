SELECT * FROM kh.employee_copy;

SELECT * FROM employee_copy;
 
CREATE TABLE employee_copy 
SELECT * FROM  employee;



INSERT INTO employee_copy(emp_id,emp_name,emp_no) 
VALUES(900,"테스트","000000-000000");


UPDATE employee_copy
SET emp_name = "테스트 02"
WHERE emp_id = 900;
SET AUTOCOMMIT = 1;


DELETE  
FROM  employee_copy
WHERE emp_id = 900; 


CREATE TABLE person( 
id int AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(20),
address VARCHAR(30)
);



INSERT INTO person(name,address)
VALUES(999,'테스트','서울');

UPDATE person SET address = '테스트' WHERE id = 111;


DELETE  
FROM  person
WHERE id= 111; 




SET AUTOCOMMIT = 1;


SELECT *
 FROM person;
 WHERE id ='111';