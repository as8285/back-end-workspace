package com.kh.step4;

import com.kh.step4.model.Car;

public class Application {

	public static void main(String[] args) {
		Car c = new Car();
		/*실행 불가능 private
		c.color = "red";
		c.gearType = "auto";
		c.door = 4;
		*/
		Car c1 = new Car("white","auto",4);
		Car c2 = new Car("black","manual");
		System.out.println(c1);//com.kh.step4.model.Car@6f2b958e 주소값이 나온다
		System.out.println(c2); 
	}

	
	
	// 오버로딩 : 한 클래스 내에 동일한 이름의 메서드를 	
	//		   매개변수의 저료형과 개수,순서가 다르게 다르게 작성되어야 함
	void test() {}
	void test(int a) {}
	void test(int a,String s) {}
	void test(String s,int a) {}
	void test(int a, int b) {}
	// void test(int c, int d) {} 위에랑 같은 메서드로 인식해서 에러가 난다.
	
}
