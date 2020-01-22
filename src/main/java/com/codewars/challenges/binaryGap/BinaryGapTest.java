package com.codewars.challenges.binaryGap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BinaryGapTest {

	@Test
	public void test() {
		assertEquals(2, BinaryGap.longestBinaryGap(9));
		assertEquals(4, BinaryGap.longestBinaryGap(529));
		assertEquals(5, BinaryGap.longestBinaryGap(1041));

	}
}
