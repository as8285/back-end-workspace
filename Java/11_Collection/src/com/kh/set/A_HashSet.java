package com.kh.set;

import java.util.HashSet;
import java.util.Set;

import com.kh.set.model.Person;

/*
 * 
 * Set의 특징  
 * - 중복 없음 
 * - 순서 없음  
 * 
 * */

//HashSet : Set 인터페이스를 구현한 대표적인 컬렉션 클래스 
public class A_HashSet {

	
	
	public static void main(String[] args) {
		A_HashSet a = new A_HashSet();
		// a.method1();
		a.method2();
	
	}
	
	
	public void method1() {
		Set<String> set = new HashSet<>();

	
		set.add("라미란");
		set.add("공명");
		set.add("염혜란");
		set.add("박병은");
		set.add("라미란");
		set.add("라미란");
		
		System.out.println(set);
		System.out.println(set.size());// [염혜란, 공명, 라미란, 박병은]  ==== 특징  중복없음 ..순서 없음 
		System.out.println("라미란이 포함되어 있는가 ? " + set.contains("라미란")); // true
		System.out.println("라미란이 포함되어 있는가 ? " + set.contains("류준열")); // false
		
		set.remove("박병은"); // 순서가 없어서 인덱스를 못찾아서 객체로 삭제 해야함 
		
		System.out.println(set); // [염혜란, 공명, 라미란]
		
		set.clear();
		System.out.println("비어 있는지 ? " + set.isEmpty());//비어 있는지 ? true	
		
	}
	
	
	
	
	public void method2 () {
		HashSet<Person> set = new HashSet<>();
		
		set.add(new Person("라미란", 48)); 
		set.add(new Person("공명", 29));
		set.add(new Person("염혜란", 47));
		set.add(new Person("박병은", 46));
		set.add(new Person("라미란", 48)); 
		set.add(new Person("라미란", 48)); 
		
		// 객체는 주소값으로 비교하기 때문에 모두 다른 객체로 인식해서 중복 제거되지 X  
		// -- > hashCode,equals 메서드 재정의 자동생성 --> 중복 제거 하면 된다 
		
		
		System.out.println(set); 
		/*[Person [name=박병은, age=46], 
		Person [name=라미란, age=48], 
		Person [name=공명, age=29], 
		Person [name=염혜란, age=47], 
		Person [name=라미란, age=48],
		 Person [name=라미란, age=48]]*/ 
		for (Person p : set) {
			System.out.println(p);
		}
		

	} 
}
	
	

