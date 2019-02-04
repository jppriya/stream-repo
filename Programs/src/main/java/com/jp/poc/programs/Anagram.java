package com.jp.poc.programs;

import java.util.Arrays;

public class Anagram {
	public static void main(String args[]) {
		System.out.println(anagram("amy", "may"));
	}

	private static boolean anagram(String firstString, String secondString) {
		char[] firstSTringCharArray = firstString.toCharArray();
		Arrays.sort(firstSTringCharArray);
		char[] secondStringCharArray = secondString.toCharArray();
		Arrays.sort(secondStringCharArray);
		if (firstString.length() != secondString.length()) {
			return false;
		}
		for (int i = 0; i < firstSTringCharArray.length; i++) {
			if (firstSTringCharArray[i] != secondStringCharArray[i]) {
				return false;
			}
		}
		return true;
	}
}
