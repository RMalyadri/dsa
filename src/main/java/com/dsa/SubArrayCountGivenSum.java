package com.dsa;

import java.util.HashMap;
import java.util.Map;

public class SubArrayCountGivenSum {

	public static void main(String[] args) {
		int[] ar = {1,2,3,1,0,0};
		int tar = 6;
		int curSum = 0;
		int res = 0;
		Map<Integer, Integer> countMap = new HashMap<>();
		countMap.put(0, 1);
		for(int i=0;i<ar.length;i++) {
			curSum = curSum+ar[i];
			int remsum = curSum - tar;
			if(countMap.containsKey(remsum)) {
				res = res+countMap.get(remsum);
			}
			countMap.put(curSum,countMap.getOrDefault(curSum, 0)+1);
		}
		System.out.println(res);

	}
	
	
	

}
