package com.jp.poc.sample.override;

public interface IOverride {
	
	void overrideMe();

	static void staticOverride() {
		System.out.println("Satic Override");
	}
}
