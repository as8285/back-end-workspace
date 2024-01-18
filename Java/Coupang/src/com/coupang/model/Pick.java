package com.coupang.model;

import java.util.Date;

public class Pick {
	
	private int proCode;
	private Date PickDate;
	
	private Customer customer ;
	private Product product;

}
/*CREATE TABLE pick(
		pick_code INT AUTO_INCREMENT PRIMARY KEY, -- 찜 코드 
	    id VARCHAR(50), -- 아이디 
	    prod_code INT, -- 상품 코드 
	    pick_date DATE DEFAULT (current_date) -- 찜한 날짜 
	); -- 찜 
*/