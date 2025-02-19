package com.dsa;

public class PalindromString {

	public static void main(String[] args) {
		String s = "maamd";
		int l= 0;
		int r= s.length()-1;
		boolean isPali = true;;
		while(l < r) {
			if(s.charAt(l) != s.charAt(r)) {
				isPali=false;
				break;
			}
			l++;
			r--;
		}
		System.out.println("is Palindrom:"+isPali);

	}

}
