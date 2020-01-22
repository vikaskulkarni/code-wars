package com.codewars.challenges.cyclicRotation;

public class CyclicRotation {
	static int[] cyclicRotation(int[] n, int k) {

		int[] rotatedArr = new int[n.length];

		int fromIndex = n.length - k;
		int toIndex = fromIndex == 0 ? n.length - 1 : fromIndex - 1;

		int j = 0;
		int i = fromIndex;

		while (i != toIndex) {
			rotatedArr[j++] = n[i];
			i = i + 1 < n.length ? i + 1 : j - k;
		}

		rotatedArr[j++] = n[i];

		return rotatedArr;

	}
}
