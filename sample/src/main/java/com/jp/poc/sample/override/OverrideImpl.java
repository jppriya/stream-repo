package com.jp.poc.sample.override;

public class OverrideImpl implements IOverride {

	@Override
	public void overrideMe() {
		System.out.println("Override impl");
	}

	public OverrideImpl() {
		super();
	}

}
