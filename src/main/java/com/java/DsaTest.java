package com.java;

import java.util.Deque;
import java.util.LinkedList;

public class DsaTest {

	public static void main(String[] args) {
		Deque<Integer> qs = new LinkedList<>();
		qs.add(1);
		qs.add(5);
		qs.add(3);
		System.out.println(qs.peekFirst());
		

	}

}
