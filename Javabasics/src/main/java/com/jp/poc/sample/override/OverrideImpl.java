package com.jp.poc.sample.override;

public class OverrideImpl implements IOverride, OverrideMe {

	int overrideDataMember = 10;

	@Override
	public void overrideMe() {
		System.out.println("Override impl");
	}

	public OverrideImpl() {
		super();
	}

	@Override
	public int add(int number1, long number2) {
		return 0;
	}

	@Override
	public int add(int number1, int number2) {
		return 0;
	}

	@Override
	public void defaultMethod() {
		System.out.println("THIS IS DEFAULT METHOD IN IMPL CLASS");
	}

}
