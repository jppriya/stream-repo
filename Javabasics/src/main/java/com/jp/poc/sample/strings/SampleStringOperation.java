package com.jp.poc.sample.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://stackoverflow.com/questions/11989261/does-concatenating-strings-in-java-always-lead-to-new-strings-being-created-in-m

//https://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.10.5
public class SampleStringOperation {

//
//	false
//	true
//	-456007504 -456007504
//	true  true
//	false
//	true
//	-456007504 -456007504
//	JAYAPRIYA Jayapriya
//	true

	public static void main(String... args) {
//
//		String s1 = "Jaya";
//
//		String s2 = "priya";
//
//		String s3 = s1 + s2;
//
//		String s4 = "Jayapriya";
//
//		String s5 = "Jayapriya";
//
//		String s6 = new String("Jayapriya");
//
//		String s7 = "Jaya" + "priya";
//
//		String s8 = s3.intern();
//
//		System.out.println(s3 == s4);
//		System.out.println(s3.equals(s4));
//		System.out.println(s3.hashCode() + " " + s4.hashCode());
//		System.out.println((s4 == s5) + "  " + (s4 == s7));
//		System.out.println(s3 == s6);
//		System.out.println(s3.equals(s6));
//		System.out.println(s3.hashCode() + " " + s6.hashCode());
//		System.out.println(s4.toUpperCase() + " " + s4);
//
//		System.out.println((s8 == s4));
		
		char[]  arr = {'j','k'};
		String str="jayapriya";
		List<Character> collect = str.chars().mapToObj(c1->(char)c1).collect(Collectors.toList());
		List<char[]> asList = Arrays.asList(arr);
		System.out.println(asList);
	}

//	package testPackage;
//	class Test {
//	    public static void main(String[] args) {
//	        String hello = "Hello", lo = "lo";
//	        System.out.print((hello == "Hello") + " ");
//	        System.out.print((Other.hello == hello) + " ");
//	        System.out.print((other.Other.hello == hello) + " ");
//	        System.out.print((hello == ("Hel"+"lo")) + " ");
//	        System.out.print((hello == ("Hel"+lo)) + " ");
//	        System.out.println(hello == ("Hel"+lo).intern());
//	    }
//	}
//	class Other { static String hello = "Hello"; }

	// OUTPUT
//	true true true true false true

}
