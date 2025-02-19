package com.thread;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OverloadDemo {

//	public void m1(String s) {
//	  Set<Integer> in = new HashSet<>();
//	  in.addAll(Arrays.asList(2,3,4,5,2));
//	  System.out.println("string"+in);	
//	}
//	public void m1(StringBuilder s) {
//		System.out.println("buid");
//	}
	
	public void i1(int i1) {
		System.out.println("i");
	}
//    public void i1(Long i1) {
//    	System.out.println("l");
//	}
	
//	public void i1(Object o) {
//		System.out.println("obj");
//	}
	
	public static void main(String[] args) {
		OverloadDemo od = new OverloadDemo();
		od.i1(new Integer(2));
	}
	
	

}
