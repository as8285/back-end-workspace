package com.coupang.model;

import java.util.Date;

	public class Swap {
		private int swapCode;
		private String reason;
		private Date swapDate;
		private int price;
		private String swapStatus;
		
		private Customer customer;
		private Product product;

}
/*CREATE TABLE swap(
		swap_code INT AUTO_INCREMENT PRIMARY KEY, -- 교환 반품 코드 
	    id VARCHAR(50), -- 아이디 
	    prod_code INT, -- 상품 코드 
	    reason TEXT, -- 사유 
	    swap_date DATE DEFAULT (current_date), -- 날짜 
	    price INT, -- 비용 
	    swap_status CHAR(2) CHECK(swap_status IN ('교환', '반품')) -- 교환/반품 
	); -- 교환/반품 
*/