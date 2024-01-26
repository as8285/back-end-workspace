package com.kh.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 * */
	
	
	public void method1() {
		// 5인 배열 선업 
	/*	String[]fruit =new String [5];
		
		fruit[0] = "사과";
		fruit[1] = "딸기";
		fruit[2] = "귤";
		fruit[3] = "메론";
		fruit[4] = "바나나";
	
	System.out.println(fruit[1]);
		  }
		


		
	String[]fruit = {"복숭아","딸기","귤","레몬",};
	int num =(int)(Math.random()*5);
	System.out.println(fruit[num]);

	}

		*/
		
		
	// ArrayList로 풀어보기 
		String[]fruit = {"복숭아","딸기","귤","레몬",};
		ArrayList<String>fruitList = new ArrayList<>(Arrays.asList(fruit));
		int num =(int)(Math.random()*5);
	   
	   /*fruitList.add("복숭아");
	   fruitList.add("딸기");
	   fruitList.add("귤");
	   fruitList.add("레몬");
	   fruitList.add("바나나");*/
		
	   System.out.println(fruitList.get(num));
	   
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
		
	System.out.print("정수 : ");
	    int num = sc.nextInt();
	    int[] score = new int[num];
	    ArrayList<Integer>arrList = new ArrayList<>();
	    for(int i = 0; i < score.length; i++) {
	        System.out.printf("배열"+ i +"번째 인덱스에 넣을 값 : ");
	        int answer=sc.nextInt();
	        arrList.add(answer);
	        sum+=answer;
	        
	        score[i] = sc.nextInt();
	    }
	}
	    int sum = 0;
	   /* for(int i = 0; i < score.length; i++) {
	        System.out.print(score[i] + " ");
	        sum += score[i];
	    }
	    System.out.println(Arrays.toString(score));
	    System.out.println("총 합 : " + sum);
	

		 /*  ArrayList<Integer>arrList = new ArrayList();
		   for(int i = 0;i<num;i++) {
			   System.out.println("배열" + i + "번째 인덱스에 넣을 값 : ");
			   arrList.add(sc.nextInt());
			   sum+=arrList.get(i);
			   
		   }
		   System.out.println(sum);
	}*/
 
	
	


		
	
	
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 출력하세요.
	 * 
	 * */
	public void method3() {
	/*	
	 	내가 푼거!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 * System.out.print("음식메뉴를 입력하세요 : ");
		String food = sc.nextLine();
		String menu[] = { "햄버거", "피자", "감자튀김", "바지락칼국수" };
		for (int i = 0; i <= 5; i++) {
			if (menu[i].equals(food)) {
				System.out.print("배달 가능");
				break;

			}
			if (!menu[i].equals(food)) {
				System.out.print("배달 불가능");
				break;
			}
		}
	}
		*/	
		
/*강사님 풀이 */		
		String[]menu = {"떡볶이","마라탕","케이크","닭발","피자","치킨"};
          System.out.print("주문하실 메뉴를 골라주세요 : ");
          String select = sc.nextLine(); 
          
          /*  for(String food : menu) {
        	  // 조건문 짜기 ! 
        	  if(select.equals(food)) {
        	  System.out.println("배달 가능");
        	  }else if(){
        		  System.out.println("배달 불가능");
        		  */
        	  
         /* for(int i = 0; i<menu.length;i++) {
        	  // 조건문 짜기 ! 
        	  if(select.equals(menu[i])) {
        	  System.out.println("배달 가능");
        	  break;
        	  }else if(i==menu.length-1){
        		  System.out.println("배달 불가능");
          
          
        	  }
        	 boolean check = false; 
        	 for(String food : menu) {
        		 if(select.equals(food)) {
        			 check= true;
        			 
        		 }
        		 
        	 }System.out.println(check ? "배달가능" : "배달 불가능");
          }
	*/

      // ArrayList로 바꾸기 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
          /*String[]menu = {"떡볶이","마라탕","케이크","닭발","피자","치킨"};
          System.out.print("주문하실 메뉴를 골라주세요 : ");
          String select = sc.nextLine(); */
          
         
	 ArrayList<String>menuList = new ArrayList<>(Arrays.asList(menu));
	 System.out.println(menuList);
	 boolean check = false; 
	 for(String food : menuList) {
		 if(select.equals(food)) {
			 check= true;
			 
		 }
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
		/*내가 푼거 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 * System.out.print("주민등록번호 : ");
		String str = sc.nextLine();
		char[] number = new char[str.length()];
		for (int i = 0; i < number.length; i++) {

			number[i] = str.charAt(i);

			if (i > 7) {
				number[i] = '*';
			}

			System.out.print(number[i]);

		}
	}*/
	
	// 강사님 풀이
		/*System.out.println("주민 등록 번호 : ");
		String no = sc.nextLine();
		char[]charNo = no.toCharArray(); 
		String[]strNo = no.split("");
		// 조건을 생각 !!!!!!!
		for(int i=0; i<charNo.length;i++) {
			if(i<=7) {
				System.out.print(strNo[i]);	
			}else {
				System.out.print("*");
			}
		}
	}*/
// ArrayList로 바꾸기 !!!!!!!!!!!!!!!!!!!
		System.out.println("주민 등록 번호 : ");
		String no = sc.nextLine();
	char[]charNo = no.toCharArray(); 
	String[]strNo = no.split("");
	ArrayList<String>noList = new ArrayList<>(Arrays.asList(strNo));
	//ArrayList<String>noList = new ArrayList<>(Arrays.asList(strNo));
	// 조건을 생각 !!!!!!!
	for(int i=0; i<charNo.length;i++) {
		if(i<=7) {
			System.out.print(noList.get(i));	
		}else {
			System.out.print("*");
		}
	}
	}
	
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * 단어 입력 : programming
	 * gnimmargorp
	 * 
	 * */
	public void method5() {
/*  내가 푼거 !!!!!!!!!!!
		System.out.print("단어 입력 : ");
		String word = sc.nextLine();  
		for(int i =word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
		}
	}*/
		/* 강사님 풀이 
		System.out.print("단어 입력 : ");
		String word = sc.nextLine();  
		String[]wordArr = word.split("");
		for(int i =wordArr.length-1;i>=0;i--) {
			System.out.print(wordArr[i]);
		}
		
	}	
		*/
		
		// ArrayList로 바꾸기 
		System.out.print("단어 입력 : ");
		String word = sc.nextLine();  
		String[]wordArr = word.split("");
		ArrayList<String>wordList = new ArrayList<>(Arrays.asList(wordArr));
	    Collections.reverse(wordList);
		for(String s : wordList) {
			System.out.print(s);
		}
	
				
	}
				
public static void main(String[] args) {
	 ArrayPractice a = new ArrayPractice();
	//a.method1();
	//a.method2();
	//a.method3();
	 //a.method4();
 a.method5();
	 
	
}
}