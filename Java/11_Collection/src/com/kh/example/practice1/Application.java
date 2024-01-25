package com.kh.example.practice1;

import java.util.HashSet;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

TreeSet<Integer>lotto = new TreeSet<>(); 
while(lotto.size()<6) {
	
	int num = (int)Math.random()*45+1;
	lotto.add(num);
	
}
		
     

	}
}
		/*TreeSet<Integer> lotto = new TreeSet<>();
		TreeSet<Integer> myLotto = new TreeSet<>();
		// 인티저만 들어갈수 있게 명시
		int count = 0;
		while (true) {
		  
			while (lotto.size() < 6 && myLotto.size() < 6) {
				int num = (int) (Math.random() * 45) + 1;
				lotto.add(num);
				myLotto.add(num);
				count++;
				System.out.println("로또 번호 : " + lotto);
				System.out.println("내 번호 : " + myLotto);
			
			// 멈추는 조건 : 로또 번호와 내 번호가 정확히 일치!
			if (lotto.equals(myLotto)) {
				System.out.println("횟수" + count);
				break;

			}

			}
		
		}}}
	

	*/


