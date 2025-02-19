package com.dsa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;


public class SubArrayMaxSumDP {
	private static Logger logger = System.getLogger(SubArrayMaxSumDP.class.getName());

	public static void main(String[] args) {
		int[] a = {5,4,-1,7,8};
		int[] dp = new int[a.length];
		int max=a[0];	
		dp[0] = a[0];
		for(int i=1;i<a.length;i++) {
			  dp[i]=Math.max(a[i],a[i]+dp[i-1]);
			  max = Math.max(max,dp[i]);
		}
		
		logger.log(Level.INFO, max);
	}

}
