package com.dsa;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StringPermutation {
	private static Logger logger = Logger.getLogger(StringPermutation.class.getName());
	
	public static void main(String[] args) {
		String input = "abc";
		String ans = "";
		printPermutation(input, ans);
	}
	
	private static void printPermutation(String input, String ans) {
		if(input.length() == 0) {
			logger.log(Level.INFO,ans);
			return;
		}
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			String remStr = input.substring(0,i)+input.substring(i+1);
			printPermutation(remStr, ans+c);
		}
	}

}
