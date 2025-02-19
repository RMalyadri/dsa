package com.java;

public class JavaBasicsInstanceBlock {
	public JavaBasicsInstanceBlock() {
		a = 45;
		System.out.println("construct"+a);
	}
	
	{
		a = 23;
		System.out.println("block");
	}
	
	int a;
	public void ifMethod(int a) {
		if(a < 15) {
			System.out.println("Less then 23");
		}else if(a < 11) {
			System.out.println("Less then 22");
		}else {
			
		}
	}
	public static void main(String[] args) {
		try {
			JavaBasicsInstanceBlock ib = new JavaBasicsInstanceBlock();
			System.out.println("hi");
			ib.ifMethod(1);
		}catch(Exception ex) {
			
		}
	

	}

	
}
