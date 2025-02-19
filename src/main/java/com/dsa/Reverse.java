package com.dsa;

public class Reverse {

	public static void main(String[] args) {
		int num = 1234;
		int revNum = reverseNumber(num);
		System.out.println(revNum);
	}

	private static int reverseNumber(int num) {
		int revNum = 0;
		while(num > 0) {
			int rem = num%10;
			num = num/10;			
			revNum = revNum*10+rem;
		}
		return revNum;
	}
	
	

}
