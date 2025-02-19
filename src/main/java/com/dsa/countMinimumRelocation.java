package com.dsa;

import java.util.PriorityQueue;

public class countMinimumRelocation {

	public static void main(String[] args) {
		int[] a = { 10, -10, -1, -1, 10 };		
		//withLoop(a);
		withPriorityQueue(a);

	}
	
	private static void withPriorityQueue(int[] a) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int earns = 0;
		int relocationCount = 0;
		for(int val:a) {
			if(val < 0 ) {
				pq.add(val);
			}
			earns = earns+val;
			while(earns < 0 ) {
				int remove = pq.poll();
				earns = earns-remove;
				relocationCount++;
			}
		}
		System.out.println(relocationCount);
	}

	private static void withLoop(int[] a) {
		if (a.length <= 2) {
			System.out.println(0);
		}		
		int i=0;
		int negPos = -1;
		int counter = 0;
		int sum = 0;
		while(i < a.length) {
			sum = sum+a[i];			
			if(sum < 0) {			   
			   negPos = getNegPos(a,negPos);
			   swapNumbers(a,negPos);
			   counter++;			   
			   i=0;	  
			}else {
				i++;
			}
			
		}
		System.out.println(counter);
	}	
	
	private static int getNegPos(int a[], int netPos) {
		for (int i = netPos+1; i < a.length; i++) {
			if (a[i] < 0) {
				return i;
			}
		}
		return netPos;
	}

	private static void swapNumbers(int a[], int netPos) {
		for(int i=a.length-1;i>=0;i--) {
			if(a[i] > 0) {
				int temp = a[i];
				a[i] = a[netPos];
				a[netPos] = temp;	
				break;
			}
		}
		
	}
}
