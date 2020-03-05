package com.fdmgroup.fizzbuzz;

public class FizzBuzzRunner {

	private FizzBuzzRunner() {

	}

	public static String checkNumberAgainstRule(int number) {
		if (number == 0)
			return String.valueOf(number);

		if (isFizzBuzz(number)) {
			return "FizzBuzz";
		} else if (isFizz(number)) {
			return "Fizz";
		} else if (isBuzz(number)) {
			return "Buzz";
		} else {
			return String.valueOf(number);
		}
	}

	public static boolean isFizz(int number) {
		return number % 3 == 0;
	}

	public static boolean isBuzz(int number) {
		return number % 5 == 0;
	}

	public static boolean isFizzBuzz(int number) {
		return isFizz(number) && isBuzz(number);
	}
}
