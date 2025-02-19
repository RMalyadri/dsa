package com.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InsertionSortTests {

	private InsertionSort insertionSort;

	@BeforeEach
	void init() {
		insertionSort = new InsertionSort();
	}

	@Test
	void testSortOrder() {
		int[] input = { 5,1,4,3,2 };
		int[] expected = Arrays.copyOf(input, input.length);
		int[] sorted = insertionSort.sort(input);
		Arrays.sort(expected);
		assertArrayEquals(expected, sorted);
	}

}
