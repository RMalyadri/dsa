package com.dsa;

import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindowKSizeDistinctElements {
	
	private static Logger logger = System.getLogger(SlidingWindowKSizeDistinctElements.class.getName());

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 4};
		int k = 2;
		List<Long> dist = countDistinctElementGivenSubArrSize(arr, k);
		System.out.println(dist);
	
	}
	private static List<Long> countDistinctElementGivenSubArrSize(int[] arr, int k) {
		List<Long> disEleCnt = new ArrayList<>();
		disEleCnt.add(Arrays.stream(arr).limit(k).distinct().count());
		for(int i=k;i<arr.length;i++) {
			disEleCnt.add(Arrays.stream(arr).skip(i-k+1).limit(k).distinct().count()); 
		}
		return disEleCnt;
	}
		

}
