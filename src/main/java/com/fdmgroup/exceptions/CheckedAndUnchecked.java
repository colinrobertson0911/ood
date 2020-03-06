package com.fdmgroup.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedAndUnchecked {

	public static void main(String[] args) {
		//unchecked();
		try {
			checked();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	// Can be expected to continue after an ArithmeticException
	private static void unchecked() {
		int x = 0;
		int y = 10;
		int z = y / x;
	}
	
	private static void checked() throws FileNotFoundException {
		FileReader file = new FileReader("c:\\nonexistantfile.txt");
	}
}
