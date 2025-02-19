package com.generic;

import java.util.Arrays;
import java.util.List;

public class GenericeDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("A","B");
		List<Integer> vals = Arrays.asList(1,2,3);
		display(names);
		display(vals);
	}
	
	private static void display(List<? extends Object> list) {
		list.forEach(System.out::println);
	}

}
