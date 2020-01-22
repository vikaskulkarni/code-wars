package com.codewars.challenges.code;

import java.util.ArrayList;
import java.util.List;

public class isogram {
	public static boolean isIsogram(String str) {
		List<Character> chars = new ArrayList<>();
		if (str == "")
			return true;

		str = str.toLowerCase();

		for (Character c : str.toCharArray()) {
			if (chars.contains(c))
				return false;
			else
				chars.add(c);

		}

		return true;
	}

}
