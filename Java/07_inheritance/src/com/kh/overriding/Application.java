package com.kh.overriding;

import com.kh.overriding.model.Customer;
import com.kh.overriding.model.VIPCustomer;

public class Application {

	public static void main(String[] args) {

		Customer customer1 = new Customer("이상현");
		Customer customer2 = new Customer("이상현");

		System.out.println(customer1); // com.kh.overriding.model.Customer@6f2b958e 주소값
		System.out.println(customer2); // com.kh.overriding.model.Customer@5e91993f 주소값 다름
		// to string 사용 후 Customer [name=이상현, grade=SILVER, bonusPoint=0,
		// bonusRatio=0.01]
		System.out.println(customer1 == customer2); // false가 나온다
		// System.out.println(customer1.equals(customer2));//false

		/*
		 * 같은 사람으로 만들기 ! (Customer에서 확인 )
		 * 
		 * @Override // <-- 어노 테이션! '이 메서드는 재정의 된 메서드 이다. ' 라고 명확히 알려주는 역활' public
		 * boolean equals(Object obj) { Customer c = (Customer) obj; // 다형성 ! return
		 * this.name == c.name; }
		 */

		System.out.println(customer1.equals(customer2));// true	
		VIPCustomer customer3 = new VIPCustomer("정세영");
		VIPCustomer customer4 = new VIPCustomer("정세영");
		System.out.println(customer3.equals(customer4)); // true
		
		// customer1 또는 customer2 
		// customer 3 또는 customer4
		// ~~ 님의 등급은 ~~ 이며 지불해야하는 금액은 ~이며 적립된 포인트는 ~~ 입니다.
		System.out.printf("%s님의 등급은 %s이며 지불해야하는 금액은 %d이며 적립된 포인트는 %d입니다\n",
		customer1.getName(),customer1.getGrade(),customer3.calcPrice(1000),customer1.getBonusPoint());
		
		System.out.printf("%s님의 등급은 %s이며 지불해야하는 금액은 %d이며 적립된 포인트는 %d입니다",
				customer3.getName(),customer3.getGrade(),customer3.calcPrice(1000),customer3.getBonusPoint());

    
	}

}
