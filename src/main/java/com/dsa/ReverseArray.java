package com.dsa;

public class ReverseArray {

	public static void main(String[] args) {
		char[] ch = {'a','d','b','c'};
		int l = 0;
		int r = ch.length-1;
		while(l < r) {			
			char t = ch[l];
			ch[l] = ch[r];
			ch[r] = t;
			l++;
			r--;
		}
		System.out.println(String.valueOf(ch));

	}

}
