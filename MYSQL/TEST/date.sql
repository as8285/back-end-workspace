CREATE TABLE sample(
	sample_code INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(200), -- 명칭
    addr VARCHAR(200), -- 주소
    outline TEXT, -- 개요
    use_hour TEXT, -- 이용 시간
    start_date DATE, -- 시작 날짜
    end_date DATE, -- 마감 날짜
    detail TEXT -- 상세정보
);

SELECT * FROM sample;