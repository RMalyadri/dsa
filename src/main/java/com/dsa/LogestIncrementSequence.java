package com.dsa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Arrays;

public class LogestIncrementSequence {
	
	private static Logger logger = System.getLogger(LogestIncrementSequence.class.getName());
	
	public static void main(String[] args) {
		int[] are = {2,3,1,2,3,4,5};
		logger.log(Level.INFO,""+lisDp(are, are.length));
	}
	
	private static int lisDp(int[] a, int n) {
		int[] dp = new int[n];
		Arrays.fill(dp, 1);
		int max = 1;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
			   if(a[i] > a[j]) {
				   dp[i] = Math.max(dp[i], dp[j]+1);
				   max = Math.max(max, dp[i]);
			   }
			}
		}
		logger.log(Level.INFO,"max dp value ==>"+max);
		return Arrays.stream(dp).max().getAsInt();		
	}
}
