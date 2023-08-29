package com.manufacturer.exception;

import org.springframework.http.HttpStatus;

public class ManufacturerNotFound extends RuntimeException {
	 public ManufacturerNotFound(String message){
		    super(message);
		  }

	/*
	 * @Override public HttpHeaders getResponseHeaders() { // return response
	 * headers }
	 */
}
