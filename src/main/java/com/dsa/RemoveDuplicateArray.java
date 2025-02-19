package com.dsa;

import java.util.Arrays;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5,5,5};
		int limit = removeDuplicate(arr);
		Arrays.stream(arr).limit(limit).forEach(System.out::println);

	}
	private static int removeDuplicate(int[] arr) {
		
		if(arr.length == 0 || arr.length==1) {
			return arr.length;
		}
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
		  if(arr[i] != arr[i+1]) {
			 arr[j++] = arr[i];  
		  }
		}
		arr[j++]=arr[arr.length-1];
		
		return j;
	}

}
