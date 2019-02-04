package com.jp.poc.programs;

public class Palindrome {
	public static void main(String args[]) {
		System.out.println(palindrome("Madam"));
	}

	private static boolean palindrome(String word) {
		StringBuilder builder = new StringBuilder(word);
		return builder.reverse().toString().equalsIgnoreCase(word);

	}
}
