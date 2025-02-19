package com.dsa;

public class RouteRegExp {

	public static void main(String[] args) {
		String uri = "employee/add";
		String path = "/emplyee";
		if(path.matches("/[\\w]*")) {
			System.out.println("matched");
		}else {
			System.out.println("not matched");
		}

	}

}
