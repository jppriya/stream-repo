package com.jp.poc.javapassbyvalue;



/**
 * @author jayapriya.r
 *
 *
 *https://javaranch.com/campfire/StoryCups.jsp
 *
 *https://javaranch.com/campfire/StoryPassBy.jsp
 */
public class PassByValue {
	
	/*
	 * Primitive cups hold primitive values.
	 * Reference cups hold remote controls to objects.
	 * */
	
	
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
