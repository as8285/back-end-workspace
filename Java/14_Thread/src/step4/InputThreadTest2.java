package com.kh.step4;

public class InputThreadTest2 {

	public static void main(String[] args) {
		CountThread2 count = new CountThread2();
		count.start();

	}
}

class CountThread2 extends Thread {
	public void run() {
		// 카운팅 작업
		for (int i = 10; i > 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);

		}

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
