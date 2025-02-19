package com.dsa;

import java.util.Arrays;

public class GreedRailwayPlatform {

	public static void main(String[] args) {
		 int[] arr = { 900, 940, 950, 1100, 1500, 1800 }; 
	     int[] dep = { 910, 1200, 1120, 1130, 1900, 2000 };
	     //O(n2)
	     System.out.println("pf count: "+getPlatformCount(arr, dep));
	     //sorting
	     System.out.println("pf count sorting: "+getPlatFormCountUsingSort(arr, dep));
	}
	
	public static int getPlatformCount(int[] arr, int[] dep) {
		int minPlatCount = 1;
		for(int i=0;i<arr.length;i++) {
			int reqPlat = 1;
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i] >= arr[j] && arr[i] <= dep[j]) || (arr[j] >= arr[i] && arr[j] <= dep[i])) {
					reqPlat++;
				}
			}
			minPlatCount = Math.max(minPlatCount, reqPlat);
		}
		
		return minPlatCount;
	}
	
	public static int getPlatFormCountUsingSort(int[] arr, int[] dep) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i=1;
		int j=0;
		int platformCount = 1;
		int reqPlatform=1;
		while( i < arr.length && j < arr.length) {
			if(arr[i] <= dep[j]) {
				reqPlatform++;
				i++;
			}else{
				reqPlatform--;
				j++;
			}
			platformCount = Math.max(platformCount, reqPlatform);
		}
		return platformCount;
	}

}
