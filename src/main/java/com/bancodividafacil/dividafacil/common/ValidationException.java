package com.bancodividafacil.dividafacil.common;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

@Builder
@AllArgsConstructor
public class ValidationException extends RuntimeException{

	private static final long serialVersionUID = 8648017708525046210L;

	@Singular
	@Getter
	private final Map<String,String> erros;

	private final Exception parent;
	
}
