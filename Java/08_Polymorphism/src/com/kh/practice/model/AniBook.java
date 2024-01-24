package com.kh.practice.model;

public class AniBook  extends Book{
	private int accesAge; // 제한 나이

	public AniBook(String title, boolean coupon, int accesAge) {
		super(title, coupon);
		this.accesAge = accesAge;
	}
	
	
}
