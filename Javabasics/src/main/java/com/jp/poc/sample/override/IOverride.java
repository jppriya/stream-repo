package com.jp.poc.sample.override;

public interface IOverride {

	void overrideMe();

	int add(int number1, long number2);

	int overrideDataMember = 5;

	static void staticOverride() {
		System.out.println("Satic Override");
	}

	default void defaultMethod() {
		System.out.println("This is default method");
	}
}
