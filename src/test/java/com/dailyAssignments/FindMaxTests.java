package com.dailyAssignments;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FindMaxTests {
	@Test
	void testNullValue() {
		assertThrows(NullPointerException.class, () -> ArrayHelpers.findMin(null));
	}
	@Test
	void testEmptyArray() {
		int[] value = {};
		assertThrows(IllegalArgumentException.class, () -> ArrayHelpers.findMin(value));
	}
	@Test
	void testSingleValue() {
		assertEquals(-1, ArrayHelpers.findMin(new int [] {-1}));
	}
	@Test
	void testMultipleValues() {
		int[] values = {100,10,50,80,600,90,0,1};
		assertEquals(0, ArrayHelpers.findMin(values));
	}
	@Test
	void testWithNegativeValues() {
		int[] values = {-5,-10,-0,50,0,900,-1,};
		assertEquals(-10, ArrayHelpers.findMin(values));
	}
	@Test
	void testAllNegative() {
		int[] values = {-5,-10,-0,-50,-900,-1,};
		assertEquals(-900, ArrayHelpers.findMin(values));
	}
}

