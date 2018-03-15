package com.jp.poc.exceptionhandling.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jp.poc.exceptionhandling.model.ErrorResponse;

/**
 * @author jayapriya.r
 *
 */
@RestControllerAdvice
public class CustomExceptionHandler {

	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = UserNotFoundException.class)
	public ErrorResponse handleUserNotFoundException(UserNotFoundException userNotFoundException) {
		return null != userNotFoundException.getErrorResponse() ? userNotFoundException.getErrorResponse()
				: new ErrorResponse("UserNotFound", "User Not Found Exception", new Date());
	}

}
