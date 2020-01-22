package com.codewars.challenges.oddOccurrence;

import org.junit.Test;

public class OddOccurrencesInArrayTest {
	@Test
	public void test() {
		int[] i = { 9, 3, 9, 3, 9, 7, 9 };
		OddOccurrencesInArray.oddOccurence(i);

		int[] j = { 9, 9, 7, 9, 7, 9, 3 };
		OddOccurrencesInArray.oddOccurence(j);

	}
}
