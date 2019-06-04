package com.jp.poc.sample.singleton;

public class BaseClass {

	private BaseClass() {
		System.out.println("Sigleton");
		
	}
	
	private void eat(){
		
	}

	BaseClass anonymousClass =new BaseClass() {
		void eat() {
			System.out.println("nice fruits");
		}
	};
	
	
}
