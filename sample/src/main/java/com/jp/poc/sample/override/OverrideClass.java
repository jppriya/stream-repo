package com.jp.poc.sample.override;

public class OverrideClass {
	
	public void overrideMe(){
		System.out.println("Override Class Override ME");
	}
	

	public void overLoadMe(String passMe) {
		System.out.println("OverrideExample- Overload me: " + passMe);
	}
	
	public static void staticMethodOverride() {
		System.out.println("Static method Override");
	}

}
