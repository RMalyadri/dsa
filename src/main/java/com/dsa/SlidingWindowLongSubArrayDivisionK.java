package com.dsa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Arrays;

public class SlidingWindowLongSubArrayDivisionK {
	
	private static Logger logger = System.getLogger(SlidingWindowLongSubArrayDivisionK.class.getName());

	public static void main(String[] args) {
		int[] arr = {2, 7, 6, 1, 4, 5};
		//int[] arr = {3};
		int k = 3;
		
		logestSumDivByK(arr, k);
	
	}
	private static void logestSumDivByK(int[] arr, int k) {
		int r=0;
		int l=0;
		int maxLenth = -1;
		int startInd = 0;
		int rightInd = 0;
		int sum = 0;
		while(r < arr.length) {
			  sum = sum+arr[r];
			  if(sum%k == 0 ) {
				  if(maxLenth < r-l+1) {
					  maxLenth = r-l+1;
					  startInd=l;
					  rightInd=r;
				  }
				  
			  }else {
				 if(l < r) {
					 sum = sum-arr[l];	
					 l++;
				 }
			  }
			r++;
		}
		System.out.println(startInd+","+rightInd);
		Arrays.stream(arr).skip(startInd).limit(maxLenth).forEach(System.out::print);
	}

}
