package com.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestDiffCount {

	public static void main(String[] args) {
		int[] inputs = {4, 7, 1, 5, 3};
		Arrays.sort(inputs);
		Map<Integer,Integer> diffMap = new HashMap<>();
		int max = Integer.MIN_VALUE;
		for(int i=1;i<inputs.length;i++) {
		   for(int j=0;j<i;j++) {
			  int diff = inputs[i]-inputs[j];  
			   Integer val = diffMap.get(diff);
			   if(val != null) {
				   diffMap.put(diff, val+1);

			   }else {
				   diffMap.put(diff, 2);
			   }
			   max = Math.max(max, diffMap.get(diff));
		   }
		}
		System.out.println(max);
		
	}

}
