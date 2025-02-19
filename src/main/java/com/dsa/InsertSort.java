package com.dsa;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] ar = {1, 10, 20, 0, 59, 63, 0, 88, 0};
		for(int i=1;i<ar.length;i++) {
		   int key = ar[i];
		   int j = i-1;
		   while(j>= 0&& ar[j] > key ) {
		     ar[j+1]=ar[j]; 
			 j--;
		   }
		   ar[j+1] = key;
		}
		Arrays.stream(ar).forEach(System.out::print);
	}

}
