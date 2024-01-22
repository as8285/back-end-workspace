package com.kh._interface.step2;

public interface Volume {
// 인터페이스 구성 요소 = 상수 + 추상 메서드 
// 인터페이스에서 멤버변수는 무조건 상수 ! 
	
/*public static final <--있다고 생각 */	int MAX_VOLUME = 10;

int MIN_VOLUME = 0;
// 인터페이스에서 메서드는 무조건 추상 메서
/*public abstract<--있다고 생각  */void setVolume(int volume);
}
