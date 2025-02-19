package com.dsa;

public class StringReplaceWOSpe {

	public static void main(String[] args) {
		String s="ab@maly#dri";
		char[] chars = s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r) {
          	if(chars[l]=='@') {
          		l++;
          	}
          	if(chars[r]=='#') {
          		r--;
          	}
          char lc = chars[l]; 
          chars[l]=chars[r];
          chars[r]=lc;
          r--;
          l++;          
        }
        System.out.println(String.valueOf(chars));
	}

}