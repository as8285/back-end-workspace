package com.kh.lang;

public class B_Wrrappper {

	public static void main(String[] args) {
		 B_Wrrappper  b = new  B_Wrrappper ();
		 //b.method1();
		 b.method2();
	}
public void method1() {
	
	double dNum1 = 3.14;
	// Deprecated : 기능은 있지만 비권장 
	
	Double double1 = new Double(dNum1);
	double1 = 3.14; // Boxing : 기본자료형 
	
	int iNum2 = 3;
	Integer int1 = new Integer(iNum2);
	int1 = 3;
	
	char ch3 = 'a';
	Character ch4 = new Character('a');
	ch4 = 'a';
	//UnBoxing  - >기본자료형  
	int iNum3 = Integer.parseInt("20");
	double dNum2 = Double.parseDouble("34,78");
}
	// String과 Wrapper 클래스 간의 변경 
	public void method2() {
		int iNum = Integer.parseInt("20");
		double dNum = Double.parseDouble("34.78");
			
		// 2. 기본자료형을 문자열로 변경  
		// String의 valueOf() 메서드  
		System.out.println(iNum + dNum);
		
		String str1 = String.valueOf(iNum);
		String str2 = String.valueOf(dNum);
	
		System.out.println(str1+str2); // 2034.78
		//Wrapper 클래스에서 제공하는 valuOf().toString() 메서드 
		String str3 = Integer.valueOf(iNum). toString(); 
		String str4 = Double.valueOf(dNum).toString();
		System.out.println(str3+str4); // 2034.78
	}
}

