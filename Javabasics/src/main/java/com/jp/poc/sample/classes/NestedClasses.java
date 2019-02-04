package com.jp.poc.sample.classes;

public class NestedClasses {

	public static void main(String... args) {

		StaticClass staticClass = new StaticClass();
		staticClass.nonStaticMethod();
		StaticClass.staticMethod();

		NonStaticClass nonStaticClass = new NestedClasses().new NonStaticClass();
		nonStaticClass.nonStaticMethod();

	}

	static class StaticClass {
		public void nonStaticMethod() {
			System.out.println("Static class Non Static Method");
		}

		public static void staticMethod() {
			System.out.println("Static class static method");
		}
	}

	public class NonStaticClass {
		public void nonStaticMethod() {
			System.out.println("Non Static Class Non Static Method");
		}
	}

}
