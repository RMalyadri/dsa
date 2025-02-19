package com.java8;

import java.util.List;

public class EmpDemo {
	public int rating;
	
	public EmpDemo(int rating) {
		this.rating = rating;
	}
	
	public static void main(String[] args) {
		EmpDemo ed1 = new EmpDemo(1);
		EmpDemo ed2 = new EmpDemo(1);
		List<EmpDemo> list = List.of(ed1,ed2);
	}
}

