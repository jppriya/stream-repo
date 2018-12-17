package com.jp.poc.javapassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class SampleListOperations {

	public static void main (String args[]) {
		System.out.println("List Operations");
		Long a =null;
		Long b= 181l;
		System.out.println(Long.compare(a, b) ==0);
		List<String> list = new ArrayList<>();
		list.add("Jaya");
		updateList(list);
		//Size will be 2
		System.out.println("List Size"+ list.size()); 
	}

	private static void updateList(List<String> list) {
		list.add("Priya");
	}
	
}
