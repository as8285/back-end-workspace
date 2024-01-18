package com.coupang.model;

import java.util.Date;

public class Review {
	private int reviCode;
	private String reviTitle;
	private String reviDesc;
	private Date reviDate;
	private int rating;
	
	private Customer customer;
	private Product product;
}
/*CREATE TABLE review(
		revi_code INT AUTO_INCREMENT PRIMARY KEY, -- 리뷰 코드 
	    id VARCHAR(50), -- 아이디 
	    prod_code INT, -- 상품 코드 
	    revi_title VARCHAR(50), -- 제목 
	    revi_desc TEXT, -- 설명 
	    revi_date DATE DEFAULT (current_date), -- 작성 날짜 
	    rating INT -- 평점 
	); -- 리뷰 */