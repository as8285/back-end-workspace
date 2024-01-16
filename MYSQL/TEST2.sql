SET SQL_SAFE_UPDATES = 1;

SELECT dept_code, format(sum(salary),0) 합계, format(avg(salary),0) 평균, count(*) 인원수
FROM employee
GROUP BY dept_code
HAVING avg(salary)>2800000 
ORDER BY dept_code;




UPDATE department SET dept_title='해외영업부1부' WHERE dept_id = 'D5';
UPDATE department SET dept_title='해외영업부2부' WHERE dept_id = 'D6';
UPDATE department SET dept_title='해외영업부3부' WHERE dept_id = 'D7';



UPDATE department
SET dept_title='해외영업부'
WHERE (location_id !='L1') AND (location_id !='L5');

SELECT *
FROM department;