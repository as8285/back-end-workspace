package test5;

import java.util.ArrayList;
import java.util.List;

import test5.model.Fruit;

public class Application {
	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("사과" ,"빨강"));
		list.add(new Fruit("메론","초록"));
		list.add(new Fruit("포도","초록"));
		list.add(new Fruit("바나나"));
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getName());
			
		}
		
	}
	
	
	
}


		
