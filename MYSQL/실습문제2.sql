-- Sakila : DVD 대여 및 영화 정보와 관련된 데이터 포함
SELECT * FROM category; -- 영화 카테고리 정보 : category_id
SELECT * FROM rental; -- DVD 대여 정보 : customer_id, inventory_id
SELECT * FROM inventory; -- DVD 대여점에서 관리하는 정보 : inventory_id, film_id
SELECT * FROM customer; -- DVD 대여 고객 정보 : customer_id, address_id
SELECT * FROM film; -- 영화 정보 : film_id
SELECT * FROM actor; -- 영화 배우 정보 : actor_id,first_name
SELECT * FROM film_category; -- film과 category 연결 : film_id, category_id
SELECT * FROM film_actor; -- film과 actor 연결 : film_id, actor_id
SELECT * FROM customer;
 -- DVD 대여 고객 정보 : customer_id, address_id,first_name,last_name
SELECT * FROM address; -- 고객 주소 정보 : address_id, city_id,address,district
SELECT * FROM city;
 -- city_id, city,country_id
SELECT * FROM country; -- country_id,country;
-- 1. customer테이블에 first_name이 TRACY인 사람들 조회
-- country,city,address,disctrict,first_name,last_name : 필요한 컬럼
-- country,city,address ,customer : 필요한 테이블
-- SELECT * FROM customer

SELECT country,city,address,district,first_name,last_name
FROM customer
JOIN address USING (address_id)
JOIN city USING (city_id)
JOIN country USING (country_id)
WHERE first_name ='TRACY';

--  Sakila 데이터 베이스에서 국가가 인도 고객의 수를 출력하세요.
SELECT * 
FROM country; 
-- 2. 배우 JULIA MCQUEEN이 찍은 영화 제목 조회 (title 기준 정렬 10개까지)
-- first_name,last_name,titlem: 필요한 컬럼 
-- actor(actor_id),film(film_id),film_actor: 필요한 테이블
SELECT first_name,last_name,title
FROM actor
JOIN film_actor USING (actor_id)
JOIN film USING(film_id)
WHERE first_name='JULIA' AND last_name='MCQUEEN'
ORDER BY title
LIMIT 10;
-- 3. 영화 NOON PAPI에 나오는 배우들의 이름 조회
-- first_name,last_name : 필요한 컬럼
-- actor(actor_id),film(film_id),film_actor(actor_id,film_id) : 필요한 테이블 
SELECT first_name,last_name
FROM film_actor
JOIN film_actor USING (actor_id)
JOIN film USING(film_id)
WHERE title='NOON PAPI' ;

-- 서브쿼리 : 조회에 필요한 테이블은 actor

SELECT first_name,last_name
FROM actor
WHERE actor_id IN (SELECT actor_id
                   FROM film_actor
			 WHERE film_id = (SELECT film_id
                              FROM film
				              WHERE title = 'NOON PAPI')); 
-- 4. 각 카테고리별 이메일이 JOYCE.EDWARDS@sakilacustomer.org인 고객이 빌린 DVD 대여 수 조회
 -- rental, customer, inventory, film_category, category
SELECT * FROM  rental; 
-- rental_id = 1~ ,inventory_id=367~,customer_id=130~
SELECT * FROM  customer; 
-- customer_id = 1~ 
SELECT * FROM   inventory; 
-- inventory_id=1~,film_id=11111~22222
SELECT * FROM   film;
 -- film_id = 1~ 
SELECT * FROM   film_category;
 -- film_id=1~ category_id=6~11 
SELECT * FROM   category; 
-- category_id = 1~ name:1~16
-- rental, customer, inventory, film_category, category

-- 4. 각 카테고리별 이메일이 JOYCE.EDWARDS@sakilacustomer.org인 고객이 빌린 DVD 대여 수 조회
 -- rental, customer, inventory, film_category, category
 
SELECT name category ,customer_id,count(customer_id) count
FROM category
JOIN film_category USING (category_id)
JOIN inventory USING (film_id)
JOIN rental USING (inventory_id)
JOIN customer USING (customer_id)
WHERE email='JOYCE.EDWARDS@sakilacustomer.org';
-- GROUP BY name;
-- categoryId - 16까지 임
-- JOYCE customer_id : 49 store_Id=2 active=1
-- 5. 이메일이 JOYCE.EDWARDS@sakilacustomer.org인 고객이 가장 최근에 빌린 영화 제목과 영화 내용을 조회
-- rental,inventory,film,customer

SELECT * FROM customer; -- customer_id,email
SELECT * FROM rental; -- rental_id,rental_date,customer_id

SELECT name,distriction
FROM rental
JOIN film_category USING (category_id)
JOIN customer USING (customer_id)
JOIN inventory USING (inventory_id)
JOIN film USING (film_id)
WHERE email='JOYCE.EDWARDS@sakilacustomer.org'
ORDER BY rental_date DESC
LIMIT 1;

SELECT title,description
FROM rental 
JOIN inventory USING (inventory_id)
	JOIN customer USING (customer_id)
WHERE email = 'JOYCE.EDWARDS@sakilacustomer.org';

-- KH 테이블을 이용해서 사수 이름을 만들기 
SELECT e.emp_id "사원번호",e.emp_name "사원명",
       m.emp_id "사수번호" ,m.emp_name "사수명"
FROM employee e
LEFT JOIN employee m ON (e.manager_id=m.emp_id);
