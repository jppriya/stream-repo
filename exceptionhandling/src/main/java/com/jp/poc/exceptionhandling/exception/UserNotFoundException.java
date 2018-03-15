package com.jp.poc.exceptionhandling.exception;

import com.jp.poc.exceptionhandling.model.ErrorResponse;

/**
 * @author jayapriya.r
 *
 */
public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String errorCode;
	private ErrorResponse errorResponse;

	public UserNotFoundException(String errorCode, String msg) {
		super(msg);
		this.errorCode = errorCode;
	}

	public UserNotFoundException(ErrorResponse errorResponse) {
		this.errorResponse = errorResponse;
	}

	public UserNotFoundException(String msg) {
		super(msg);
	}

	public final String getErrorCode() {
		return errorCode;
	}

	public final ErrorResponse getErrorResponse() {
		return errorResponse;
	}

}
