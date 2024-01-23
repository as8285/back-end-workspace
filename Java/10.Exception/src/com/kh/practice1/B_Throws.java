package com.kh.practice1;


/*
 * 리턴타입 메서드명(매개변수,...)throws 예외클래스1, 예외클래스 2 ....{
 * 
 * 
 * }
 * - main 메서드에서도 throws 키워드로 예외로 떠넘길수 있지만 
 * 결국 JVM이 예외 처리를 하게 된다,. 
 * -- > 프로그램 사용자는 프로그램이 알수 없는 예외 내용을 출력하고 종려 되는 것을 좋아하지 않는다.
 * -따라서 main 메서드에서 try ~ catch 블록으로 예외를 최종 처리하는 것이 바람짐
 * */

public class B_Throws {

	public static void main(String[] args) {
	try {
		findClass();
	}catch (ClassNotFoundException e){
		System.out.println("클래스가 존재하지 않습니다.");
	}
	
	}
	
public static void findClass() throws ClassNotFoundException{
	
	Class cla =Class.forName("java.lang.String2");
}
	public void method1() {
		System.out.println("method1() 호출");
		
		method2();
		
		System.out.println("method1() 종료");
	}
	
	public void method2() {
		System.out.println("method2() 호출");
		
		method3();
		
		System.out.println("method2() 종료");
	}
	
	public void method3() {
		System.out.println("method3() 호출");
		
		int random = (int)(Math.random() * 3 + 1);
		
		if(random == 1) {
			
		} else if(random == 2) {
			
		}
		
		System.out.println("method3() 종료");
	}

}

	
		


