package com.codewars.challenges.duplicateEncoder;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
	static String encode(String word) {
		StringBuffer returnValue = new StringBuffer();
		/*
		 * String specialCharsRegex = "[^\\w^\\s]+";
		 *
		 * for (Character c : word.toCharArray()) { String s =
		 * String.valueOf(c).toLowerCase(); Pattern pattern =
		 * s.matches(specialCharsRegex) ?
		 * Pattern.compile("^[^\\" + s + "]*(\\" + s + "[^\\" + s + "]*){1}$") :
		 * Pattern.compile("^[^" + s + "]*(" + s + "[^" + s + "]*){1}$"); Matcher m =
		 * pattern.matcher(word.toLowerCase());
		 *
		 * if (!m.matches()) { returnValue.append(")"); } else returnValue.append("(");
		 * }
		 */

		Map<String, Integer> wordMap = new HashMap<>();

		for (Character c : word.toCharArray()) {
			String s = String.valueOf(c).toLowerCase();
			if (wordMap.get(s) != null) {
				Integer v = wordMap.get(s);
				wordMap.put(s, ++v);
			} else {
				wordMap.put(s, 1);
			}
		}

		for (Character c : word.toCharArray()) {
			String s = String.valueOf(c).toLowerCase();
			if (wordMap.get(s) > 1) {
				returnValue.append(")");
			} else {
				returnValue.append("(");
			}
		}

		return returnValue.toString();
	}

	public static void main(String[] args) {
//		System.out.println(encode("(( @"));
//		System.out.println(encode("(()"));
//		System.out.println(encode("adcd"));
		System.out.println(encode("Success"));
//		System.out.println(encode("S)mQyeaF!S"));
//		System.out.println(encode("@!wQzazH!e"));
	}
}
