package com.fdmgroup.passByValue;

public class PassByValue {
	
	public static void main(String[] args) {
		int x = 1;
		int y = 101;
		swapParams(x, y);
		System.out.println("Outside of swapped values x = " + x + " y = " + y);
		
		Address address = new Address("1", "2", "3", "4", "5");
		Address address2 = new Address("5", "2", "3", "4", "1");
		swapReferences(address, address2);
		System.out.println(address);
	}
	
	public static void swapParams(int x, int y) {
		//Can't alter outside of this method
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Swapped values x = " + x + " y = " + y);
		
	}
	
	public static void swapReferences(Address one, Address two) {
		//Can't alter outside of this method
		Address temp = one;
		one = two;
		two = temp;
		
		//But can alter contents of an object
		two.setCity("Glasgow");
	}
}
