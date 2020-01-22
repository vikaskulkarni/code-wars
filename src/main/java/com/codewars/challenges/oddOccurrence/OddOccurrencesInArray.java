package com.codewars.challenges.oddOccurrence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddOccurrencesInArray {
	public static int oddOccurence(int[] A) {

		int oddOneOut = -1;
		if (A != null && A.length > 0) {
			Integer[] boxedArray = Arrays.stream(A).boxed().toArray(Integer[]::new);

			List<Integer> integers = new ArrayList<>(Arrays.asList(boxedArray));

			for (Integer integer : integers) {
				if (integer > 0 && integer <= 1000000) {
					if (integers.indexOf(integer) == integers.lastIndexOf(integer)) {
						oddOneOut = integer;
						break;
					}
				}
			}
		}

		return oddOneOut;
	}
}
