package com.dsa;

public class NumberOfPalind {

	public static void main(String[] args) {
		String s="aaaaaa";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String res = new StringBuilder(s.substring(i, j)).reverse().toString();
				if(res.length() > 1 && res.equals(s.substring(i, j))) {
					System.out.println(""+res);
				}
			}
		}

	}

}
