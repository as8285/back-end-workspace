package com.kh.practice.model;

public class CookBook extends Book {
		
	
	private boolean coupon; // 요리 쿠폰 유무  

	public CookBook(String title, boolean coupon, boolean coupon2) {
		super(title, coupon);
		coupon = coupon2;
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return toString() + "/CookBook [coupon=" + coupon + "]";
	}
}
