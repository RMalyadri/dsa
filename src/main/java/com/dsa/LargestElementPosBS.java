package com.dsa;

public class LargestElementPosBS {

	public static void main(String[] args) {
		 int arr[] = { 1, 4, 5, 3, 19, 3};
	     int k = 0;
	     int val = binSearch(arr, k);
	     System.out.println(val);

	}
		
	
	private static int binSearch(int[] arr, int k) {	
		int low = Integer.MAX_VALUE;
		int high = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			low = Math.min(low, arr[i]);
			high = Math.max(high, arr[i]);
		}
		while(low < high) {
			int mid= low+(high-low)/2;
			int cnt = 0;
			for (int i = 0; i < arr.length; i++)
	            if (arr[i] > mid) {
	            	cnt++; 
	            }
			 if (cnt >= k)
	                low = mid + 1;	 
	            else
	                high = mid;
			
		}
		return high;
	}

}
