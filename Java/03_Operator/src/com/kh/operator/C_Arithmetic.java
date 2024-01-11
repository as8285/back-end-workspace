/**
 * 
 */
package com.kh.operator;

/**
 * @author user1
 *
 */
public class C_Arithmetic {
	
	
	

	/*
	 * 산술 연산자 
	 * + :더하기
	 * - : 빼기
	 * * : 곱하기 
	 * / : 나누기 
	 *  % : 나머지
	 * 
	 * */
		
	
	public static void main(String[] args) {
		
		C_Arithmetic c = new C_Arithmetic();
		// c.method1();
		c.method2();
	}
	

	public void method1() {
		
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;

		System.out.printf("%f\t%f\n", dNum1, dNum2); // 무조건 소수점 아래 6번째 짜리까지
	
		
		
		
		

	}

public void method2() {
	int a = 5; 
	int b = 10;
	int c = (++a) + b;  // 6+10= 16  a= 6 
	int d = c / a;
	// 16 / 6 = 2
	int e = c % a; // 16 % 6 = 4
	int f = e++; // 5
	int g = (--b) + (d--); // 9
	int h = 2; 
	int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
	         // 6 + 9 / (15 / 4) * (11-1) % (6+2);
	         // 6 + 9 / 3 * 10 % 8 
	         // 6 + 30 % 8
	         // 6 + 6
	         // 12 
	
	System.out.println(i); // 12 
	        
}         
}