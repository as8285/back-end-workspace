package com.kh.overriding.model;

public class Customer {
	protected String name; // 고객 이름
	protected String grade; // 고객 등급
	protected int bonusPoint; // 보너스 포인트
	protected double bonusRatio; // 보너스 적립 비율

	public Customer() {
		System.out.println("%d님의 등급은 ");
	}

	public Customer(String name) {
		this.name = name;
		this.grade = "SILVER";
		this.bonusRatio = 0.01;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", grade=" + grade + ", bonusPoint=" + bonusPoint + ", bonusRatio="
				+ bonusRatio + "]";
	}

	@Override // <-- 어노 테이션! '이 메서드는 재정의 된 메서드 이다. ' 라고 명확히 알려주는 역활'
	public boolean equals(Object obj) {
		Customer c = (Customer) obj; // 다형성 !
		return this.name == c.name;
	}



 
		public int calcPrice(int price) { 
			this.bonusPoint+=price * bonusRatio; // 보너스 포인트 계산 
			return price;

	}

}
