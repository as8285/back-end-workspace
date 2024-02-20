package test6.model;

public class FoodList {
private String name;
public FoodList(String name, int kcal) {
	super();
	this.name = name;
	this.kcal = kcal;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getKcal() {
	return kcal;
}
public void setKcal(int kcal) {
	this.kcal = kcal;
}
public FoodList() {
	super();

}
private int kcal;
}
