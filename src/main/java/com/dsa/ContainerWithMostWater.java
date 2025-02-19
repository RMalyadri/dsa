package com.dsa;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] nums = {1,4,2,3};
		System.out.println(getMaxArea(nums));
	}
	
	private static int getMaxArea(int[] nums) {
		int maxArea = 0;
		int l=0;
		int r=nums.length-1;
		while(l<r) {
			int wid = r-l;
			int minHeight = nums[r]-nums[l] ;
			maxArea = Math.max(maxArea, minHeight*wid);
			if(nums[l] < nums[r]) {
				l++;
			}else {
				r--;
			}
		}
		return maxArea;
	}

}
