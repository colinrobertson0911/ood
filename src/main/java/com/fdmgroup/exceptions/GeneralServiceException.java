package com.fdmgroup.exceptions;

public class GeneralServiceException extends Exception {

	
	private static final long serialVersionUID = -1810757601938502466L;
	
	public GeneralServiceException() {
		super();
	}
	public GeneralServiceException(String message) {
		super(message);

	}
	public GeneralServiceException(String message, Throwable cause) {
		super(message, cause);
		
	}

}
