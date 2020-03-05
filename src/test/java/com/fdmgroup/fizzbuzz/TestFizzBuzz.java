package com.fdmgroup.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TestFizzBuzz {

	@Test
	void isFizzWhenNumberIsThreeTrue() {
		assertEquals(true, FizzBuzzRunner.isFizz(3));
	}

	@Test
	void isBuzzWhenNumberIsFiveTrue() {
		assertEquals(true, FizzBuzzRunner.isBuzz(5));
	}

	@Test
	void isFizzBuzzWhenNumberIsDivisableByFiveAndThreeFalse() {
		assertEquals(false, FizzBuzzRunner.isFizzBuzz(16));
	}

	@Test
	void isFizzWhenNumberIsDivisableByThreeFalse() {
		assertEquals(false, FizzBuzzRunner.isFizz(4));
	}

	@Test
	void isBuzzWhenNumberIsDivisableByFiveFalse() {
		assertEquals(false, FizzBuzzRunner.isBuzz(6));
	}

	@Test
	void isFizzBuzzWhenNumberIsDivisableByFiveAndThreeTrue() {
		assertEquals(true, FizzBuzzRunner.isFizzBuzz(15));
	}

	@Test
	void IsFizzBuzzTrue() {
		assertEquals("FizzBuzz", FizzBuzzRunner.checkNumberAgainstRule(15));
	}

	@Test
	void IsFizzTrue() {
		assertEquals("Fizz", FizzBuzzRunner.checkNumberAgainstRule(3));
	}

	@Test
	void IsBuzzTrue() {
		assertEquals("Buzz", FizzBuzzRunner.checkNumberAgainstRule(5));
	}

	@Test
	void IsNeither() {
		assertEquals("1", FizzBuzzRunner.checkNumberAgainstRule(1));
	}

	@Test
	void isFizzBuzzWhenNumberIsZero() {
		assertEquals("0", FizzBuzzRunner.checkNumberAgainstRule(0));
	}

	// Exception example
	@Test
	public void testException() {
		assertThrows(NumberFormatException.class, () -> {
			// Would be a method call that throws an exception
			Integer.parseInt("IAmNotANumber");
		});
	}
}
