package com.dsa;

public class EditDistanace {

	public static void main(String[] args) {
		String s1="kitten";
		String s2="test";
		System.out.println(getDistanceUsingRec(s1, s2, s1.length(), s2.length()));
		System.out.println(getDistanceUsingDp(s1, s2));
	}
	private static int getDistanceUsingDp(String s1, String s2) {
		  int m = s1.length();
	        int n = s2.length();
		int[][] dp = new int[m+1][n+1];
		for(int i=0;i<=m;i++) {
			dp[i][0] = i; 
		}
		for(int j=0;j<=n;j++) {
			dp[0][j] = j; 
		}
		
		 for (int i = 1; i <= m; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (s1.charAt(i - 1) == s2.charAt(j - 1))
	                    dp[i][j] = dp[i - 1][j - 1];
	                else
	                    dp[i][j] = 1 + Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1]));
	            }
	        }

		return dp[m][n];
		
	}
	
	private static int getDistanceUsingRec(String s1, String s2, int m, int n) {
		if(m == 0) {
			return m;
		}
		if(n == 0) {
			return n;
		}
		
		if(s1.charAt(m-1) == s2.charAt(n-1)) {
			return getDistanceUsingRec(s1, s2, m-1,n-1);
		}
		return 1+Math.min(
				Math.min(getDistanceUsingRec(s1, s2, m, n-1), getDistanceUsingRec(s1, s2, m-1, n)),
				getDistanceUsingRec(s1, s2, m-1, n-1));
	}

}
