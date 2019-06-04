package com.jp.poc.programs;


import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {
		Double l = null;
		Map<String, String> map = new HashMap<>();
		"jayapriya".indexOf(0);
//		System.out.println("jayapriya".charAt(0) == 's');
//		System.out.println(isPalindromeString("dfsJAYAJ"));
//		System.out.println(longestPalindromeString("abccba"));
//		System.out.println(printAllPalindrome("daata"));
		System.out.println();
		printAllPalindrome("abccba");
	}
	
	static void subString(String value, int n) { 
		char[] str = value.toCharArray();
        // Pick starting point 
        for (int len = 1; len <= n; len++) { 
            // Pick ending point 
            for (int i = 0; i <= n - len; i++) { 
                //  Print characters from current 
                // starting point to current ending 
                // point.   
                int j = i + len - 1; 
                for (int k = i; k <= j; k++) { 
                	
                    System.out.print(str[k]); 
                } 
  
                System.out.println(); 
            } 
        } 
    } 
  
	 public static boolean checkPalindrome(String str) {
	        for(int i=0;i<=str.length()/2;i++)
	            if(str.charAt(i)!=str.charAt(str.length()-1-i))
	                return false;
	        return true;
	    }

	    public static void printAllPalindrome(String str) {
	        for(int i=0;i<=str.length();i++)
	            for(int j=i;j<str.length();j++)
	                if(checkPalindrome(str.substring(i,j+1)))
	                    System.out.println(str.substring(i,j+1));
	    }

	    
	public static Set<CharSequence> printAllPalindromes(String input) {
	    if (input.length() <= 2) {
	        return Collections.emptySet();
	    }
	    Set<CharSequence> out = new HashSet<CharSequence>();
	    int length = input.length();
	    for (int i = 1; i <= length; i++) {
	        for (int j = i - 1, k = i; j >= 0 && k < length; j--, k++) {
	            if (input.charAt(j) == input.charAt(k)) {
	                out.add(input.subSequence(j, k + 1));
	            } else {
	                break;
	            }
	        }
	    }
	    return out;
	}

	private static boolean isPalindromeString(String str) {
		if (str == null)
			return false;
		int length = str.length();
//		System.out.println(length / 2);
		for (int i = 0; i < length / 2; i++) {

			if (str.charAt(i) != str.charAt(length - i - 1))
				return false;
		}
		String[] st = {"j","p"};
//		System.out.println(Arrays.asList(new String[] {"h","f"}).stream().min(Comparator.comparing(a->a)));
		return true;
	}

	static public String intermediatePalindrome(String s, int left, int right) {
		if (left > right)
			return null;
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
//		System.out.println("LEFT**"+s.substring(left + 1, right));
		return s.substring(left + 1, right);
	}

	// O(n^2)
	public static String longestPalindromeString(String s) {
		if (s == null)
			return null;
		String longest = s;
		for (int i = 0; i < s.length() - 1; i++) {
			// odd cases like 121
			String palindrome = intermediatePalindrome(s, i, i);
//			System.out.println("------"+palindrome);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
			// even cases like 1221
			palindrome = intermediatePalindrome(s, i, i + 1);
			System.out.println("------******"+palindrome);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
		}
		return longest;
	}

}
