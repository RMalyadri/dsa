package com.dsa;

import java.util.Arrays;

public class RecurisveAndDynamicProgramming {

	public static void main(String[] args) {
		int n = 5;
		recursvie(n);
		dp(n);
	}
	
	private static void dp(int n) {
	    int[] dp = new int[n];
	    dp[0] = 0;
	    dp[1] = 1;
	    for(int i=2;i<n;i++) {
	    	dp[i]=dp[i-1]+dp[i-2];
	    }
	    System.out.println("dp -> ");
	    Arrays.stream(dp).forEach(System.out::print);
	}
	
	private static void recursvie(int n) {
		for(int i=0;i<n;i++) {
			System.out.print(fibSum(i));
		}
	}
	
	private static int fact(int n) {
		if(n == 1 ) {
		  return 1;
		}
		return n* fact(n-1);
	}
	

	private static int fibSum(int n) {
		if(n == 1 || n==0) {
		  return n;
		}	
	    return fibSum(n-1)+fibSum(n-2);
	}

}
