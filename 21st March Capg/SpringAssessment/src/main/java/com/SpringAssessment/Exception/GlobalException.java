package com.SpringAssessment.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    
	@ExceptionHandler(UserNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String notFound(UserNotFoundException ex) {
		return ex.getMessage();
	}
	@ExceptionHandler(UserAlreadyExistException.class)
	@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
	public String alreadyexist(UserAlreadyExistException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(IncorrectPasswordException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String wrongpassword(IncorrectPasswordException ex) {
		return ex.getMessage();
	}
}
