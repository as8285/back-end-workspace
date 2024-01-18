package com.coupang.model;

import java.util.Date;

public class Product {
	
	private int proCode;
	private String enteId;
	private int cateCode;
	private String prodName;
	private String prodDesc;
	private int price;
	private int stock;
	private Date ProdDate; 


}
/*CREATE TABLE product(
		prod_code INT AUTO_INCREMENT PRIMARY KEY, -- 상품 코드 
	    ente_id VARCHAR(50), -- 업체 아이디 
	    cate_code INT, -- 카테고리 코드 
	    prod_name VARCHAR(30) NOT NULL, -- 상품명 
	    prod_desc TEXT, -- 상품 설명 
	    price INT NOT NULL, -- 가격
	    stock INT NOT NULL, -- 재고수량 
	    prod_date DATE DEFAULT(current_date) -- 상품등록일 
	);*/ 