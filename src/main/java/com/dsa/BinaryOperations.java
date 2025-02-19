package com.dsa;

public class BinaryOperations {

	public static void main(String[] args) {		
         String s="111";
         int counter = 0;
         int l = 0;         
         int r = s.length()-1;
         StringBuilder sb = new StringBuilder(s);
         while(l <= r) {
        	if(sb.charAt(r) == '1') {
        	   sb.setCharAt(r, '0');
        	   counter++;
        	}
        	if(sb.charAt(l) == '1') {
        	  sb.setCharAt(l, '0');	        	  
        	  if(sb.charAt(l+1) == '1') {
        		  counter++;
        	  }
        	  sb.setCharAt(l+1, '1');
        	  counter++;
        	  
        	}
        	l++;
         }         
         System.out.println(sb);
         System.out.println(counter);         
	}

}
