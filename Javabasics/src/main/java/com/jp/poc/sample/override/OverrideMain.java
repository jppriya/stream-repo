package com.jp.poc.sample.override;

/**
 * @author jayapriya.r 
 * OverrideExampless Class Override ME 
 * OverrideExample- Overload me: PASSED 
 * Static method OverrideExample 
 * Override impl 
 * Satic Override 
 * Data member override5 
 * THIS IS DEFAULT METHOD IN IMPL CLASS
 */
public class OverrideMain {

	public static void main(String args[]) {
		OverrideClass overrideExample = new OverrideExample();
		overrideExample.overrideMe();

		// Overload method is not there in Overide Example. But still compiler calls the
		// method which is there in the Override class. So, Inheritance will execute
		// from the method reference(ie Class Type)
		overrideExample.overLoadMe("PASSED");

		// Compilation error. Since Object is identified from the
		// reference.overloadWhichIsNotThereInOverride is not available in Override
		// CLass

		// overrideExample.overloadWhichIsNotThereInOverride();

		// Static method can't be overriden. Since static is for class level not at
		// instance level
		OverrideExample.staticMethodOverride();

		IOverride override = new OverrideImpl();
		override.overrideMe();
		IOverride.staticOverride();

		// We cannot override data member. Data member are resolved at runtime by the
		// reference variable of type
		System.out.println("Data member override" + (override.overrideDataMember));

		// This object doenst have access to add(int, int) method. This method
		// reference doesn't have declaration for this method
		IOverride verifyAddForIOverride = new OverrideImpl();
		verifyAddForIOverride.add(0, 0l);

		// This object doesn't have access to add(int, long) method. This method
		// reference doesn't have declaration for this method
		OverrideMe verifyAddForOverrideMe = new OverrideImpl();
		verifyAddForOverrideMe.add(0, 0);

		// This object has access to all the add methods. since method reference has
		// access for all the methods
		OverrideImpl verifyAddForOverrideImpl = new OverrideImpl();
		verifyAddForOverrideImpl.add(0, 0l);
		verifyAddForOverrideImpl.add(0, 0);

		IOverride verifyDefaultMethodForIOverride = new OverrideImpl();
		verifyDefaultMethodForIOverride.defaultMethod();
	}

}
