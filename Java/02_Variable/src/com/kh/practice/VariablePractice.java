// 클래스 이름 : com.kh.practice.VariablePractice 
// FQCN(Fully Qualified Class Name)
package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {

	/*
	 * 실습문제 1 영화관 요금표는 다음과 같습니다. - 성인 : 10000원 - 청소년 : 7000원 성인 2명과 청소년 3명이 영화를 보려고
	 * 할때 지불해야 할 금액을 계산후 출력하시오
	 * 
	 */
	public void method1() {
		int num1 = 2 * 10000;
		int num2 = 3 * 7000;

		System.out.println("성인 2명 : " + num1);
		System.out.println("청소년 3명 : " + num2);
		System.out.println("총금액 :" + (num1 + num2));
	}

	public void method2() {

		int x = 5;
		int y = 7;
		int z = 9;

		x = y;
		y = z;
		int i = 5;
		z = i;

		System.out.println("x=" + x);

		System.out.println("y=" + y);

		System.out.println("z=" + z);
	}

	public void method3() {

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열를 입력하세요 :");

		String str = sc.nextLine();
		System.out.println("첫번째문자 :" + str.charAt(0));
		System.out.println("마지막문자 :" + str.charAt(str.length() - 1));
	}

	public static void main(String[] args) {
		VariablePractice v = new VariablePractice();
		// v.method1();
		v.method2();
		// v.method3();
	}
}