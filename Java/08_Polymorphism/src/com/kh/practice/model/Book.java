package com.kh.practice.model;

public class Book {

	
	private String title; // 도서명  
	private boolean coupon;
	private int accessAge;
	
	
	/*public static void main(String[] args) {
	//책의 정보! 
	Book[]books = {
			new Book("맛있는 지중해식 레시피",true),
			new Book("카페 샌드위치 마스터 클래스",false),
			new Book("원피스 107",19),
			new Book("주술회전 24",15)
			를 받는 생성자 함수 만들기 
	};*/
	
	
	
	public Book(String title,boolean coupon) {
	this.title = title;
	this.coupon = coupon;
		
	}
	
	public Book(String title,int accessAge) {
		this.title = title;
		this.accessAge = accessAge;
		
	}
	
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", coupon=" + coupon + ", accessAge=" + accessAge + "]";
	}  
}
	/*
	 * 
	 * public Book(String title,boolean coupon) {
		System.out.println(title);
		System.out.println(coupon);
		
	}
	
	public Book(String title,int accessAge){
		System.out.println(title);
		System.out.println(accessAge);
	}
}*/
