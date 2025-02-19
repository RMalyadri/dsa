package com.java;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Outer {
	
	int a=20;
	
	private void methodOne() {
		synchronized(Outer.class) {
			
		}
	}
	static {
		
	}
	{
		
	}
	private static void methodOn2() {
		synchronized(Outer.class) {
			
		}
	}
	
	private class Inner {
	  int a = 24;
	   void method() {
		   System.out.println("a"+this.a+","+Outer.this.a);
	   }
	}
	public static void main(String[] args) {
		Predicate<String> prs = s -> s.endsWith("some");
		prs.test("sssome");
		Consumer<Integer> intCons = i1 -> System.out.println("d");
		intCons.accept(23);
		Supplier<Double>  ds     =  () ->  233.0;
		ds.get();
		Function<String,Integer> fis =  s1 -> s1.length();
		fis.apply("dd");
		Outer.Inner os = new Outer().new Inner();
		os.method();
		Supplier<Integer> i = () -> 23;
		System.out.println(i.get());
	}

}
