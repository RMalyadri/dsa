package com.generic;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class PriorityQueueDemo {

	public static void main(String[] args) {
	   int[] a = {2,5,3,8,1};
	   PriorityQueue<Integer> pq = new PriorityQueue<>(
			   Comparator.comparingInt(Integer::intValue).reversed());
	   for(int i:a) {
		   pq.add(i);
		  // System.out.println(pq.peek());
	   }
	   pq.iterator().forEachRemaining(System.out::println);
	   
	   Queue<Integer> deque = new ConcurrentLinkedDeque<>();
	  
	}
}
