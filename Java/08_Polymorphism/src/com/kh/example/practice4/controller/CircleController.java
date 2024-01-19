package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Circle;

public class CircleController {
	private Circle c = new Circle();

	public String CalcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return + radius + "/ "+ "넓이 :" + (Math.PI * radius * radius);
	}

// void는 반환 타입이 없을 경우만!!! 
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		// 둘레 : PI * 반지름 * 2
		return "위치 : (" + x + "," + y + "),반지름 : " + radius + "/ 둘레 :" + (Math.PI * radius * 2);
	}

}