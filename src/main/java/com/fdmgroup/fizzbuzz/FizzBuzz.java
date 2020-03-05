package com.fdmgroup.fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {

		int targetNumber = 100;

		for (int i = 1; i <= targetNumber; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
