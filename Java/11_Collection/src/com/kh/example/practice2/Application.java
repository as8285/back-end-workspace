package com.kh.example.practice2;

import java.util.ArrayList;

import java.util.Scanner;

import com.kh.example.practice2.model.Music;




public class Application {
	private Scanner sc = new Scanner(System.in);

	ArrayList<Music>list = new ArrayList<Music>();
	
	
	public static void main(String[] args) {
		Application a = new Application();
		a.method1();
	}
		
	public void method1() {
	
		while(true) {
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1.마지막 위치에 곡 추가");
		System.out.println("2.첫 위치에 곡 추가");
		System.out.println("3.전체 곡 목록 출력");
		System.out.println("4.특정 곡 검색");
		System.out.println("5.특정 곡 삭제");
		System.out.println("6.특정 곡 수정");
		System.out.println("7.곡 명 오름차순 정렬");
		System.out.println("8.가수 명 내림차순 정렬");
		System.out.println("9.종료");
		System.out.print("메뉴 번호 입력 : " );
		int num = Integer.parseInt(sc.nextLine());
		if(num == 1) {
			System.out.println("****** 마지막 위치에 곡 추가 *****");
			System.out.print("곡명 : ");
			String title = sc.nextLine();
			System.out.print("가수명 : ");
			String singer = sc.nextLine();
			Music music = new  Music(singer,title);
			list.add(music);
			System.out.println("추가 성공");
			
		}else if (num == 2) {
			System.out.println("****** 첫 위치에 곡 추가 ******");
			System.out.println("곡명 : " );
			String title = sc.nextLine();
			System.out.println("가수명 : ");
			String singer = sc.nextLine();
			Music music = new  Music(singer,title);
			list.add(0,music);
			System.out.println("추가 성공");
		}
		else if (num ==3) {
			System.out.println("****** 전체 곡 목록 출력 ******");
			for(Music m:list  ) {
				System.out.println(m.getSinger()+" - " + m.getTitle());
			}
		}
			else if(num ==4) {
				System.out.println("****** 특정 곡 검색 ******");
				System.out.println("검색할 곡명");
				String search = sc.nextLine();
				for(Music m  :list) {
					if(m.getTitle().equals(search)) {
					System.out.println(m.getSinger()+" - " + m.getTitle()); //글자수 체크 
					}
					}
				}else if(num==5) {
					System.out.println("****** 특정 곡 삭제 ******");
					System.out.println("삭제할 곡 명 : ");
					
					
					
				}
		}
		}
	}
			
			

					
	


