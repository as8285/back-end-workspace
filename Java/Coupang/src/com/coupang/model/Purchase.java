package com.coupang.model;

import java.util.Date;

public class Purchase {
	
	private int purCode;
	private Date purDate;
	private String purStatus;
	
	private Customer customer;
	private Product product;
}
/*CREATE TABLE purchase(
		pur_code INT AUTO_INCREMENT PRIMARY KEY, -- 구매 코드 
	    id VARCHAR(50), -- 아이디 
	    prod_code INT, -- 상품 코드 
	    pur_date DATE DEFAULT (current_date), -- 구매 일시 
	    pur_status VARCHAR(10) CHECK (pur_status IN ('구매대기중', '구매중', '구매완료', 
													'배송대기중', '배송중', '배송완료'))
								DEFAULT '구매대기중' -- 구매 상태 
	); -- 구매 내역
*/