package com.dsa;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindowUniquCharSubString {

	public static void main(String[] args) {
		String s = "1291287";
		System.out.println(getUniqueSub(s));
		
	}
	
	private static String getUniqueSub(String s) {
		int l=0;
		int r=0;
		int max=Integer.MIN_VALUE;
		int staIdx = 0;
		Set<String> set = new HashSet<>();
		String[] sr = s.split("");
		while(l < s.length() && r < s.length()) {
			String c = sr[r];
			if(set.contains(c)) {
			   set.remove(c);
			   l++;
			}else {
				set.add(c);				
				if( max < r-l+1) {
					max = r-l+1;
					staIdx = l;
				}
				r++;
			}
		}
		return s.substring(staIdx,max+staIdx);		
	}

}
