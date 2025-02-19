package com.dsa;

public class OverloadingDemo  extends Super{
	
	
	

	public static void main(String[] args) {
		String s="malyadri";
		char[] cha = s.toCharArray();
		int start = 0;
		int end = cha.length - 1;
		while(start < end) {
			char t = cha[start];
			cha[start]=cha[end];
			cha[end] = t;
			start++;
			end--;
		}
		System.out.println(String.valueOf(cha));

	}

}
