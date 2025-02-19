package com.dsa;

import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {
		String word="geeksforgeeks,geeks,geek,geezer";
		String[] sr = word.split(",");
		Arrays.sort(sr);
	    int end = Math.min(sr[0].length(), sr[sr.length-1].length());
	    int i=0;
	    while(i < end && sr[0].charAt(i) == sr[sr.length-1].charAt(i)) {
	    	i++;
	    }
	    System.out.println(sr[0].substring(0,i));	  
	}

}
