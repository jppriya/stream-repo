package com.jp.poc.sample.clone;

public class CloneExample implements Cloneable {
	
	public String sampleString;
	

	public String getSampleString() {
		return sampleString;
	}


	public void setSampleString(String sampleString) {
		this.sampleString = sampleString;
	}


	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
