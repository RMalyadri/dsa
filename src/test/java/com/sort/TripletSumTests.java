package com.sort;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TripletSumTests {
	
	private TripletSum tripletSum;

	@BeforeEach
	void init() {
		tripletSum = new TripletSum();
	}

	@Test
	void testSortOrder() {
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> list = tripletSum.getSum(nums, 0);
		System.out.println(list);
		assertFalse(list.isEmpty());
	}

}
