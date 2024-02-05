SELECT * FROM kh.member;
INSERT INTO member VALUES('test','test1234','테스트');
SELECT id FROM member WHERE id = 'test';





CREATE TABLE bank(
name VARCHAR(20),
bankname VARCHAR(20),
balance INT
);

SELECT balance FROM bank WHERE name = '정대윤';
SELECT * FROM bank;

INSERT INTO bank VALUES('정대윤', '국민은행', 1000000);
INSERT INTO bank VALUES('신대규', '신한은행', 0);