package com.jp.poc.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class Stream {

	public static void main(String[] args) {
		List<String> nameList = toList();
		System.out.println("List Of Name" + nameList);
		Set<String> nameSet = toSet();
		System.out.println("Set Of Name" + nameSet);
		LinkedList<String> linkedList = toCollection();
		System.out.println("Linked list Of Name" + linkedList);

		Map<String, String> map = toMap();
		System.out.println("MapOf Name" + map);
		Map<String, Integer> map1 = toMap1();
		System.out.println("MapOf Name" + map1);
	}

	public static List<String> toList() {
		List<String> personName = Arrays.asList("John", "James", "Steve", "Smith");
		List<String> collect = personName.stream().map(StringUtils::lowerCase).collect(ImmutableListCollector.toImmutableList());
		System.out.println("Custom Collectors" + collect);
		// Sample Response List Of Name[john, james, steve, smith]
		return personName.stream().map(StringUtils::lowerCase).collect(Collectors.toList());
	}

	public static Set<String> toSet() {
		List<String> personName = Arrays.asList("John", "James", "Steve", "John");
		// Sample Response Set Of Name[james, steve, john]
		return personName.stream().map(String::toLowerCase).collect(Collectors.toSet());
	}

	public static LinkedList<String> toCollection() {
		List<String> personName = Arrays.asList("John", "James", "Steve", "John");
		// Sample Response Linked list Of Name[john, james, steve, john]
		return personName.stream().map(String::toLowerCase).collect(Collectors.toCollection(LinkedList::new));
	}

	public static Map<String, String> toMap() {
		List<String> personName = Arrays.asList("John", "James", "Steve", "John");
		// the below thing will do combine the value of duplicate keys.. Third
		// parameter will create the unique key by applying function into it. In
		// this method it will combine old value and new value seperating by
		// COMMA
		System.out.println("toMap()" + personName.stream().map(String::toLowerCase)
				.collect(Collectors.toMap(Function.identity(), v -> v, (o, n) -> String.join(" ,", o, n))));
		// Sample Response MapOf Name{JAMES=james, SMITH=smith, JOHN=john,
		// STEVE=steve}
		return personName.stream().map(String::toLowerCase)
				.collect(Collectors.toMap(k -> StringUtils.upperCase(k), v -> v, (o, n) -> o));
	}

	public static Map<String, Integer> toMap1() {
		List<String> personName = Arrays.asList("John", "James", "Steve", "Smith");
		// Sample Response "MapOf Name{smith=5, james=5, steve=5, john=4}"
		return personName.stream().map(String::toLowerCase)
				.collect(Collectors.toMap(Function.identity(), String::length));
	}
	
	public static class ImmutableListCollector {
		 
	    public static <t, A extends List<t>> Collector<t, A, List<t>> toImmutableList(Supplier<A> collectionFactory) {
	        return Collector.of(collectionFactory, List::add, (left, right) -> {
	            left.addAll(right);
	            return left;
	        }, Collections::unmodifiableList);
	    }
	 
	    public static <t> Collector<t, List<t>, List<t>> toImmutableList() {
	        return toImmutableList(LinkedList::new);
	    }
	}

}




