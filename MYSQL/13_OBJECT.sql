
/*인덱스(INDEX)
    -- SQL 명령문의 처리 속도를 향상시키기 위해 행들의 위치 정보를 가지고 있다.
    -- * 데이터 검색 방식
    -- Table Full Scan : 테이블 데이터를 처음부터 끝까지 검색하여 원하는 데이터를 찾는 방식
    -- Index Scan : 인덱스를 통해 데이터를 찾는 방식
    기본키(PRIMARY KEY)는 테이블의 각 행을 고유하게 식별한다. 
    실제 테이블 데이터가 모두 인덱스 구조로 저장된다.
    */
    -- 테이블에서 인덱스 조회 
    SHOW INDEX FROM employee;
    -- 특정 스키마에 있는 인덱스를 한꺼번에 조회
    SELECT * 
    FROM INFORMATION_SCHEMA.STATISTICS
    WHERE TABLE_SCHEMA ='kh';
    
    /*
		INDEX 생성 
        
        CREATE INDEX 인덱스명 
        ON 테이블명(컬럼,컬럼,...);
    
    */
    
    SELECT * 
    FROM sakila.payment
    WHERE amount=0.99;
    
    -- 비고유 인덱스 생성  
    CREATE INDEX idx_amount 
    ON sakila.payment(amount);
        -- 결합 인덱스  생성 
	CREATE INDEX idx_amount_id
    ON sakila.payment(amount,payment_id);
        
        
    SHOW INDEX FROM sakila.payment;
    
    
    /*
		INDEX 삭제 
        DROP INDEX 인덱스명 
        ON 테이블명;
        - 인덱스가 항상 좋은 결과로 이어지지는 않음  
        - 정확한 데이터 분석에 기반을 두지 않은 무분별한 인덱스는 오히려 성능이 떨어짐  
    
    */
    
	DROP INDEX idx_amount
	ON sakila.payment;
    
    DROP INDEX idx_amount_id
	ON sakila.payment;

/*
	프로시저(PROCEDURE) 
    - SQL 문을 저장하여 필요할 때 마다 다시 입력할 필요 없이  간단하게 호출해서 사용가능하게 하는 코드 블럭  
* 추가 
DELIMITER //  
CREATE PROCEDURE 프로시저명 
BEGIN 
	저장할 SQL문 
END //  
DELIMITER ;
*/
CREATE TABLE emp_copy 
AS SELECT * FROM employee;
-- emp_copy 테이블의 모든 데이터를 삭제 하는 프로시저 생성 
DELIMITER // 
CREATE PROCEDURE dell_all_emp()
BEGIN 
	DELETE  FROM emp_copy;
END // 
DELIMITER ;
-- 만들어진 프로시저 확인 
SELECT * FROM emp_copy;

-- del_all_emp 프로시저 호출 
CALL del_all_emp();

SELECT * FROM emp_copy;
-- 프로시저 삭제 
DROP PROCEDURE dell_all_emp;
-- 매개변수가 있는 프로시저 
DELIMITER //
CREATE PROCEDURE del_all_emp(IN id INT,IN name VARCHAR(20))
BEGIN 
	DELETE FROM emp_copy 
    WHERE emp_id = id AND emp_name = name;
END //  

DELIMITER ;
-- 프로시저 실행
CALL del_all_emp(200);
CALL del_all_emp(203);
CALL del_all_emp(201,'송종기');

SELECT * FROM emp_copy;


/*함수(FUNCTION)
- 프로시저와 거의 유사한 용도로 값을 반환하는 재사용 가능한 코드 블럭 
- 특정 계산이나 로직을 함수로 묶어 사용한다.

DELIMITER // 
CREATE FUNCTION 함수명(매개변수)
RETURNS 자료형 
DETERMINISTIC 
BEGIN 
	DECLARE 반환값 자료형 
    RETURN 반환값  
END //  
DELIMITER ; 
*/
-- 사번을 입력받아 해당 사원의 연봉을 계산하고 리턴하는 함수 생성  
CREATE FUNCTION salary_calc(id INT)
RETURNS INT 
DETERMINISTIC
BEGIN 
 DECLARE total INT;
	  SELECT salary * 12 AS result 
      INTO total
      FROM employee
      WHERE emp_id = id;
 RETURN total ;
