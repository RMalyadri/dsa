package com.dsa;

import java.util.Arrays;

public class ReverseArrayGroups {

	public static void main(String[] args) {
		 int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
	     int k = 3;	
	     reverseGroup(arr,k);
	     Arrays.stream(arr).forEach(System.out::print);
	}
	
	
	private static void reverseGroup(int arr[], int k) {
		for(int i=0;i < arr.length;i+=k) {
			int left=i;
			int right=Math.min(i+k-1, arr.length-1);
			while(left < right)	{
				int t = arr[left];
				arr[left]= arr[right];
				arr[right] = t;
				left++;
				right--;
			}
		}
	}

}
