package com.codewars.challenges.code;

import java.util.ArrayList;

public class Metro {

	public static int countPassengers(ArrayList<int[]> stops) {

		int totalBoarded = 0;
		int totalDeBoarded = 0;

		for (int[] stop : stops) {
			totalBoarded += stop[0];
			totalDeBoarded += stop[1];
		}

		return totalBoarded - totalDeBoarded;
	}
}
