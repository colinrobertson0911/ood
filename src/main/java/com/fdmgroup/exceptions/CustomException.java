package com.fdmgroup.exceptions;

public class CustomException {
	
	public static void main(String[] args) {
		
		try {
			BadService.badCode();
		} catch (GeneralServiceException | SpecificServiceException e) {
			e.printStackTrace();
			// log it
		}
	}

}
