package com.dsa;

public class LongestPalindromSubstring {

	public static void main(String[] args) {
		String pal = logestSubString("teekmadamch");
		System.out.println(pal);
	}
	
	
	private static String logestSubString(String s) {
		if(s.length() == 0) {
			return "";
		}
		int maxLen = 1;
		int start = 0;
		for(int i=0;i<s.length();i++) {
			//two time 1 for even 1 odd
			for(int j=0;j<=1;j++) {
				int low=i;
				int high = i+j;
				while(low >= 0 && high<s.length() && s.charAt(low) == s.charAt(high)) {
					int cuLen = high-low+1;
					if(cuLen > maxLen) {
						start = low;
						maxLen = cuLen;
					}
					low--;
					high++;
				}
			}
		}
		return s.substring(start, start+maxLen);
	}

}
