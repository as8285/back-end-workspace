package com.kh.stream.intermediate;

import java.util.Arrays;

public class D_Looping {

	
	/*
	 * 반복 
	 * - 요서 전체를 반복하는 역활  
	 * - peek : 중간 처리 단계에서 전체 요소를 반복하면서 추가적인 작업을 하기 위한 사용
	 * - forEach : 최종 처리 단계에서 전체 요소를 반복  추가적인 작업을 하기위해 사용 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		int[]values = {1, 2, 3, 4, 5};
		
		// peek  
		int sum = Arrays.stream(values).filter(i -> i %2 ==0)
		.peek(value ->System.out.println(value))
		.sum();
		System.out.println("1~5 중 짝수의 합계 : " + sum);
		
		// forEach 
		Arrays.stream(values).filter(i -> i %2 ==0)
		.forEach(value ->System.out.println(value));
		
	
		// sum은 같이 못쓴다.
	 int sum2 =	Arrays.stream(values)
			 .filter(i -> i %2 ==0)
		      .sum();
	System.out.println("1~5 중 짝수의 합계 : " + sum2);
	

}}
