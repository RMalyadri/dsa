package com.dsa;

import java.util.Arrays;

public class ClosetSumForK {

	public static void main(String[] args) {
		int[] nums = {-1, 2, 1, -4};
		// int[] nums = {0,0,0};
		int target = 1;
		int k = 3;
		slideWindow(nums, target, k);
		twoPointerSum(nums, target);
	}

	private static void slideWindow(int[] nums, int target, int k) {
		int winSum = Arrays.stream(nums).limit(k).sum();
		int min = winSum;
		for (int i = k; i < nums.length; i++) {
			winSum = winSum + nums[i] - nums[k - i];
		    if(Math.abs(target-winSum) < Math.abs(target-min)) {
		    	min = winSum;
		    }
			
		}
		System.out.println(min);
	}

	private static void twoPointerSum(int[] nums, int target) {
		Arrays.sort(nums);
		int min= Integer.MAX_VALUE;
		for (int i = 0; i < nums.length-2; i++) {
			int l = i+1;
			int r = nums.length - 1;
			while(l < r) {
				System.out.println(nums[i] +","+ nums[l] +","+ nums[r]);
				int sum = nums[i] + nums[l] + nums[r];
			    if(Math.abs(target-sum) < Math.abs(target-min))   {
			    	min = sum;
			    }
				if(sum < target ) {
					l++;
				}else {
					r--;
				}
			}
			
		}
		System.out.println(min);
		
	}

}
