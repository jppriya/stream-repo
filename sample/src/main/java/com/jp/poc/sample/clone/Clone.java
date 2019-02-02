package com.jp.poc.sample.clone;

public class Clone {
	/*
	 * Output Of the Program
	 * 
	 * String after clone First String
	 * Object Equality false
	 * Object Equality with Equals false 
	 * String after changing cloned object= Old Object-->First String
	 * New Object-->Second String
	 * 
	 */
	public static void main(String[] args) {
		CloneExample oldObject = new CloneExample();
		oldObject.setSampleString("First String");
		try {
			CloneExample newObject = (CloneExample) oldObject.clone();
			System.out.println("String after clone " + newObject.getSampleString());

			System.out.println("Object Equality " + (oldObject == newObject));
			System.out.println("Object Equality with Equals" + (oldObject.equals(newObject)));

			newObject.setSampleString("Second String");
			System.out.println("String after changing cloned object= Old Object-->" + oldObject.getSampleString()
					+ "New Object-->" + newObject.getSampleString());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
