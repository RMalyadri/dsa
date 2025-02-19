package com.dsa;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ElementPlaceUnsortedArray {

	public static void main(String[] args) {
		int[] arr = {4,2,1,6,5};
		//1 2 4 5 6 -- 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(Integer::intValue).reversed());
        int position = 3;
        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);     
            if (pq.size() > position)
                pq.poll();
            	
        }
        System.out.println(pq.peek());        
		
	}

}
