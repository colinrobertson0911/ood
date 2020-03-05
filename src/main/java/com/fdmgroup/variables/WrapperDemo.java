package com.fdmgroup.variables;

public class WrapperDemo {

	public static void main(String[] args) {
		int primitiveInt = 1000;
		Integer myInteger = Integer.valueOf(primitiveInt);
		System.out.println(myInteger);
		
		String someValue = "true";
		Boolean what = Boolean.parseBoolean(someValue);
		System.out.println(what);
		
		Integer anotherInteger = new Integer(primitiveInt);
		System.out.println(anotherInteger);
	}

}
