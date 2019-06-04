package com.jp.poc.sample.abstracts;

/**
 * @author jayapriya.r
 * 
 *         Abstract class can be there without having abstract members in the
 *         class. on the other hand if a class have abstract member then that
 *         class should be declared as abstract
 * 
 */
public abstract class AbstractClass {
	
	private AbstractClass() {
		
	}

	// Abstract method shouldn't have method body
	public abstract void abstractMethod();

	public void nonAbstractMethod() {
		System.out.println("Non Abstract Method");
	}

}
