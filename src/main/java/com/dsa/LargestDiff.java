package com.dsa;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class LargestDiff {

	public static void main(String[] args) {
		int[] inputs = {2, 3, 10, 6, 4, 8, 1};
		Set<Integer> difSet = new HashSet<>();
		for(int i=1;i<inputs.length;i++) {
			for(int j=0;j<i;j++) {
				difSet.add(inputs[i]-inputs[j]);
			}
		}
		int max = difSet.stream().max(Comparator.comparingInt(Integer::intValue)).orElse(0);
		System.out.print(max);
		
	}

}
