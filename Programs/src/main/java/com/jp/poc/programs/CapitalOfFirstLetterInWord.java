package com.jp.poc.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalOfFirstLetterInWord {
	public static void main(String args[]) {
		System.out.println(capitalOfFirstLetterInWord("make first character as capital in the sentence"));
	}

	private static String capitalOfFirstLetterInWord(String sentence) {
		String[] words = sentence.split(" ");
		List<String> collect = Arrays.asList(words).stream()
				.map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1)).collect(Collectors.toList());
		return String.join(" ", collect);
	}
}
