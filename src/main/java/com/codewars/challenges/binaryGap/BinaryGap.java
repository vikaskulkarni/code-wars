package com.codewars.challenges.binaryGap;

public class BinaryGap {

	static int longestBinaryGap(int n) {
		String binaryStr = Integer.toBinaryString(n);

		int longestGap = 0;
		int tempGap = 0;
		boolean start = false;

		for (Character c : binaryStr.toCharArray()) {
			if (c.equals('1')) {
				if (start == true) {
					if (tempGap > longestGap)
						longestGap = tempGap;
					start = false;
				} else
					start = true;
				continue;
			}
			if (c.equals('0'))
				tempGap++;
		}

		return longestGap;
	}

}
