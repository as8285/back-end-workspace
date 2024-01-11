package com.kh.condition;

import java.util.Scanner;

public class A_If {

	Scanner sc = new Scanner(System.in);
	
	/*
	 * if문 
	 * if(조건식){
	 * 	  조건식이 참(true)일 때 실행 
	 * }
	 * - 보통 조건식에는 비교연산자,논리연사자를 주로 사용
	 * */
	public void method1() {
		
		//  입력받은 성적이 60점 이상이면 "합격입니다"를 출력 
		System.out.println("성적을 입력하세요>");
		int score =Integer.parseInt(sc.nextLine());
		
		if(score>=60) { // 권장 
			
			System.out.println("합격입니다");	
			System.out.println("축하합니다");	
		}

		if(score>=60)System.out.println("합격입니다"); // 한 줄만 들어 갔을 떄는 유용 			
	
		if(score>=60)
			System.out.println("합격입니다");//비추천
		System.out.println("축하합니다22");//if문 바깥에 있는 걸로 인식 
	}
	
	/*
	 * if- else문 
	 * 
	 * if(조건식){
	 * 		조건식이 참(true)일 때 실행 
	 * } else {
	 * 		조건식이 거짓(false)일 때 실행 
	 * } 
	 * */
	
	public void method2() {
		
	//  입력받은 성적이 60점 이상이면 "합격입니다",아니면 "불합격입니다. " 출력 
			System.out.println("성적을 입력하세요>");
			int score =Integer.parseInt(sc.nextLine());
			
			if(score>=60) { // 권장 
				
				System.out.println("합격입니다");	
				System.out.println("축하합니다");	
			}
			else {
				System.out.println("불합격입니다");		
			}
			
			// 삼항연산자	
			String result = (score>=60)?"합격입니다":"불합격입니다";
				System.out.println(result);
	}
	
	public void method3() {
		// 본인의 이름을 입력했을 때 본인이면 "본인이다",아니면 "본인이 아니다"를 출력
	    // String -> 참조형 변수 (클래스 변수)는 주소값을 저장 ! 
		System.out.println("이름을 입력하세요>");
		String name = sc.nextLine();
		System.out.println("name의 주소값" + System.identityHashCode(name));
		System.out.println("name의 주소값" + System.identityHashCode("윤민영"));
		System.out.println(name == "윤민영"); // false 
		System.out.println(name.equals("윤민영"));
		
		if(name.equals("윤민영")) {
			System.out.println("본인이다.");
		}else {
			System.out.println("본인이 아니다");
		}
		
	}
	
	public void method4() {
		// 입력받은 숫자가 0 보다 크면 "양수", 0이면 "0이다", 작으면 "음수"출력 
		System.out.println("숫자를 입력하세요>");
		int number =Integer.parseInt(sc.nextLine());
	
	// 삼항 연산자 
	 String result = number >=0 ? "양수" :number == 0 ? "0이다" : "음수";
	 
	 // if 문 
	 if(number > 0 ) {
		 System.out.println("양수");
	 }else {
		 if(number == 0) {
		 // if문은 중첩 가능 ! 
	   System.out.println("0이다");
		 }else {
			 System.out.println("음수");
		 }
	 }
	

		if (number > 0) {
			System.out.println("양수");
		} else if (number == 0) {
			System.out.println("0이다");
		} else {
			System.out.println("음수");
		}
	}
	
	/*
	 * if-else if -else문 
	 * 
	 * if(조건식1){
	 * 		조건식1이 참(true)일 때 실행 
	 * 	
	 * }else if(조건식2) {
	 * 			조건식1이 거짓(false)이면서 조건식2이 참(true)일 때 실행
	 * 
	 * } else{
	 * 			조건식1,조건식2 모두 거짓(false)일 때 실행 
	 *
	 * }
	 * - else if 수는 제한이 없다.
	 * */
	
	
	
