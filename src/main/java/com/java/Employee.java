package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee {
	private int age;
	private String name;
	
	Employee(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public static void main(String[] args) {
	  Deque<Integer> que = new LinkedList<>();
	  List<Employee> list = new ArrayList<>();	
	  list.add(new Employee(2,"Ma"));
	  list.add(new Employee(1,"Ma"));
	  list.add(new Employee(1,"aa"));
	  Comparator<Employee> empCom = 
				Comparator.comparing(Employee::getName).thenComparingInt(Employee::getAge);
	  Collections.sort(list,empCom);
	  list.forEach(System.out::println);
	  
	  Optional<String> ops = Optional.ofNullable(null);
	  
	  List<Integer> ls = Arrays.asList(2,2,3,4);
	  int amx = ls.stream().max(Comparator.comparingInt(Integer::intValue)).get();
	  System.out.println(amx);
	  int[] ar = {2,3,4,5};
	  String[] array = new String[] { "w", "o", "l", "f" };

	}

}
