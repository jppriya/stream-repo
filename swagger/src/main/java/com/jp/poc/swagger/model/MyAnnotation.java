package com.jp.poc.swagger.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

@Target({ElementType.FIELD	})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

	/**
	 * Declares whether the annotated dependency is required.
	 * <p>Defaults to {@code true}.
	 */
	String name();

}

