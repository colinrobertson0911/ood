package com.fdmgroup.exceptions;

import java.util.Random;

public class BadService {
	
	public static void badCode() throws GeneralServiceException, SpecificServiceException {
		
		Random random = new Random();
		int errorNumber = random.nextInt(2);
		
		if (errorNumber == 0)
			throw new GeneralServiceException("Not sure what error happened");
		
		if (errorNumber == 1)
			throw new SpecificServiceException("I know whats wrong");
	}

}
