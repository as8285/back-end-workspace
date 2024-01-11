package com.kh.operator;

public class A_LogicalNegation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 논리 부정 연산자 
		 * 
		 * !논리값(true,false)
		 * - 논리값을 반대로 바꾸는 연산자 (true -> false,false ->true)
		 * */
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1 부정 : " + !b1); // false 
		System.out.println("b2 부정 : " + !b2); // true 
		
		
		b1 = !b2;
		
		System.out.println(!!b1); // true 

		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f\t%f\n", dNum1, dNum2); // 무조건 소수점 아래 6번째 짜리까지
		System.out.printf("%.3f\t%.2f\n", dNum1, dNum2);
		
		
	}

}