END // 
DELIMITER ;

-- 함수 호출  
SELECT bonus_calc(204);
-- 방금 만든 salary_calc 함수를 이용해서 연봉이 4000만원 이상인 
select emp_id,emp_name,salary,salary_calc(emp_id) 연봉 
FROM employee;
-- 사원의 사번,사원명,급여,연봉조회(정렬 연봉 높은 순)
WHERE salary_calc(emp_id) > 4000000
ORDER BY 연봉 DESC;
SELECT * FROM employee;
-- 함수 삭제 
DROP FUNCTION IF EXISTS salary_calc;
SELECT * FROM employee;

/*
	트리거(TRIGGER)
    - 특정 이벤트가 발생할 때 자동으로 실행될 내용을 정의하여 저장 
    
    ex) 
    - 회원탈퇴시 기존 회원테이블에 데이터 DELETE 후 곧바로 탈퇴된 회원들만 따로 보관하는 
      테이블에 자동으로 INSERT 처리 
      - 신고 횟수가 일정 수를 넘었을 때 해당 회원을 블랙리스트로 처리 
      - 입출고 대한 데이터가 기록(INSERT) 될 때마다 해당 상품에 대한 
        재고수량을 매번 수정(UPDATE) 해야 되는경우 

	DELIMITER // 
    CREATE TRIGER 트리거명 
    BEGIN
    BEFOR | AFTER INSERT |UPDATE | DELETE 
    BEGIN 
        이벤트 발생시 실행할 SQL 구문 
    END // 
    
    DELIMITER; 
*/

SHOW TRIGGERS; 
CREATE TABLE log(
	log_code INT AUTO_INCREMENT PRIMARY KEY, 
    event_type VARCHAR(50),
    event_dest TEXT,
    event_timesatamp TIMESTAMP DEFAULT now()
);


-- employee 테이블에 새로운 행이 INSERT 될 때 마다 '신입사원이 입사했습니다'라는 
-- 메세지를 log 테입블에 자동으로 INSERT 되는 트리거 생성 

DELIMITER // 

CREATE TRIGGER trg_01
AFTER INSERT ON employee
FOR EACH ROW 
BEGIN 
	INSERT INTO log(event_type,event_desc)
    VALUES('INSERT','신입사원이 입사했습니다');
END // 
DELIMITER ;

INSERT INTO employee_log(emp_id,emp_name,emp_no,dept_code,job_code,hire_date)
VALUES(500,'이상헌','111111-222222','D7','J7',current_date());
SELECT * FROM employee;
SELECT*FROM log;

-- employee 테이블에서 UPDATE 수행후 '업데이트 실행'메세지를 log에 담는 
-- trg_02 트리거 생성 
/*
	OLD : 수정,삭제 전 데이터에 접근 가능 
    NEW : 추가,수정 후 데이터에 접근 가능 
*/

DELIMITER // 
CREATE TRIGGER trg_02
AFTER UPDATE ON employee
FOR EACH ROW 
BEGIN 
INSERT INTO log(event_type,event_desc)
VALUES('UPDATE',concat('변경전 :', OLD.dept_code,',변경후 : ', NEW.dept_code));
END // 

DELIMITER ;

-- employee 
UPDATE  employee
SET dept_code= 'D3'
WHERE dept_code= 'D6';

SELECT * FROM log;


-- 상품 입 / 출고 관련 예시 
-- 1.상품에 대한 데이터를 보관할 테이블 생성(tb_product)
/*
컬럼 : pcode / 기본키 
      pname / VARCHAR(30)/NOT NULL
      brand / VARCHAR(30)/NOT NULL
      price / INT
      stock / INT / 기본값 0 
      */

CREATE TABLE tb_product(
pcode INT AUTO_INCREMENT PRIMARY KEY,
pname VARCHAR(30) NOT NULL,
brand VARCHAR(30) NOT NULL,
price INT,
stock INT DEFAULT 0
);

