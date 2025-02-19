package com.dsa;

public class RepeatedCharLength {

	public static void main(String[] args) {
		String s="aaabbbcaa";
		System.out.println(String.format("%s is converted into count format %s",s,getSinCharPattern(s)));
		String strignPattern ="a3b3c1a2";
		System.out.println(String.format("%s is converted into count format %s",strignPattern,convertSinCharPattrnSrt(strignPattern)));
		String ds="abababcaca";
		System.out.println(String.format("%s is converted into count format %s",ds,getDoubCharPattern(ds)));
		String strigndPattern ="[ab]12[ca]2";
		System.out.println(String.format("%s is converted into count format %s",strigndPattern,convertDouCharPattrnSrt(strigndPattern)));
		

	}
	
	private static String getSinCharPattern(String s) {
		char[] chars = s.toCharArray();
		int i=0;
		StringBuilder sb = new StringBuilder();
		while(i<chars.length) {
			char c = chars[i];
			int count=0;
			while(i < chars.length && chars[i] == c) {
				count++;
				i++;				
			}
			sb.append(c).append(count);
		}
		return sb.toString();
	}
	
	private static String convertSinCharPattrnSrt(String s) {
		char[] chars = s.toCharArray();
		int i=0;
		int j=i+1;
		StringBuilder sb = new StringBuilder();
		while(i<chars.length && j<chars.length) {
			String c = String.valueOf(chars[i]);
			int count=Integer.parseInt(String.valueOf(chars[j]));
			sb.append(c.repeat(count));					
			i=i+2;
			j=i+1;
		}
		return sb.toString();
	}
	
	private static String getDoubCharPattern(String s) {
		int i=0;
		int j=i+2;
		StringBuilder sb = new StringBuilder();
		while(i<s.length() && j <= s.length()) {
			String ss = s.substring(i,j);
			int count=0;
			while(i<s.length() && j <= s.length() && ss.equals(s.substring(i,j))) {
				count++;
				i=j;
				j=i+2;
			}
			sb.append(String.format("[%s]%s",ss,count));
		}
		return sb.toString();
	}
	
	private static String convertDouCharPattrnSrt(String s) {
		int i=0;
		int j=1;
		StringBuilder sb = new StringBuilder();
		while(i<s.length()) {
			if(s.charAt(i) == '[' && i<s.length()) {
			   i++; 
			   j++;
			}
			while(j<=s.length() && Character.isLetter(s.charAt(j))) {
				j++;
			}
				
			String c = s.substring(i,j);
			j=j+1;
			int count=Integer.parseInt(String.valueOf(s.charAt(j)));
			sb.append(c.repeat(count));		        
			i=j+1;
			j=j+2;
			
		}
		return sb.toString();
	}

}