	/*
	 * 사용자에게 점수(0~100)를 입력받아서 점수별로 등급을 출력 
	 * -90점 이상은 A등급 
	 * -90점 미만 80점 이상은 B등급 
	 * -80점 미만 70점 이상은 C등급 
	 * -70점 미만 60점 이상은 D등급 
	 * -60점 미만 F등급 
	 * */

	public void practice1() {
		/*System.out.println("점수를 입력하세요 >");
		int score =Integer.parseInt(sc.nextLine());
		if (score >= 90) {
			System.out.println("A등급");
		} else if (score >= 80 && score < 90) {
			System.out.println("B등급");
		} else if (score >= 70 && score < 80) {
			System.out.println("C등급");
		} else if (score >= 60 && score < 70) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
	}
	*/
		System.out.println("점수입력(0~100점) >");
		int score sc.nextInt();
		String grade = ""; 
		if (score >= 90) {
		grade="A등급";
		}
		else if (score >= 80) {
			grade="B등급";
			}
		else if (score >= 70) {
			grade="C등급";
			}
		else if (score >= 60) {
			grade="D등급";
			}
		else {
			grade="F등급";
					}
	}
	
	
	/*
	 * 세 정수를 입력했을 때 짝수만 출력 
	 * 
	 * num1 입력 > 3 
	 * num2 입력 > 4 
	 * num3 입력 > 6 
	 * 4
	 * 6
	 * 
	 * */
public void practice2() {
		System.out.println("첫번째 숫자를 입력하세요 >");
		int num1 =Integer.parseInt( sc.nextLine());
		System.out.println("두번째 숫자를 입력하세요 >");
		int num2=Integer.parseInt( sc.nextLine());
		System.out.println("세번째 숫자를 입력하세요 >");
		int num3 =Integer.parseInt( sc.nextLine());
		
			if (num1 % 2 == 0) System.out.println(num1);
		if (num2 % 2 == 0) System.out.println(num2);
		if (num3 % 2 == 0) System.out.println(num3);
		}
		
		
		
		
	/*if (num1 % 2==0) {	
		System.out.println(num1);
		
		
		if (num2 % 2==0) {
			System.out.println(num3);
			if (num3 % 2==0){	
				System.out.println(num3);
		}
	}
	else {
	if (num3 % 2==0){	
		System.out.println(num3);
	}
	}
	}else {
		if (num2 % 2==0){	
			System.out.println(num2);
		}
	}

*/
// if ~ else if 사용! 중첩 X - > 비추천 !!! 

/*if(num1 % 2 == 0 && num2 %2 == 0 && num3 % 2 == 0) {
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);	
} else if(num1 % 2 == 0 && num2 %2 == 0 && num3 % 2 != 0) {
	System.out.println(num1);
	System.out.println(num2);
	
}else if(num1 % 2 == 0 && num2 %2 != 0 && num3 % 2 == 0) {
	System.out.println(num1);
	System.out.println(num3);
	
} else if (num1 % 2 == 0 && num2 %2 != 0 && num3 % 2 != 0) {
	System.out.println(num1);
} else if (num1 % 2 != 0 && num2 %2 == 0 && num3 % 2 == 0) 
	System.out.println(num2);
    System.out.println(num3);
} else if (num1 % 2 != 0 && num2 %2 != 0 && num3 % 2 == 0) {
     System.out.println(num3);
}
}
*/



/*
 * 정수 1개를 입력했을 때 음(minus) /양(plus)/0(zero),짝(even)/홀(odd) 출력 
 *
 * 정수 입력 > -3
 * minus 
 * odd
 * */






public void practice3() {
	System.out.println("정수를 입력하세요 >");
	int number =Integer.parseInt( sc.nextLine());
	 
	if (number ==0){
		result2 = "";
		}else if(number %2== 0) {
			result2 = "even";
		}else {
			result2 = "odd";
		}
	}
System.out.println(result2);







	public static void main(String[] args) {
		A_If a = new A_If(); 
		// a.method1();
		// a.method2();
		// a.method3();
		// a.method4();
		// a.practice1();
		// a.practice2();
		a.practice3();
	}

}
