package com.sort;

import java.util.PriorityQueue;

public class InsertionSortOnlyVowel {
	
	public static void main(String[] args) {
		InsertionSortOnlyVowel vs = new InsertionSortOnlyVowel();
		System.out.println(vs.sort("lEetcOde"));
	}
	
	public String sort(String str) {
		String vowel = "AEIOUaeiou";
		//lEetcOde
		PriorityQueue<Character> pq = new PriorityQueue<>();
		char[] ca = str.toCharArray();
		for(char c : ca) {
			if(vowel.indexOf(c) >= 0) {
				pq.add(c);
			}			
		}
		for(int i=0;i<ca.length;i++) {
			if(vowel.indexOf(ca[i]) >= 0) {
				ca[i] = pq.poll();
			}		
		}		
		return String.valueOf(ca);
	}		
	

}
