package com.coupang.model;

import java.util.Date;

public class Delivery {
private int deliCODE;
private int purCode;
private Date deliDate;
private String deliCompany;
private int cost;
private String deliAddr;

private Purchase purchase;
}
/*CREATE TABLE delivery(
		deli_code INT AUTO_INCREMENT PRIMARY KEY, -- 배송 코드 
	    pur_code INT, -- 구매 코드 
	    deli_date DATE DEFAULT (current_date), -- 배송 날짜
	    deli_company VARCHAR(30), -- 배송사 
	    deli_cost INT, -- 배송비 
	    deli_addr VARCHAR(100) -- 배송 주소 
	); -- 배송 
*/