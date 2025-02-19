package com.dsa;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,6};
		int n = ar.length+1;
		int expSum = (n*(n+1))/2;
		int actualSum = Arrays.stream(ar).sum();
		System.out.println(expSum-actualSum);

	}

}
