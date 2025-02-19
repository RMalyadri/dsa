package com.dsa;

public class MaxProfit {

	public static int getMaxProfile(int[] sp ) {
		int max = 0;
		for(int i=1;i<sp.length;i++) {
			if(sp[i] > sp[i-1]) {
				max = max + sp[i]-sp[i-1];
			}
			
		}
		return max;
	}
	public static void main(String[] args) {
		int price[] = { 100, 180, 260, 310, 40, 535, 695 }; 
        System.out.println(getMaxProfile(price));
	}

}
