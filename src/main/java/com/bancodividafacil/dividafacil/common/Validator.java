package com.bancodividafacil.dividafacil.common;

import java.util.Map;

public interface Validator<T> {

	void validateAndTrow(T obj);

	Map<String, String> validate(T obj);

}
