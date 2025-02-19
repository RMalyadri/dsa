package com.dsa;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

abstract class MyAbstractDemo2 {
		
}

public class MyAbstractDemo {
	
	boolean getPredicateTest(Predicate<Integer> pred) {
		return pred.test(2);
	}
	static void method(int a) {
		System.out.println("primary");
	}
    static void method(Object a) {
		System.out.println("object");
	}
	public static void main(String[] args) {
		method(new Integer(3));
		MyAbstractDemo md = new MyAbstractDemo();
		Predicate<String> prst = String::isEmpty;
		System.out.println(prst.test(""));
		//
		List<String> al = new ArrayList<>();
		al.add("1");
		String[] are = al.toArray(new String[0]);
		
	}
 
}





