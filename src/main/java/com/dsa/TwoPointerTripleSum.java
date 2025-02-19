package com.dsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoPointerTripleSum {

	public static void main(String[] args) {
		 int[] nums = {-1,0,1,2,-1,-4};
		 int ts = 0;
		 Arrays.sort(nums);
         System.out.println(tripleSum(nums, ts));
	}
	
	public static Set<List<Integer>> tripleSum(int[] nums, int ts) {
		Set<List<Integer>> subArr = new HashSet<>();
		for(int i=0;i<nums.length-2;i++) {
			int lp = i+1;
			int rp = nums.length-1;
			while(lp < rp) {
				int sum = nums[i]+nums[lp]+nums[rp];
				if(ts == sum) {
					subArr.add(Arrays.asList(nums[i],+nums[lp],nums[rp]));
					lp++;
					rp--;
				}else if(sum < ts){
					lp++;
				}else {
					rp--;
				}
			}
		}
		return subArr;
	}

}
