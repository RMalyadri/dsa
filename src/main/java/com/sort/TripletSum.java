package com.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {
	
	public List<List<Integer>> getSum(int[] arr, int tar) {
		Arrays.sort(arr);
		List<List<Integer>> subList = new ArrayList<>();
		for(int i=0;i<arr.length-2;i++) {
		   int j = i+1;
		   int k = arr.length-1;
		   while(j < k) {
			   List<Integer> subLi = new ArrayList<>();
			   subLi.add(arr[i]);
			   subLi.add(arr[j]);
			   subLi.add(arr[k]);
			   int sum = subLi.stream().mapToInt(x -> x).sum();
			   if(tar == sum) {
				   subList.add(subLi);
				   j++;
				   k--;
			   }else if(sum < tar) {
				   j++;
			   }else {
				   k--;
			   }
		   }
		}
		return subList;
	}

}
