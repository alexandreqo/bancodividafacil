package com.bancodividafacil.dividafacil.config;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bancodividafacil.dividafacil.common.ValidationException;



@ControllerAdvice
public class ValidationExceptionHandler {
	
	@ExceptionHandler(ValidationException.class)
	@ResponseBody
	public ResponseEntity<Map<String,String>>  handlerValidationException(ValidationException ex) {
		return new ResponseEntity<>(ex.getErros(), HttpStatus.FORBIDDEN);
	}
}