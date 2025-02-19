package com.dsa;

public class MinJumpsReachEnd {

	public static void main(String[] args) {
		//greedy
		int ar[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		//int ar[] = {1, 1,1,1,1,1,1,1,1};
		System.out.println(getJumpCount(ar));

	}
	
	private static int getJumpCount(int ar[]) {
		int jump = 0;
		if(ar ==null ||ar.length == 0) {
			return jump;
		}
		int next = 0;
		int currentInd = 0;
		for(int i=0;i<ar.length-1;i++) {
		  next = Math.max(next,i+ar[i]);
		  if(i == currentInd) {
			  jump++;
			  currentInd = next;
			  if(currentInd >= ar.length-1) {
				  break;
			  }
		  }
		}
		return jump;
	}

}
