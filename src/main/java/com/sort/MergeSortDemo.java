package com.sort;

import java.util.Arrays;

public class MergeSortDemo {

	public static void main(String[] args) {
		int[] input = { 3, 2, 6, 5,5, 7, 9, 1 };
		divide(input);
		Arrays.stream(input).forEach(System.out::print);
	}

	private static void divide(int[] input) {
		if(input.length < 2) {
			return;
		}
		int mid = input.length/2;
		int[] la = new int[mid];
		int[] ra = new int[input.length-mid];
		System.arraycopy(input, 0, la, 0, mid);
        System.arraycopy(input, mid, ra, 0, input.length - mid);
		divide(la);
		divide(ra);
		merge(input, la, ra);
	}
	
	private static void merge(int[] arr, int[] L, int R[]) {
	    int i = 0, j = 0;
        int k = 0;
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        // Copy remaining elements of L[] if any
        while (i < L.length) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        // Copy remaining elements of R[] if any
        while (j < R.length) {
            arr[k] = R[j];
            j++;
            k++;
        }
 
	}
	

}
