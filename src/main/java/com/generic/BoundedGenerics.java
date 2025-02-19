package com.generic;

import java.util.ArrayList;
import java.util.List;

public class BoundedGenerics {

	public static void main(String[] args) {
		//upper bound
		List<Integer> ilist = new ArrayList<>();
		ilist.add(2);
		List<Double> dlist = new ArrayList<>();
		dlist.add(2.3);
		upperBoundRead(ilist);
		upperBoundRead(dlist);
		
		List<? super Number> silist = new ArrayList<>();
		ilist.add(2);
		//List<? super Number> sdlist = new ArrayList<>();
		dlist.add(2.3);
		
		
	}
	
		
	private static void upperBoundRead(List<? extends Object> list) {
		list.stream().forEach(System.out::println);
	}
	
	
	
	

}
