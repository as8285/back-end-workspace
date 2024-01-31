package com.kh.step1;

public class ComeThread extends Thread {
	/*
	 * 스레드 생성하는 방법
	 * 
	 * 1.Thread 클래스를 상속받는 방법 
	 * - Thread 클래스를 상속 후에 run()메서드를 오버라이딩한다.
	 *  - Thread 클래스를
	 * 상속한 자식 클래스의 객체 생성 후 star()메서드를 호출 한다.
	 */

	public ComeThread(String name) {
		super(name);
		
	}
	
	// 스레드가 작동하는 부분
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000); // 지정된 시간동안 스레드를 멈추게 한다.
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		String name = Thread.currentThread().getName();
		System.out.println("CurrnetThread :: " + name + ","+i);
		}
	}
}
