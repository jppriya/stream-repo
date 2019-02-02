package com.jp.poc.sample.override;

public class OverrideExample extends OverrideClass {

	public void overrideMe() {
		System.out.println("OverrideExampless Class Override ME");
	}
	
	public void overloadWhichIsNotThereInOverride() {
		System.out.println("Method is not there in the Override");
	}
	
	public static void staticMethodOverride() {
		System.out.println("Static method OverrideExample");
	}

}
