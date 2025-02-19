package com.bit;

public class BiOperations {

	public static void main(String[] args) {
		byte b1 = 0b11;
		System.out.println(b1);
		byte b2 = (byte)(b1>>1);
		System.out.println("right"+b2);
		byte bl = (byte)(b1<<2);
		System.out.println("left"+bl);
    
	}

}
