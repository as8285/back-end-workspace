package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {
	
	Scanner sc = new Scanner(System.in);
	private char[] result;		
	
	public void method1(){
		char ch = '\u0000';
		System.out.print("문자 : ");
		int num = sc.nextLine().charAt(0);
		System.out.println("A unicode : " + num);
		System.out.println("B unicode : " + ++num);
	
		
	}
	
	public void method2(){
		System.out.print("국어 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int num3 = sc.nextInt();
		
		int sum = num1+num2+num3;
		
		System.out.println("총점 : " + sum);
		System.out.print("평균 : "+(double)sum/3);
		
	}

	public static void main(String[] args) {
		 CastingPractice a = new  CastingPractice();
		 a.method1();
		   //a.method2();
	}

}
