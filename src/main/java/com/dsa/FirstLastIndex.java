package com.dsa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class FirstLastIndex {
    private static Logger logger = System.getLogger(FirstLastIndex.class.getName());
	
	public static void main(String[] args) {
		int[] nums = {5,5,7,7,8,8,10,10};
	    firstInd(nums,10);
	    logger.log(Level.INFO, "binary search -> "+binarySearchIndex(nums,10,true)+","+binarySearchIndex(nums,10,false));
	}
	
	private static int binarySearchIndex(int[] nums,int key, boolean isFirst) {
		int ind = -1;
		int l=0;
		int r = nums.length-1;
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(nums[mid] == key ) {
				ind = mid;
				if(isFirst) {
				  r = mid-1;	
				}else {
				  l = mid+1;
				}
			}else if(key < nums[mid]){
				r = mid-1;
			}else {
				l = mid+1;
			}
		}
		return ind;
	}
	
	private static void firstInd(int[] nums, int key) {
		int first = -1;
		int last = -1;
        for(int i=0;i<nums.length-1;i++) {
        	if(key != nums[i]) {
        		continue;
        	}
        	if(first == -1) {
        		first = i;        		
        	}  
        	last = i;        	
        }
        logger.log(Level.INFO, first+","+last);
	}


}
