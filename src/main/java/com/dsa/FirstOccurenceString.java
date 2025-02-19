package com.dsa;

public class FirstOccurenceString {

	public static void main(String[] args) {
		System.out.println(getFirstOcurrence("leetcode", "leet"));
	}
	
	private static int getFirstOcurrence(String s1, String s2 ) {
		int l=0;
		int formed=0;
		if(s2.length() > s1.length()) {
			return -1;
		}
		while(l < s1.length()) {	
			int sind = 0;
			while(sind < s2.length() && s1.charAt(l) == s2.charAt(sind)) {
				l++;
				sind++;
				formed++;
				if(formed == s2.length()) {
					return 1;
				}
			}
			l++;
		}
		return -1;
	}

}
