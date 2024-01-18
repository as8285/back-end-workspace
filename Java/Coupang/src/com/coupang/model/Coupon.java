package com.coupang.model;

import java.util.Date;

public class Coupon {
	private int couponCode;
	private String couponName;
	private Date expireDate;

	private Customer customer;
	private Product product;

}
/*CREATE TABLE coupon(
		coupon_code INT AUTO_INCREMENT PRIMARY KEY, -- 쿠폰 코드 
	    coupon_name VARCHAR(30), -- 쿠폰명
	    expiry_date DATE DEFAULT (current_date), -- 사용기한 
	    id VARCHAR(50), -- 아이디
	    prod_code INT -- 상품 코드 
	); -- 쿠폰 
*/