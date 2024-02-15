package com.kh.test4.model;

public class Person {
private String Name;

public Person(String name[]) {
	name[0]="윤민영";
	name[1]="누룽지";
	name[3]="백설기";
}

public Person(String name) {
	Name = name;
}

public String getName() {
	
	return Name;
}

public void setName(String name) {
	Name = name;
}



	 	 	 

@Override
public String toString() {
	return "Person [Name=" + Name + "]";
}



}