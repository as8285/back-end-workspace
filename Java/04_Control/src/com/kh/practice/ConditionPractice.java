package com.kh.practice;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		ConditionPractice a = new ConditionPractice();
		// a.practice1();
		// a.practice2();
		// a.practice3();
		 //a.practice5();
		//a.practice6();
		//a.practice7();
		//a.practice8();
		a.practice9();

	}

    /*
       1. 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고 짝수가 아니면 “홀수다“를 출력하세요.
       양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
    
       숫자를 한 개 입력하세요 : -8
       양수만 입력해주세요.
     */
    public void practice1() {
    	System.out.println("숫자한 개 입력하세요 >");
    	int number = sc.nextInt(); 
    	if (number>0 &&number%2==0 ) {
    		System.out.println("짝수다");
    	}else {
    		System.out.println("홀수다");
    	}
    	
    }

    /*
        2. 정수 num1과 num2가 입력받아서 두 수가 같으면 1 다르면 -1을 출력하세요.

        num1 : 2
        num2 : 3
        -1

        num1 : 11
        num2 : 11
        1
     */
    public void practice2() {
    	 System.out.println("첫번째수 >");
    	 int num1 = sc.nextInt(); 
    	 
    	 System.out.println("두번째수 >"); 
    	 int num2 = sc.nextInt(); 
    	 
    	 if (num1==num2) {
    		 System.out.println("1");
    	 }else if(num1!=num2){
    	  System.out.println("-1");
    	 }
    
    	
    }

    /*
        3. A 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라준다.
        피자 조각 수와 피자를 먹는 사람의 수를 입력받아 한 사람 당 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지 출력하세요.

        피자 조각 수 : 7
        피자 먹는 사람 수 : 10
        2

     */
	public void practice3() {
		System.out.println("피자 조각 수를 입력하세요>");
		int pizza = sc.nextInt();
		System.out.println("인원수를 입력하세요?");
		int person = sc.nextInt();

		if (pizza > person) {
			int result = (pizza / person);
			System.out.println(result);
		}
		else if (pizza == person) {
			int result = (pizza / person);
			System.out.println(result);

		}
		else if (pizza < person) {
			int num = 1;
			int result = (num + (pizza / person));
			System.out.println(result + 1);
		}
	}
	
	
	/*피자 조각이 12 / 11/ 1 
	피자 조각이 12/ 12 / 1 
	피자 조각이 13/ 12/ 2 
	
    /*
        4. 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
        (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
        합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고 불합격인 경우에는 “불합격입니다.”를 출력하세요.
    
        국어점수 : 88 
        수학점수 : 50 
        영어점수 : 40 
        불합격입니다.

        국어점수 : 88
        수학점수 : 50
        영어점수 : 45
        합계 : 183
        평균 : 61.0
        축하합니다, 합격입니다!
     */
    public void practice4() {
    	
    	System.out.println("국어점수:");
    	int num1 = sc.nextInt();
    	
    	System.out.println("수학점수:");
    	int num2 = sc.nextInt();
    	
    	System.out.println("영어점수:");
    	int num3 = sc.nextInt();
		if (num1>=40 && num2>=40 && num3>=40) {
        String sum= ("합계: "+(num1 + num2+num3));
        String avg= ("평균: "+((num2 + num2+num3)/3));
       
        System.out.println(sum + 
        		          avg +  "축하합니다,합격입니다!");
        }else {
        	System.out.println("불합격입니다");
        }
   
    	
    }

    /*
        5. B 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만원 이상 사면 20%를 할인해준다.
        구매한 옷의 가격을 입력했을 때, 지불해야 할 금액을 출력하세요.
        
        구매한 옷 가격 : 580,000
        464,000
     */
    public void practice5() {
    	
    	System.out.println("가격을 입력하세요 >");
    	int num = sc.nextInt(); 
    	
    	if (num >=100000 && num <300000) {
    	
    		System.out.println(String.format("%,d", num));
    
    	}else if (num >=300000 && num < 500000) {
    		System.out.println("지불 값 : "+ String.format("%,d", num*0.9));
    			
    	}
    	else if (num>500000) {
    		System.out.println("지불 값 :" + String.format("%,d", num*0.9));
    	
    
    	}
    	
    }


    /*
        6. 각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류한다.
        입력받은 값에 따라 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 출력하세요.
     */
    public void practice6() {
    	System.out.println("각을 입력하세요 >");   	 
    	int num = sc.nextInt();
		if (num < 90) {
			System.out.println('1');
		} else if (num == 90) {
			System.out.println('2');
		} else if (num < 180) {
			System.out.println('3');
		} else if (num == 180) {
			System.out.println('4');
		}
    	
    	
    }


    /*
       7. 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
          로그인 성공 시 “로그인 성공”, 
          아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
        
          비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
          둘다 틀렸을 떄 "로그인 실패"를 출력하세요

          아이디 : happy
          비밀번호 : 1234
          로그인 성공!

          아이디 : happy
          비밀번호 : 23467
          비밀번호가 틀렸습니다.

          아이디 : happy222
          비밀번호 : 1234
          아이디가 틀렸습니다.
    */
    public void practice7() {
    	
    	System.out.println("아이디를 입력하세요 >");
        String id = sc.nextLine();
        System.out.println("비밀번호를 입력하세요 >");
        String pwd = sc.nextLine();
        while(true) {
	    	if(id=="happy" && pwd=="1234"){
	    		 System.out.println("로그인에 성공했습니다");
	    	}else if (id!="happy"&& pwd=="1234") {
	    		 System.out.println("아이디가 틀렸습니다.");
	    	}else if (id=="happy" && pwd !="1234") {
	    		 System.out.println("비밀번호가 틀렸습니다.");
	    	}else {
	    		System.out.println("다시 입력하세요");
	    	}
    	}
    	

    }
  


        
    
 

    /*
        8. 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라 저체중 / 정상체중 / 과체중 / 비만을 출력하세요.
            BMI = 몸무게 / (키(m) * 키(m))
            BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
            BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
            BMI가 30이상일 경우 고도 비만

            키(m)를 입력해 주세요 : 1.62
            몸무게(kg)를 입력해 주세요 : 46
            BMI 지수 : 17.527815881725342
            저체중

     */
   public void practice8() {
	   
       System.out.println("키(m)를 입력하세요");  
	   double num1 = sc.nextInt();
	   System.out.println("몸무게(kg)를 입력하세요");
	   double num2 = sc.nextInt();
	   double bmi = ((num2) / (num1 * num1));
	   if (bmi<18.5) {
		System.out.println("저체중");   
		   }else if(bmi>=18.5 && bmi<23) {
			   System.out.println("정상체중");	   
		   }else if(bmi>=23 && bmi<25) {
			System.out.println("과체중");   
		   
		   }else if(bmi>=25 && bmi<30) {
			   System.out.println("비만");
		   }else {
			   System.out.println("고도비만");
		   }
	   
   }
    	
    	


    /*
        9. 키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
            (단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시 “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)

            숫자 입력 : 15
            숫자 입력 : 4
            연산자를 입력(+,-,*,/,%) : /
            15 / 4 = 3

     */
    public void practice9() {
    	System.out.print("숫자 입력 : ");
    	int num1 = Integer.parseInt(sc.nextLine());
    	System.out.print("숫자 입력 : ");
    	int num2 = Integer.parseInt(sc.nextLine());
    	System.out.print("연산자를 입력(+,-,*,/,%) : ");	
       	char op= sc.nextLine().charAt(0);
       if(op=='+' || op =='-'||op=='*'||op=='/'||op=='%') {
       	System.out.print(%d %c %d = %d,num1,op,num2,
       	                 op == '+'?(num1+num2):(num1-num2):
       	                	(num1*num2):(num1%num2));}
    else {
    	System.out.println("잘못입력했습니다/");
    }
    }
    /*
      10. 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를, 종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요

        1. 입력
        2. 수정
        3. 조회
        4. 삭제
        9. 종료
        메뉴 번호를 입력하세요 : 3
        조회 메뉴입니다.
     */
    public void practice10() {
    	
    }

    /*
        11. 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
            총 점 100점 중 배점으로는 다음과 같다.
            중간고사 (20%), 기말고사 (30%), 과제 (30%), 출석 (20%)

            이 때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 입력

            총 점이 70점 이상이면서 전체 강의의 70%이상 출석을 했을 경우 Pass,
            아니면 Fail을 출력하세요.


            중간 고사 점수 : 80
            기말 고사 점수 : 90
            과제 점수 : 50
            출석 회수 : 15
            ===========결과==========
            중간 고사 점수(20) : 16.0
            기말 고사 점수(30) : 27.0
            과제 점수 (30) : 15.0
            출석 점수 (20) : 15.0
            총점 : 73.0
            PASS

            중간 고사 점수 : 80
            기말 고사 점수 : 30
            과제 점수 : 60
            출석 회수 : 18
            ===========결과==========
            FAIL [점수 미달] (총점 61.0)

            중간 고사 점수 : 90
            기말 고사 점수 : 100
            과제 점수 : 80
            출석 회수 : 13
            ===========결과==========
            FAIL [출석 횟수 부족] (13/20)

            중간 고사 점수 : 100
            기말 고사 점수 : 80
            과제 점수 : 40
            출석 회수 : 10
            ===========결과==========
            FAIL [출석 횟수 부족] (10/20)
            FAIL [점수 미달] (총점 66.0)

     */
    public void practice11() {
    	
        
    }
    
}