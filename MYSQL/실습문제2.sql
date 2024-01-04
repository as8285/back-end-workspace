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
SELECT country,city,address,district,first_name,last_name
FROM customer
JOIN address USING (address_id)
JOIN city USING (city_id)
JOIN country USING (country_id)
WHERE first_name ='TRACY';
-- 2. 배우 JULIA MCQUEEN이 찍은 영화 제목 조회 (title 기준 정렬 10개까지)
SELECT first_name,last_name,title
FROM actor
JOIN film_actor USING (actor_id)
JOIN film USING(film_id)
WHERE first_name='JULIA' AND last_name='MCQUEEN'
LIMIT 10;
-- 3. 영화 NOON PAPI에 나오는 배우들의 이름 조회
SELECT first_name,last_name
FROM actor
JOIN film_actor USING (actor_id)
JOIN film USING(film_id)
WHERE title='NOON PAPI' ;
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
 
SELECT name category ,customer_id-- count(customer_id) count
FROM category
JOIN film_category USING (category_id)
JOIN inventory USING (film_id)
JOIN rental USING (inventory_id)
JOIN customer USING (customer_id)
WHERE email='JOYCE.EDWARDS@sakilacustomer.org';
-- GROUP BY name;
-- categoryId - 16까지 임
-- JOYCE customer_id : 49 store_Id=2 active=1
 SELECT count(rental_date)
 FROM rental
 GROUP BY rental_date; 
-- 5. 이메일이 JOYCE.EDWARDS@sakilacustomer.org인 고객이 가장 최근에 빌린 영화 제목과 영화 내용을 조회
-- rental,inventory,film,customer
SELECT name category,distriction,rental_date
FROM category
JOIN film_category USING (category_id)
JOIN inventory USING (film_id)
JOIN rental USING (inventory_id)
JOIN customer USING (customer_id)
WHERE email='JOYCE.EDWARDS@sakilacustomer.org';
