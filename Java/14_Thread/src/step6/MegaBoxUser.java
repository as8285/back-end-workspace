package com.kh.step6;

// MegaBox에서 좌석을 예매하는 일을 전담하는 쓰레드라고 간주  
public class MegaBoxUser implements Runnable {
	private boolean seat = false;

	@Override
	public void run() {
		// 예매하는 기능
		try {
		reserve();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public synchronized void reserve() throws InterruptedException {
		String name = Thread.currentThread().getName();
		System.out.println(name + "님, 예매하러 오셨습니다..!!");
		
			if (seat == false) {
				Thread.sleep(2000);
				System.out.println(name + "님, 좌석 예매 성공");
				seat = true;
			} else {
				System.out.println(name + "님,해당 좌석은 이미 예매 완료 된 좌석입니다. ");
			}
		} 

	}

