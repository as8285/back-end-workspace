package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 * */
	
	
	public void method1() {
		// 5인 배열 선업 
		String[]fruit =new String [5];
		
		fruit[0] = "사과";
		fruit[1] = "딸기";
		fruit[2] = "귤";
		fruit[3] = "메론";
		fruit[4] = "바나나";
	
	System.out.println(fruit[1]);
		  }
		
	

		
	

		

	
	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후
	 * 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4
	 * 배열 1번째 인덱스에 넣을 값 : -4
	 * 배열 2번째 인덱스에 넣을 값 : 3
	 * 배열 3번째 인덱스에 넣을 값 : -3
	 * 배열 4번째 인덱스에 넣을 값 : 2
	 * [4, -4, 3, -3, 2]
	 * 2
	 * */
	public void method2() {
		System.out.println("정수를 입력하세요 >");
		int num = sc.nextInt();
		System.out.println("정수 : " + num); // 5 
     // 배열 담을 값 생성 
		String[] arr = new String [num];
	   for(int i=0;i<=num;i++) { 	 
		   System.out.print("배열" + i +"번째" + "인덱스에" + "넣을 값 :" );
		   int num2 = sc.nextInt();
	   }
		  
	}
	


		
	
	
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 출력하세요.
	 * 
	 * */
	public void method3() {
		System.out.println("음식메뉴를 입력하세요 : ");
		String menu = sc.nextLine();
//		String arr[] = new String[[menu.length()]];
	
	    for(int i =0 ; i<=5;i++) {
	    	System.out.println(menu);
	    }
	}
	
	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요.
	 * 단, 원본 배열은 건드리지 않고! 
	 * 
	 * 주민등록번호 : 123456-1234567
	 * 123456-1******
	 * 
	 * */
	public void method4() {
		
	}
	
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * 단어 입력 : programming
	 * gnimmargorp
	 * 
	 * */
	public void method5() {
		
	}
	

public static void main(String[] args) {
	 ArrayPractice a = new ArrayPractice();
	 //a.method1();
	 //a.method2();
	 a.method3();
	 
	
}
}