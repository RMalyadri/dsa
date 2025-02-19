package com.dsa;

public class StockProfit {

	public static void main(String[] args) {
		int[]  arr = {100, 180, 260, 210, 40, 535, 695};
		getProfileWithMinMax(arr);
	}

	private static void getProfileWithMinMax(int[] arr) {
		int profit=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > arr[i-1]) {
				profit = profit+arr[i]-arr[i-1];
			}
		}
		System.out.println(profit);
	}

}
