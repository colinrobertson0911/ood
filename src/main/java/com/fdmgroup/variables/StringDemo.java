package com.fdmgroup.variables;

public class StringDemo {

	public static void main(String[] args) {
		
		inefficent();
		String myBigString = buildABigString();
		System.out.println(myBigString);
		String stringToManipulate = buildABufferredBigString();
		System.out.println(stringToManipulate);
		libraryDemo(stringToManipulate);
		
		
	}
	//First Second Third Fourth 
	private static void libraryDemo(String stringToManipulate) {
		
		System.out.println("The 10th character is " + stringToManipulate.charAt(9));
		System.out.println("Ends with Forth?" + stringToManipulate.endsWith("Fourth"));
		System.out.println("Position of the character 'c' is " + stringToManipulate.indexOf('c'));
		System.out.println("Total length of line is " + stringToManipulate.length());
		System.out.println(stringToManipulate.substring(13, 18));
	}
	private static void inefficent() {
		String demoString = "";
		System.out.println("\ndemoString = " + demoString);
		
		String first = "ABC";
		String second = first;
		System.out.println("\tSame String? " + (first == second));
		
		second = "ABC";
		System.out.println("Same String? " + (first == second));
		
		String third = new String("hello");
		String fourth = new String("hello");
		//Test reference for same memory
		System.out.println("Same String? " + (third == fourth));
		//Test contents for equality
		System.out.println("Contents equal?" + (third.equals(fourth)));
	}
	// Fastest but not thread-safe
	private static String buildABigString() {
		StringBuilder builder = new StringBuilder();
		builder.append("First ");
		builder.append("Second ");
		builder.append("Third ");
		builder.append("Fourth");
		return builder.toString();
	}
	
	//A bit slower but thread-safe
	private static String buildABufferredBigString() {
		StringBuffer builder = new StringBuffer();
		builder.append("First ");
		builder.append("Second ");
		builder.append("Third ");
		builder.append("Fourth");
		return builder.toString();
	}
		
		
}
