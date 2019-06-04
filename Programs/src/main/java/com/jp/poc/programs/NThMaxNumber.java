package com.jp.poc.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NThMaxNumber {

	public static void main(String args[]) {
		Integer[] numbers = new Integer[] { 1, 5, 6, 2, 0 };
		int n = 3;
		NThMaxNumber.findNThMaxNumber(numbers, n);
	}

	private static void findNThMaxNumber(Integer[] numbers, int n) {
		List<Integer> listOfNumbers = Arrays.asList(numbers);
		Collections.sort(listOfNumbers);
		if (listOfNumbers.size() < n) {
			System.out.println("n is greater than List size");
		} else
			System.out.println("N th Max element is" + listOfNumbers.get(n - 1));
	}

}
