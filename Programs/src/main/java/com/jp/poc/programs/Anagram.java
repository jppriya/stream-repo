package com.jp.poc.programs;

import java.util.Arrays;

/**
 * @author jayapriya.r
 *
 */
public class Anagram {
	public static void main(String args[]) {
		System.out.println(anagram("amy", "may"));
	}

	/**
	 * @param firstString
	 * @param secondString
	 * @return
	 */
	private static boolean anagram(String firstString, String secondString) {
		char[] firstStringCharArray = firstString.toCharArray();
		Arrays.sort(firstStringCharArray);
		char[] secondStringCharArray = secondString.toCharArray();
		Arrays.sort(secondStringCharArray);
		if (firstString.length() != secondString.length()) {
			return false;
		}
		for (int i = 0; i < firstStringCharArray.length; i++) {
			if (firstStringCharArray[i] != secondStringCharArray[i]) {
				return false;
			}
		}
		return true;
	}
}
