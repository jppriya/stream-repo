package com.jp.poc.sample.override;

public class SubCovariant extends SuperCovariant {

	//Subclass can change the return type to of its type while overriding a method which is there in super class return type as non-primitive
	public SuperCovariant covariant() {
		return new SubCovariant();
	}
}
