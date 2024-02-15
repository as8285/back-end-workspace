package com.kh.test6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.test6.model.Food;

public class Application {
	Scanner sc = new Scanner(System.in);

	public void main() {

		System.out.println("===음식 메뉴 리스트===");
		System.out.println("1. 음식 추가");
		System.out.println("2. 음식 정보");
		System.out.println("3. 음식 삭제");
		System.out.println("프로그램 종료");
		System.out.print("번호 선택 : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("추가할 음식 입력 : ");
			
			String menu = sc.nextLine();
			
			if(menu.equals(menu))
			System.out.println("칼로리 입력 : ");
			int kcal = sc.nextInt();

			break;
		case 2:
			System.out.println();
			break;
		case 3:
			System.out.print("삭제하고 싶은 음식 선택 : ");
			String delete = sc.nextLine();
			
			break;

		case 4:
			System.out.println("프로그램이 종료되었습니다.");

		}

	}

	public static void main(String[] args) {
		Food food = new Food();
		Application app = new Application();
		app.main();
 
	}

}
