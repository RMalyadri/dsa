package com.dsa;

import java.util.HashSet;
import java.util.Set;

public class HashingSumGivenPairSize {

	public static void main(String[] args) {
		pairSum();
		tripleSum();
	}

	private static void pairSum() {
		int[] ar = {2,5,1,3,4};
		int tar = 7;
		Set<Integer> hs = new HashSet<>();
		for(int i=0;i<ar.length;i++) {
		    int dif = tar - ar[i];
		    if(hs.contains(dif)) {
		      System.out.println(String.format("Pair:[%s,%s]",dif, ar[i]));	
		    }
		    hs.add(ar[i]);
		}
	}
	private static void tripleSum() {
		int[] ar = {-1,0,1,2,-1,-4};
		int tar = 0;
		for(int i=0;i<ar.length-2;i++) {
			int csum = tar-ar[i];
			Set<Integer> hs = new HashSet<>();
			for(int j=i+1;j<ar.length;j++) {
				int req = csum - ar[j];
				if(hs.contains(req)) {
					System.out.println(String.format("Triplet:[%s,%s,%s]",ar[i],req,ar[j]));
				}
				hs.add(ar[j]);
			}
			
		}
		
		
	}

}
