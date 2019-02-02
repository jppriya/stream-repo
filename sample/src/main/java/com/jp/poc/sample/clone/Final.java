package com.jp.poc.sample.clone;

public class Final {

	public static void main(String[] args) {
		Final first = new Final(10);
		Final second = new Final(20);
		System.out.println("first.finalValue -> " + first.finalValue + " second.finalValue -> " + second.finalValue);
	}

	// This is called blank final variable. If its not static it can be initialized
	// in constructor.
	// If it is static it can be initialized in static initializer block
	public final int finalValue;

	public Final(final int value) {
		// This is possible only when the final variable is not initialized. If that is
		// initialized reassign is not possible
		finalValue = value;
	}

	public Final(int value, final int finalVal) {
		// Local variable can be reassigned
		value = 100;

		// Compilation error. Final local variable can't be reassigned
		// finalVal = 500;
		finalValue = value;
	}

}
