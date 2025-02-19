package com.dpattern;

public class BuilderTests {

	public static void main(String[] args) {
		EmpBuilder empBuilder = new EmpBuilder.Builder().build();
		System.out.println(empBuilder.getName());
	}

}
