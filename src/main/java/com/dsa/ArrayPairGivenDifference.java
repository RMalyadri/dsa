package com.dsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayPairGivenDifference {

	public static void main(String[] args) {

		int[] a = {5, 4, 2,0};
		defaultApp(a);
		findPairWithDifference(a, 2);

	}
	
	public static void findPairWithDifference(int[] arr, int diff) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int num : arr) {
            if (set.contains(num - diff)) {
                System.out.println("Pair found: (" + (num - diff) + ", " + num + ")");
                count++;
               // return true;
            }
            if (set.contains(num + diff)) {
                System.out.println("Pair found: (" + num + ", " + (num + diff) + ")");
                count++;
                //return true;
            }
            set.add(num);
        }

        System.out.println("No pair found with the given difference."+count);
        //return false;
    }
	
	private static void defaultApp(int[] a) {
		if (a.length == 0 || a.length == 1) {
			return;
		}
		Arrays.sort(a);
	    int max = 0;
	    boolean hasPair = false;
		Set<Integer> dset = new HashSet<>();
		loop: for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if(max > 1) { 
					hasPair = true;
					break loop;
				}
				int dif = a[i] - a[j];
				if (dset.contains(dif)) {
				    max = Math.max(max, dif+1);					
				}else {
					dset.add(dif);
				}
			}
		}
		if(max > 1) {
			System.out.println("avaible "+hasPair);
		}
		
	}

}
