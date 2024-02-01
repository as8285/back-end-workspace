package com.kh.example.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.kh.example.practice2.compare.ArtisDescending;
import com.kh.example.practice2.compare.TitleAscending;
import com.kh.example.practice2.controller.SongController;
import com.kh.example.practice2.model.Song;

public class Application {
	private Scanner sc = new Scanner(System.in);
	private SongController control = SongController.getInstance();

	public static void main(String[] args) {
		Application app = new Application();
		app.mainMenu();
	}

	public void mainMenu() {
		try {
			boolean check = true;

			while (check) {
				System.out.println("===== 메인 메뉴 =====");
				System.out.println("1.마지막 위치에 곡 추가");
				System.out.println("2.첫 위치에 곡 추가");
				System.out.println("3.전체 곡 목록 출력");
				System.out.println("4.특정 곡 검색");
				System.out.println("5.특정 곡 삭제");
				System.out.println("6.특정 곡 수정");
				System.out.println("7.곡 명 오름차순 정렬");
				System.out.println("8.가수 명 내림차순 정렬");
				System.out.print("메뉴번호 입력  : ");
				int menu = Integer.parseInt(sc.nextLine());
				switch (menu) {
				case 1:
					addLastList();
					break;
				case 2:
					addFirstList();
					break;
				case 3:
					printAll();
					break;
				case 4:
					searchSong();
					break;
				case 5:
					removeSong();
					break;
				case 6:
					updateSong();
					break;
				case 7:
					ascTitle();
					break;
				case 8:
					descArtist();
					break;
				case 9:
					System.out.println("9.종료");
					check = false;
					break;
				}

			}
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다 : " + e.getMessage());
			mainMenu();
		}

	}

//1 마지막 위치에 곡 추가 
	public void addLastList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String artist = sc.nextLine();
		Song song = new Song(title, artist);
		boolean result = control.addLastList(song);
		if (result) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}

	}

	// 2.첫 위치에 곡 추가

	public void addFirstList() {
		System.out.println("***** 첫 위치에 곡 추가 ******");

		System.out.print("곡명 : ");
		String title = sc.nextLine();

		System.out.print("가수 명 : ");
		String artist = sc.nextLine();
		Song song = new Song(title, artist);
		boolean result = control.addFirstList(song);
		if (result) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}

	}

// 3. 전체 곡 목록 출력 
	public void printAll() {
	System.out.println("****** 전체 곡 목록 출력 ******");
	for(Song song : control.printAll()) {
	control.printAll();
	}
	}
// 4 특정 곡 검색  
	public void searchSong() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.println("검색할 곡 명 : ");
		String title = sc.nextLine();
		Song song = control.searchSong(title);
		System.out.println(song + "을 검색 했습니다.");
		if(song !=null) {
			System.out.println();
		}else {
			System.out.println();
		}
		
		
		
			
}

	// 5. 특정 곡 삭제
	public void removeSong() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.println("삭제할 곡 명 : ");
		String title = sc.nextLine();
		Song song = control.removeSong(title);
		if (song != null) {
			System.out.println(song + "을 삭제 했습니다.");

		} else {
			System.out.println("삭제할 곡이 없습니다.");
		}

	}
	

	// 특정 곡 수정
	public void updateSong() {

		System.out.println("****** 특정 곡 수정 ******");
		System.out.println("검색할 곡 명 : ");
		String search = sc.nextLine();

		System.out.println("수정할 곡 명 : ");
		String title = sc.nextLine();

		System.out.println("수정할 가수 명 : ");
		String artist = sc.nextLine();
		
		
		Song update = new Song(title,artist);
		Song song = control.updateSong(search,update);
		if(song!=null)
		System.out.println(song + "의 값이 변경 되었습니다.");
		else {
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
	

			}
	
	// 7. 곡 명 오름 차순 정렬
	public void ascTitle() {
		System.out.println("******곡 명 오름차순******");
		
		for (Song song : control.acsTitle()) {
			System.out.println(song);
		}

	}

	// 8. 가수 명 내림 차순 정렬
	public void descArtist() {

		System.out.println("******가수 명 내림 차순 정렬 ******");
		
		for (Song song : control.descArtist()) {
			System.out.println(song);
		}

	}

}
/*
 * private Scanner sc = new Scanner(System.in);
 * 
 * ArrayList<Music> list = new ArrayList<Music>();
 * 
 * public static void main(String[] args) { Application a = new Application();
 * a.method1(); }
 * 
 * public void method1() {
 * 
 * while (true) { System.out.println("===== 메인 메뉴 =====");
 * System.out.println("1.마지막 위치에 곡 추가"); System.out.println("2.첫 위치에 곡 추가");
 * System.out.println("3.전체 곡 목록 출력"); System.out.println("4.특정 곡 검색");
 * System.out.println("5.특정 곡 삭제"); System.out.println("6.특정 곡 수정");
 * System.out.println("7.곡 명 오름차순 정렬"); System.out.println("8.가수 명 내림차순 정렬");
 * System.out.println("9.종료"); System.out.print("메뉴 번호 입력 : "); int num =
 * Integer.parseInt(sc.nextLine()); if (num == 1) {
 * System.out.1println("****** 마지막 위치에 곡 추가 *****"); System.out.print("곡명 : ");
 * String title = sc.nextLine(); System.out.print("가수명 : "); String singer =
 * sc.nextLine(); Music music = new Music(singer, title); list.add(music);
 * System.out.println("추가 성공");
 * 
 * } else if (num == 2) { System.out.println("****** 첫 위치에 곡 추가 ******");
 * System.out.print("곡명 : "); String title = sc.nextLine();
 * System.out.print("가수명 : "); String singer = sc.nextLine(); Music music = new
 * Music(singer, title); list.add(0, music); System.out.println("추가 성공"); } else
 * if (num == 3) { System.out.println("****** 전체 곡 목록 출력 ******"); for (Music m
 * : list) { System.out.println(m.getSinger() + " - " + m.getTitle()); } } else
 * if (num == 4) { System.out.println("****** 특정 곡 검색 ******");
 * System.out.println("검색할 곡명"); String search = sc.nextLine(); for (Music m :
 * list) { if (m.getTitle().contains(search)) { System.out.println(m.getSinger()
 * + " - " + m.getTitle()); // 글자수 체크 } } } else if (num == 5) {
 * System.out.println("****** 특정 곡 삭제 ******"); System.out.print("삭제할 곡 명 : ");
 * String song = sc.nextLine(); // 입력창 for (Music m : list) { if
 * (m.getTitle().equals(song)) { int index = list.indexOf(m); Music result =
 * list.remove(index); System.out.println(result.getSinger() + " - " +
 * result.getTitle() + "삭제 했습니다."); break;
 * 
 * } else if (num == 6) { System.out.println("****** 특정 곡 수정 ******");
 * System.out.print("검색할 곡 명 : "); String edit = sc.nextLine(); // 입력창 for
 * (Music m : list) { if (m.getTitle().equals(song)) { int index =
 * list.indexOf(m); Music result = list.remove(index);
 * System.out.println(result.getSinger() + " - " + result.getTitle() +
 * "삭제 했습니다."); break; }
 * 
 * } }
 */