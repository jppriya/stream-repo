package com.jp.poc.sample.overload;

public class OverloadMain {

	public static void main(String[] args) {
		Overload overload = new Overload();
		// Type depromotion rule

//		int		-->	float
//		|	\___/	|
//		|	/	\	|
//		long 	-->	double
		overload.overload(new Long(1));
		overload.overload(1);
		overload.overload(new Float(1));
		overload.overload(new Double(1));

	}

}
