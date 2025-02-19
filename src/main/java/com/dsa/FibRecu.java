package com.dsa;

public class FibRecu {

	public static void main(String[] args) {
		//recursive
		System.out.println(fibRec(5));
		//recursive
		System.out.println(fibDp(5));

	}
    private static int fibRec(int pos) {
      if(pos <= 1) {
    	  return pos;
      }
     
      int sum =  fibRec(pos-1)+fibRec(pos-2);
      System.out.println(sum+"for "+pos);
      return sum;
    }
    
    private static int fibDp(int pos) {
    	int dp[] = new int[pos+1];
    	dp[0]=0;
    	dp[1]=1;
    	for(int i=2;i<=pos;i++) {
    		dp[i]= dp[i-1]+dp[i-2];
    	}
    	return dp[pos];
    }
}
