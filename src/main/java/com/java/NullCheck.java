package com.java;

import java.util.ArrayList;
import java.util.List;

public class NullCheck<T> {
	public boolean isNull(T t) {
		return t != null;
	}

	public static void main(String[] args) {
		NullCheck<Integer> nin = new NullCheck<>();
		System.out.println(nin.isNull(null));
		List<Integer> intlist = new ArrayList<>();
		intlist.add(2);
		List<Double> dlist = new ArrayList<>();
		dlist.add(2.0);
		display(intlist);
		display(dlist);
		//addGener(new ArrayList<Integer>(), 2);
		
		List<Object> objList = new ArrayList<>();
		addGener(objList, 2);
		addGener(objList, 2.0);
		String c ="U+2550";
		System.out.println(c);
		

	}

	public static void display(List<? extends Number> list) {
	  list.stream().forEach(System.out::println);
	}

	public static void addGener(List<? super Number> list, Number i1) {
		list.add(i1);	
	}
	

}