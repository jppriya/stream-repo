package com.jp.poc.sample;

import java.util.ArrayList;
import java.util.List;

public class SampleListOperations {

	public static void main (String args[]) {
		System.out.println("List Operations");
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
