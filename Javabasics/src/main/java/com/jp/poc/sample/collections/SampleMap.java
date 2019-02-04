package com.jp.poc.sample.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SampleMap {

	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList(new String[] { "ABC", "AAA", "ABB" });
		Collections.sort(asList, Comparator.comparing(a -> a));
		
		System.out.println(asList);
		Map<String, String> mapNullKeys = new HashMap<>();
		mapNullKeys.put(null, "Jaya");
		mapNullKeys.put(null, "Priya");
		mapNullKeys.put(null, "Jayapriya");
		mapNullKeys.get(null);
		System.out.println(mapNullKeys.get(null));
		mapNullKeys.keySet().stream().forEach(val -> System.out.println(val));

		Hashtable<String, String> hashTable = new Hashtable<>();
//		hashTable.put(null, "Jaya");
//		hashTable.put("Priya", null);
		System.out.println(hashTable.get("Priya"));

		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("jaya", null);

	}

}
