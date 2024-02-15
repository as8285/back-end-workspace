package com.kh.test;

import java.util.Scanner;

public class Test {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	Test t = new Test();
	t.Test1();

	}

	public void Test1() {

		System.out.print("문자열을 입력해주세요");
		String str = sc.nextLine();
		int count = 0;
		boolean check = false;
		while(str.equals("exit")) {
	
			System.out.println("프로그램을 종료합니다.");
			check=false;
			
			break;
		}
		
		if(!str.equals("exit")){

			count += str.length();
			System.out.println(count + "글자입니다.");
			
		}
		
		
	}

	
}