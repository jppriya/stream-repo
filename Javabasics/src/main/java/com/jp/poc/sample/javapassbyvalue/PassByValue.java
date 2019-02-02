package com.jp.poc.sample.javapassbyvalue;

/**
 * @author jayapriya.r
 *
 *
 *https://javaranch.com/campfire/StoryCups.jsp
 *
 *https://javaranch.com/campfire/StoryPassBy.jsp
 *
 */


/**
 * Java is pass-by-value.For primitives, you pass a copy of the actual value.
 * For references to objects, you pass a copy of the reference (the remote control).
 *
 */
public class PassByValue {
	
	/*
	 * Primitive cups hold primitive values.
	 * Reference cups hold remote controls to objects.
	 * */
	
	
	/**
	 * @param args
	 * /*
	 * Output of the programs
	 * 1 
	 * Cat1 366712642 
	 * Cat2 1829164700 
	 * Updating the reference :Cat3 Cat3-> 2 Cat2-> 2 
	 * Updating the source :Cat2 Cat3-> 3 Cat2-> 3 
	 * Cat2 1829164700 
	 * Cat3 1829164700
	 */
	public static void main (String args[]) {
		Cat cat1= new Cat("Kivi",1,"Black");
		checkPassByValue(cat1);
		System.out.println(cat1.getAge());
		
		Cat cat2= new Cat("Kiti",1,"Black");
		System.out.println("Cat1	"+cat1.hashCode());
		System.out.println("Cat2	"+cat2.hashCode());
		Cat cat3 = cat2;
		cat3.setAge(2);
		System.out.println("Updating the reference	:Cat3	"+ "Cat3->	" + cat3.getAge() +"	Cat2->	" +  cat2.getAge());
		cat2.setAge(3);
		System.out.println("Updating the source	:Cat2	"+ "Cat3->	" + cat3.getAge() +"	Cat2->	" +  cat2.getAge());
		System.out.println("Cat2	"+cat2.hashCode());
		System.out.println("Cat3	"+cat3.hashCode());
	}

	private static void checkPassByValue(Cat cat1) {
		cat1= new Cat("niti", 3, "white");
		cat1.setAge(2);
	}

	
}
