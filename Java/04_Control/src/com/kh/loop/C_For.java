package com.kh.loop;

import java.util.Scanner;

public class C_For {
	
	Scanner sc = new Scanner(System.in);
	private int d;
	/*
	 * for문 
	 * for(초기식;조건식;증감식){
	 * 
	 * }
	 * 
	 * - 주어진 횟수만큼 코드를 반복 실행하는 구문
	 * - 초기식 : 반복문이 수행될 때 단 한번만 실행,반복문 안에서 사용할 변수를 선언하고 초기값을 대입
	 * - 조건식 : 결과가 true이면 실행 코드를 실행, false이면 실행하지 않고 반복문을 빠져 나감 
	 * - 증감식 : 반복문에 사용하는 변수의 값을 증감시킴
	 * */
	
	// 1 ~ 5 출력
	public void method1() {
		
		System.out.println("숫자를 입력하세요 >");
	
		for(int i=1; i<=5;i++ ) {
			System.out.println(i);
		
		}
	}
	// 1 ~ 5 반대로 출력
	public void method2() {
		
		System.out.println("숫자를 입력하세요 >");
	
		for(int i=5; i>=1;i-- ) {
			System.out.println(i);
		
		}
	}
	// 1 ~ 10 사이의 홀수만 출력
	//1 + 2 
	//3 + 2
	//5 + 2
	//7 + 2
	//9 
	public void method3() {
		System.out.println("홀수만 출력하세요>");
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
	}
	
	public void method4() {
		System.out.println("홀수만 출력하세요>");
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
	}
	/*
	 * continue 문 
	 * 
	 * - continue 문은 반목문 안에서 사용 
	 * - 반복문 안에서 continue를 만나면 "현재 구문" 종료 
	 * - 반복문을 빠져나가는 건 아님 ! 다음반복을 계속 수행 
	 * 
	 * 
	 * */
	
	
	// 1 ~ 10 사이의 짝수만 출력
	public void method4() {
		System.out.println("짝수만 출력하세요>");
		for(int i=1;i<=10;i++) {
			if(i%2!=0)continue;
			System.out.println(i);
			//if(i%2==0)System.out.println(i);
		}
	}

	public void method5() {
		int sum = 0;
		for (int i=1;i<=10;i++) {
			sum+=i;
	
			//if(i%2==0)System.out.println(i);
		}
		
		System.out.println(sum);
	}
	
	
	// 1부터 사용자가 입력한 수 까지의 합계 
	
	public void method6() {
		System.out.println("숫자를 입력하세요>");
		int num = sc.nextInt();
		int sum = 0;
		for (int i=num;i<=num;i++) {
			sum+=i;
	
			
		}
		System.out.println(sum);
		}
	
	// 1 부터 랜던값까지의 합계
	public void method7() {
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random()메서드
		 * 호출할 때 마다 매번 다른 랜덤값을 얻어낼 수 있음 
		 * */
		double random= Math.random(); // 0.0 <=random <1.0
		random = Math.random()*10;
		random = Math.random()*10 + 1; // 1.0 <= random < 11.0 
		System.out.println((int)random);
		

		System.out.println("숫자를 입력하세요 >");
		int num = sc.nextInt();
		int sum = 0; 
		for(int i = num; i<=num; i++) {
			sum+=i;
			
		}
		System.out.println(sum);
	}
	
/*
 * 사용자한테 입력받은 문자열을 세로로 출력
 * 사용자 입력 > Hello
 * 
 * H = > str.charAT(0)
 * e = > str.charAT(1)
 * l = > str.charAT(2)
 * l = > str.charAT(3)
 * o = > str.charAT(4)
 * 
 * */
	public void method8() {
		
	System.out.println("문자를 입력하세요>");
	String str = sc.nextLine();
/*	for (int i = 0;i<=str.length()-1;i++) {
		
		System.out.println(str.charAt(i));	
	}	
	*/
	/*
	 * 향상된 for문 
	 * for(데이터타입 변수 : 배열){
	 * 
	 * }
	 * */
	
	/*
	 * 문자열 : 문자의 배열, 여러개의 문자가 배열을 이룬 것이 문자열
	 * 
	 * - String.charAt(int index) : 인덱스에 있는 문자를 char 형식으로 반환  
	 * - String.toCharArray() : 모든 문자가 들어 있는 char [] 형식으로 데이터를 반환
	 * */
	char[] arr = str.toCharArray();
	System.out.println(arr);	
	for(char ch : arr) {
	System.out.println(ch);	
	}
	
	}
	// 구구단 - 2단 출력
	public void method9() {
		System.out.println("2단을 출력하세요");
		int num = sc.nextInt();
	    
		for(int i = 1; i <=9; i++) {
			System.out.println("2 X" + i + " = "+2 * i);
		}
		
	}
	
	// 중첩 for문 
	// 2 ~ 9단출력 
	public void method10() {
		System.out.println("구구단을 출력하세요");
		int num = sc.nextInt();
	    
		for(int i = 1; i <=9;i++)  
		for(int d = 2 ; d<=9;d++) 	
		{
			System.out.println (d +"X" + i + " = "+2 * i);		
	}
	}
	
	/*
	 *   1  *****
	 *   2  *****
	 *   3  *****
	 *   4  *****
	 * */
	
	public void method11() {
		for(int i=0; i<4;i++){
	    for(int d=0; d<5;d++) {
	    	System.out.print("*");
	    }
	  	
		System.out.println("");
	    	}
	}
	   

	/*
	 * 
	 * i 증가하면 -> 숫자마다 자리 차지 
	 * 
	 * 
	 * 1***
	 * *2**
	 * **3*
	 * ***4
	 * */
	
	
	public void method12() {
		for(int i=0; i<4;i++){
	    for(int j=0; j<4;j++) {
	    	System.out.print(i+","+j+"");
	    	if(i==j)System.out.println(i+1);
	    	else System.out.print("*");
	    }
	   
	}
	   
	}
	
	
	
	
	/*
	 * 	*     i = 0 j=0
	 * 	**    i = 1 j=0,j=1
	 * 	***   i = 2 j=0,j=1,j=2,j=3
	 * 	****  i = 3 j=0,j=1,j=2,j=3,j=4
	 * */
	public void method13() {
		for(int i =0; i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		
	}
	
	/*
	 *     * i=0,j=4
	 *    ** i=1,j=3,j=4
	 *   *** i=2,j=2,j=3,j=4
	 *  **** i=3,j=1,j=2,j=3,j=4
	 * ***** i=4,j=0,j=1,j=2,j=3,j=4
	 * */
	public void method14() {
		
		for(int i=0;i<5;i++) {
			for(int j=4;j>=0;j--) {
				if(i <j)System.out.print(" ");
				else System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
		
	
	public static void main(String[] args) {
       C_For c = new C_For();
       //c.method1();
       //c.method2();
      //c.method3();
 
      //c.method4();
      // c.method5();
      //c.method6();
      // c.method7();
       c.method7();
      //c.method8();
      //c.method9();
      //c.method10();
     //c.method11();
      //c.method12();
      //c.method13();
      //c.method14();
	}

}
