package com.kh.test6.model;

public class Food {
private String menu;
private int kcal;
public Food(String menu, int kcal) {
	this.menu = menu;
	this.kcal = kcal;
}
public Food() {
}
public String getMenu() {
	return menu;
}
public void setMenu(String menu) {
	this.menu = menu;
}
public int getKcal() {
	return kcal;
}
public void setKcal(int kcal) {
	this.kcal = kcal;
}




@Override
public String toString() {
	return "Food [menu=" + menu + ", kcal=" + kcal + "]";
}



}
