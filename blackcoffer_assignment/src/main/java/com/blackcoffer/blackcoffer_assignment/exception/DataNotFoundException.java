package com.blackcoffer.blackcoffer_assignment.exception;

public class DataNotFoundException extends RuntimeException {
	private String message;

	public DataNotFoundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
