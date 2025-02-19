package com.dsa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Arrays;

public class SlidingWindowKSizeArraySum {
	
	private static Logger logger = System.getLogger(SlidingWindowKSizeArraySum.class.getName());

	public static void main(String[] args) {
		int[] arr = {100, 200, 300, 400};
		int k = 3;
		dipalyMaxSumWithSlidingWidow(arr, k);
	}
	
	private static void dipalyMaxSumWithSlidingWidow(int[] arr, int k) {
		int max = Integer.MIN_VALUE;
		int sum =  Arrays.stream(arr).limit(k).sum();
		int winSum = sum;		
		for(int i=k;i<arr.length;i++) {
			winSum = winSum + arr[i] - arr[i-k];
			max = Math.max(sum, winSum);
		}
		logger.log(Level.INFO, max);
		
	}

}

