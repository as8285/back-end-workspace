package com.kh.set;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.kh.set.model.Person;

/*
 * TreeSet 
 * - 저장과 동시에 자동 오름 차순 정렬 (HashSet + 정렬 )
 *   HashSet 보다 데이터 추가 ,삭제에 시간이 더 걸림  
 * 
 * */


//HashSet : Set 인터페이스를 구현한 대표적인 컬렉션 클래스 
public class B_TreeSet {

	
	
	public static void main(String[] args) {
		B_TreeSet a = new B_TreeSet ();
		 //a.method1();
		a.method2();
	
	}
	
	
	public void method1() {
		Set<String> set = new TreeSet<>();

	
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
	
	
	
	
	/*@Override
	public int compareTo(Person o) {
		return this.name.compareTo(name);
	}  
*/
	
	
	public void method2 () {
		TreeSet<Person> set = new TreeSet<>();
		
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
		/*
		 * Iterator 
		 * - 컬렉션에 저장된 요소들 접근하는데 사용하는 인터페이스
		 * -iterator()호출해서 Iterator를 구현한 객체를 얻어서 사용   
		 * */
		 Iterator <Person> it =  set.iterator();
		while(it.hasNext()) { // 읽어 올 요소가 있는지 확인 
			System.out.println(it.next()); // 다음 요소를 읽어 옴 
				
		}


	}}
	