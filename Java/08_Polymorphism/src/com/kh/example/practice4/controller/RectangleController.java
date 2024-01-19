package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();

	public String CalcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// 넓이 : 너비 * 높이
		return  "넓이 : "+(height * width);

	}

	public String calcPerimeter(int x, int y, int height, int width) {
		// 둘레 
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return  "넓이 : "+(2*(height + width));

	}

}
