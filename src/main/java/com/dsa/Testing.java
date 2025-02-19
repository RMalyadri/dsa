package com.dsa;

public class Testing {
	
	
	public static void main(String[] args) {
		
		String s = "madam";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String ss = s.substring(i,j);
				String rev = new StringBuilder(ss).reverse().toString();
				if(ss.length() > 1 && ss.equals(rev)) {
					System.out.println(ss);
				}
			}
		}
		
	}

}
