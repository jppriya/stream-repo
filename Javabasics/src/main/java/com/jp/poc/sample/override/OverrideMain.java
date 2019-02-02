package com.jp.poc.sample.override;

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
		
		//Static method can't be overriden. Since static is for class level not at instance level
		OverrideExample.staticMethodOverride();
		
		IOverride override = new OverrideImpl();
		override.overrideMe();
		IOverride.staticOverride();
		
		
	}

}