INSERT INTO tb_product(pname,brand,price)
VALUES('갤럭시24','삼성',1280000);

INSERT INTO tb_product(pname,brand,price,stock)
VALUES('갤럭시z플립','삼성',1000000,10);

INSERT INTO tb_product(pname,brand,price,stock)
VALUES('아이폰14','애플',1200000,20);
-- 2. 상품 입 /출고 상세 이력 테이블 생성 (tb_prodetail) 

/*

	컬럼 :dcode / 기본키 
         pcode / 외래키 
         pdate / DATE / 기본값 현재날짜 
         amount / INT / NOT NULL 
         status / CHAR(2) / 입고, 출고 둘 중 하나 


*/
DROP TABLE tb_pridetail;

CREATE TABLE tb_prodetail(
dcode INT AUTO_INCREMENT PRIMARY KEY,
pcode INT,
pdate DATE DEFAULT(current_date),
amount INT NOT NULL,
status CHAR(2)CHECK(status IN('입고','출고')),
FOREIGN KEY (pcode) REFERENCES tb_product(pcode)
);
-- 1번 상품이 오늘 날짜로 10개 입고 됬다. (tb_prodetail)

INSERT INTO tb_prodetail(pcode,amount,status)
VALUES(1,10,'입고'); 

-- 1번 상품의 재고 수량 10 증가 
UPDATE tb_product 
SET stock = stock + 10
WHERE pcode =1;


-- 3번 상품이 오늘날짜로 5개 출고

INSERT INTO tb_prodetail(pcode,amount,status)
VALUES(3,5,'입고'); 
 
-- 3번 상품의 재고수량 5 감소 
UPDATE tb_product 
SET stock = stock -5
WHERE pcode =3;


/*
	tb_prodetail 테이블에 INSERT 발생시 
    tb_product 테이블에 매번 자동으로 재고 수량 UPDATE 되게끔 트리거 정의 
    
    트리거명 : trg_03
    IF 조건 
    THEN SQL 문 
    END IF;
*/


SELECT * FROM 	tb_prodetail;
SELECT * FROM 	tb_product;

DROP TRIGGER IF EXISTS trg_03;


DELIMITER //

CREATE TRIGGER trg_03
AFTER UPDATE ON tb_product
FOR EACH ROW 
BEGIN 
	IF NEW.status='입고'
   THEN UPDATE tb_product 
    SET stock = stock. NEW.amount 
    WHERE pcode = NEW.pcode;
END IF; 
BEGIN 
	IF NEW.status='출고'
    THEN UPDATE tb_product 
    SET stock = stock. NEW.amount 
    WHERE pcode = NEW.pcode;
END IF; 
DELIMITER ; 
INSERT INTO tb_prodetail(pcode,amount,status)
VALUES(3,5,'출고');


-- 2번 상품이 오늘 날짜로 20개 입고
INSERT INTO tb_prodetail(pcode,amount,status)
VALUES(2,20,'입고');



-- 3번 상품이 오늘 날짜로 7개 출고 
INSERT INTO tb_prodetail(pcode,amount,status)
VALUES(3,7,'출고');

-- 1번 상품이 오늘날짜로 100개 입고  
INSERT INTO tb_prodetail(pcode,amount,status)
VALUES(1,100,'입고');

SELECT * FROM tb_product;
SELECT * FROM  tb_prOdetail;


/*
	데이터베이스 모델링(DB 모델링)
    - 데이터베이스를 설계하는 프로세스 
    - 테이블 간의 관계 정의 및 구조 결정 
    
    작업 순서  
    1. 개념적 모델링 
		- 엔티티(Entity) 추출 
        - 엔치치 간의 관계 설정 
    2. 논리적 모델링 : ERD(Entity Relationship Diagram) 툴  - exerd 
       - 정규화 작업 (1 ~ 5) .. 3 까지만 정규화! 
       -- > 너무 쪼개면 join만 많아져요 
    3. 물리적 모델링 
		- 테이블 실질적으로 구성 
*/






