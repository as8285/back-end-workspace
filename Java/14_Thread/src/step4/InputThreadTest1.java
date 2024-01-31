package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest1 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요..");
		System.out.println("입력하신 숫자는 " + input + "입니다.");
		
	
// 카운팅 작업 
		for (int i = 10; i > 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
