package com.dsa;

public class LongestCommonSubArrLengthTwoArrays {

	public static void main(String[] args) {
		 int[] a = { 1, 2, 8, 2, 1 };
	        int[] b = { 8, 2, 1, 4, 7 };
	      System.out.println(getLength(a,b));

	}
	
	
	private static int getLength(int a[], int[] b) {
		int[] dp = new int[b.length+1];
		int max = 0;
		for(int i= 0;i<a.length;i++) {
			int pre = 0;
			for(int j=0;j<b.length;j++) {
				int temp = dp[j];
				if(a[i] == b[j]) {
				  dp[j]=pre+1;
				  max = Math.max(max, dp[j]);
				}
				pre = temp;
			}
			
		}
		return max;
	}

}
