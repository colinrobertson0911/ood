package com.fdmgroup.variables;

/**
 * Variables demo
 *
 */
public class Variables {
	// class level, class member variable
	static char myCharacter = 'A';
	static int noValue;
	static boolean noValueBoolean;
	
	public static void main(String[] args) {
		System.out.println("noValue default? " + noValue);
		System.out.println("noValueBoolean? " + noValueBoolean);
		demoVariable();
		notNumbers();
		isOddOrEven(6);
	}
	
	public static void demoVariable() {
		// 8  bit
		byte myByte = 127;
		System.out.println("myByte = " + myByte);
		myByte += 1;
		System.out.println("myByte = " + myByte);
		
		// 16 bits
		short myShort = 16000;
		System.out.println("myShort = " + myShort);
		
		// 32 bits
		int myInteger = 2147483647;
		System.out.println("myInteger current value = " + myInteger);
		myInteger += 1;
		System.out.println("myInteger current value = " + myInteger);
	
		float myFloat = 1.234f;
		myFloat *= 10;
		System.out.println("myFloat = " + myFloat);
		myFloat /= 6;
		System.out.println("myFloat = " + myFloat);
		
		long myLong = -1;
		myLong =+1;
		System.out.println("myLong = " + myLong);
	}
	
	public static void notNumbers() {
		System.out.println("myChar = " + myCharacter);
		myCharacter = '\u0050'; //unicode represents a P
		System.out.println("myChar = " + myCharacter);
		
		boolean trueOrFalse = true;
		System.out.println("trueOrFalse = " + trueOrFalse);
		trueOrFalse = false;
		System.out.println("trueOrFalse = " + trueOrFalse);
	}
	
	public static void isOddOrEven(int number) {
		if (number % 2 == 0) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}
	}
	
}
