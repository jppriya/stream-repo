package com.jp.poc.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter your String");
    	String str = scanner.nextLine();
    	scanner.close();
		printAllPalindrome(str);
	}

	public static boolean checkPalindrome(String str) {
		StringBuilder builder = new StringBuilder(str).reverse();
		return str.equalsIgnoreCase(builder.toString());
	}

	public static void printAllPalindrome(String str) {
		List<String> allPalindromeStrings = new ArrayList<>();
		for (int i = 0; i <= str.length(); i++)
			for (int j = i; j < str.length(); j++)
				if (checkPalindrome(str.substring(i, j + 1)))
					allPalindromeStrings.add(str.substring(i, j + 1));
		System.out.println(allPalindromeStrings.size());
	}

}
