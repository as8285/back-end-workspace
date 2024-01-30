package com.kh.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.kh.stream.intermediate.model.Student;

public class C_Collect {

	/*
	 * 수집 - 최종 처리 기능으로 필터링 또는 매핑한 요소들을 새로운 컬렉션으로 담아서 리턴하는 collect()제공
	 */
	public static <Ineteger> void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("이상현",25,"남자",50,80),
				new Student("정동준",28,"남자",90,90),
				new Student("이상호",26,"남자",80,70),
				new Student("권예빈",27,"여자",75,80),
				new Student("조세미",24,"여자",85,65));
		
		// List 컬렉션으로 수집 ->  수학 점수가 80점 이상인 사람들만 
		List<Student> list = students.stream().filter(student->student.getMath() >= 80)
		.collect(Collectors.toCollection(() -> new ArrayList<>()));
		
		System.out.println(list);
		
		// Set 컬렉션 수집 -> 중학생인 사람들만 
		
		//		Set<String> set = new HashSet<>();
		
		Set<Student> set  = students.stream().filter(student->student.getAge()>=14 && student.getAge()<17 )
		.collect(Collectors.toCollection(() -> new HashSet<>()));
		System.out.println("중학생인 사람들" + set);
		
		Map<String, Integer> map = students.stream()
								   .collect(Collectors
								   .toMap(student->student.getName(),
								   student -> student.getAge()));
		System.out.println(map);
	}

}
