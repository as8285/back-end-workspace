package com.kh.example.practice2;

import java.util.Scanner;

import com.kh.example.practice2.controller.SnackController;
import com.kh.example.practice2.model.Snack;


public class Application {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("스낵류를 입력하세요");
		sc.nextLine();
		System.out.println("종류 : ");
		sc.nextLine();
		String kind = sc.nextLine();
		System.out.print("이름 :");
		String name =sc.nextLine();
		System.out.println("맛 : ");
		String flavor = sc.nextLine();
		
		System.out.println("개수 :");
		int numOf =Integer.parseInt(sc.nextLine());
		
		System.out.println("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		//-----------------------------------------------------
		//----------즉 여기서 controller 로 접근 x model에 접근 x
		
		// 데이터를 서버한테 요청! 그럼 데이터를 서버한테 전달 ! 
		// 전달할 때 controller 한테 전달하면 됨 ! 
		
		
		SnackController control = new SnackController();
		System.out.println(control.saveData(kind, name,flavor,
				 numOf,price));
		// 서버한테 요청해서 응답받은 결과를 다시 화면으로! 
		System.out.println(control.confirmData());
	}
}


