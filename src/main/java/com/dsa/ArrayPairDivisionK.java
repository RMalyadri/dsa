package com.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayPairDivisionK {

	public static void main(String[] args) {
		 int[] arr = { 92, 75, 65, 48, 45, 35,10,20};
		 int k = 10;
		 Map<Integer,Long> rem = Arrays.stream(arr)
		 .boxed()
		 .collect(Collectors.groupingBy(key -> key%k, Collectors.counting()));
		 System.out.println(rem);
		 

//		 Arrays.stream(arr).boxed()
//		 .collect(Collectors.toMap(key -> key%10,
//				 val-> 1,
//				 (v1, v2) -> v1+1,
//				 HashMap::new
//				 )).forEach((k,v) -> System.out.println(k+","+v));
		
		 System.out.println(ArrayPairDivisionK.divsingPairSum(arr, k));

	}

	private static boolean divsingPairSum(int[] arr, int k) {
		if(arr.length%2 == 1) {
			return false;
		 }
		 Map<Integer,Integer> remCount = new HashMap<>();
		 for(Integer num : arr) {			 
			 int rem = num%10;
			 remCount.put(rem, remCount.getOrDefault(rem, 0)+1);
		 }
		 for(Integer num: arr) {
			 int rem = num%k;
			 Integer rc = remCount.get(rem);
			 if(rem == 0) {
				 if(rc%2 == 1) {
					 return false;
				 }
			 }else if(2*rem == k){
				 if(rc%2 == 1) {
					 return false;
				 }
			 }else {
				 if(!rc.equals(remCount.get(k-rem))) {
					return false; 
				 }
			 }
		 }
		 return true;
	}

}
