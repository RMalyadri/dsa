package com.java;

public class TrikcyDemo {
	
	public TrikcyDemo(int a) {
		System.out.println("int cons");
	}
	
	public TrikcyDemo(short a) {
		System.out.println("short cons");
	}
	
	static void test(int a) {
		 System.out.println("int");
	 }
	 
	static void test(short a) {
		 System.out.println("short");
	 }
	 
	static void test(long a) {
		 System.out.println("long");
	 }
	
	static void test(Integer i) {
		System.err.println("integr wrapper");
	}
	 static void test(Object a) {
		 System.out.println("object");
	 }
	
	static void test(String a) {
		 System.out.println("string");
	 }
	
	static void test(StringBuilder a) {
		 System.out.println("strign builder");
	 }

	public static void main(String[] args) {
		short a = 24;
		TrikcyDemo trikcyDemo = new  TrikcyDemo(a*23);
	  //test(null);	
		 Integer i = 10; 
		test(i);
  }

}
