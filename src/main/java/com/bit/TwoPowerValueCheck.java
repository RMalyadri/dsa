package com.bit;

public class TwoPowerValueCheck {

	public static void main(String[] args) {
		System.out.println(power(9));
	}
	
	private static boolean power(int n) {
		//2^n-1=
		return n !=0 && (n & n-1) == 0;
	}

}
