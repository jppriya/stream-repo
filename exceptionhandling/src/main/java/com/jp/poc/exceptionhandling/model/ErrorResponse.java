package com.jp.poc.exceptionhandling.model;

import java.util.Date;

/**
 * @author jayapriya.r
 *
 */
public class ErrorResponse {

	private String description;
	private String message;
	private Date timestamp;

	public ErrorResponse(String description, String message, Date timestamp) {
		super();
		this.description = description;
		this.message = message;
		this.timestamp = timestamp;
	}

	public final String getDescription() {
		return description;
	}

	public final String getMessage() {
		return message;
	}

	public final Date getTimestamp() {
		return timestamp;
	}
	
	
}
