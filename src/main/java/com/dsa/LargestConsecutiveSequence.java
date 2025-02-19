package com.dsa;

import java.util.Arrays;

public class LargestConsecutiveSequence {

	public static void main(String[] args) {
		int[] arr = {0,1,1};
		//edge cases 
		//array is not sorted 
		//length is more then 1
	    Arrays.sort(arr);
	    int count=1;
	    int max = 1;
	    for(int i=1;i<arr.length;i++) {
	    	if(arr[i] != arr[i-1]) {
	    		if(arr[i]-arr[i-1] == 1) {
		    		count=count+1;	
		    		max = Math.max(max,count);
	    		}else {
		    		count = 1;
		    	}
	    	}
	    	
	    }
	    System.out.println(max);
	    
	 
	}

}
