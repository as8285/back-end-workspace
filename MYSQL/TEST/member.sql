DROP TABLE member;
CREATE TABLE member(
id VARCHAR(20)PRIMARY KEY,
password VARCHAR(100),
name VARCHAR(20),
auth VARCHAR(20) DEFAULT 'ROLE_MEMBER',
enabled INT DEFAULT 1
);
SELECT*FROM member;
UPDATE member
SET auth='ROLE_ADMIN'
WHERE id='admin';

UPDATE member
SET enabled=0
WHERE id='user';