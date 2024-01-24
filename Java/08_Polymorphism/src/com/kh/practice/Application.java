package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.practice.model.Book;
import com.kh.practice.model.Member;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	Member m = new Member();

	int num = -1;
	Book[]books = {
			new Book("맛있는 지중해식 레시피",true),
			new Book("카페 샌드위치 마스터 클래스",false),
			new Book("원피스 107",19),
			new Book("주술회전 24",15)
			
	};
	
	public static void main(String[] args) {
		//책의 정보! 
		
		Application app = new Application();
		app.mainMenu();
		
	}
	
	public void mainMenu() {

		System.out.print("이름 : ");
		m.setName(sc.nextLine()); // setter
		
		System.out.print("나이 : ");
		m.setAge(Integer.parseInt(sc.nextLine())); // setter
		
		boolean check = true;
		
		while(check) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 대여하기");
			System.out.println("3. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
				case 1:
					myPage();
					break;
				case 2:
					rentBook();
					break;
				case 3:
					check = false;
					break;
			}
			
		}
	}
	
	public void myPage() {
		System.out.println(m);
	}
	
	public void rentBook() {
		for(int i =0 ;i < books.length;i++) {
			System.out.println(i + "번 도서 : " + books[i]);
		}
	
		System.out.print("대여할 도서 번호 선택 : ");
		num = Integer.parseInt(sc.nextLine());
		
		 Book selectBook=books[num]; // 사용자가 선택한 책 ! - > 대여할 도서 책 ! 
		
		// getter를 이용해서 기존 책 리스트를 일단 가지고 와야 함!
		Book[] newBookList = m.getBookList(); // getter
		for(int i =0 ;i < newBookList.length;i++) {
			if(newBookList[i]==null) { 
				// 대여 가능 공간!

					 if(selectBook.isCoupon()) {
							m.setCoupon(m.getCoupon() + 1); // 쿠폰이 true인 경우 ~  
					 }
					if(m.getAge() >= selectBook.getAccessAge()) {
						// 내가 대여한 책의 접근 제한 나이보다 많은 경우 !
						newBookList[i]=books[num];// 대여	!	
					}
					break;
				} 
			
				//if()
				//newBookList[i] = books[num];
				break;
			}
	
		m.setBookList(newBookList);
		if(m.getAge() < selectBook.getAccessAge()) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else {
			System.out.println("성공적으로 대여되었습니다.");
		}
	}

}