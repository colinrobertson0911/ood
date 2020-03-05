package com.fdmgroup.LoggingTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingTest {
	
	private static final Logger LOGGER = LogManager.getLogger(LoggingTest.class);
	
	public static void main(String[] args) {
		LOGGER.info("Info Level");
		LOGGER.debug("Debug Level");
		LOGGER.fatal("Fatal Level");
		
	}

}
