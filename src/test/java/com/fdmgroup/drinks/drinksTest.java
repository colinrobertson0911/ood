package com.fdmgroup.drinks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class drinksTest {
	
	private static Drinks drinks = new Drinks();
	
	@BeforeAll
	public static void setup() {
		drinks = new Drinks();
	}
	
	@Test
	void testWhenAgeIsLessThan10_AllowedWater () {
		assertEquals(true, drinks.isDrinkAllowed(9, "Water"));
	}
	@Test
	void testWhenKAgeIsLessThan10_AllowedMilk () {
		assertEquals(true, drinks.isDrinkAllowed(9, "Milk"));
	}
	@Test
	void testWhenAgeIsLessThan10_AllowedFizzy () {
		assertEquals(false, drinks.isDrinkAllowed(9, "Fizzy"));
	}
	@Test
	void testWhenKAgeIsLessThen16_AndGreaterThan10_AllowedFizzy () {
		assertEquals(true, drinks.isDrinkAllowed(15, "Fizzy"));
	}
	@Test
	void testWhenAgeIsLessThen16_AndGreaterThan10_AllowedBeer () {
		assertEquals(false, drinks.isDrinkAllowed(15, "Beer"));
	}
	@Test
	void testWhenAgeIsLessThen18_andGreaterThan16_AllowedRedBull () {
		assertEquals(true, drinks.isDrinkAllowed(17, "RedBull"));
	}
	@Test
	void testWhenAgeIsLessThen18_andGreaterThan16_AllowedCocktails () {
		assertEquals(false, drinks.isDrinkAllowed(17, "Cocktails"));
	}
	@Test
	void testWhenAgeIsLessThen25_AndGreaterThan18_AllowedWine () {
		assertEquals(true, drinks.isDrinkAllowed(20, "Wine"));
	}
	@Test
	void testWhenAgeIsLessThen25_AndGreaterThan18_AllowedBeer () {
		assertEquals(true, drinks.isDrinkAllowed(20, "Beer"));
	}
	@Test
	void testWhenAgeIsLessThen25_AndGreaterThan18_AllowedCocktails () {
		assertEquals(false, drinks.isDrinkAllowed(20, "Cocktails"));
	}
	@Test
	void testWhenAgeIsLessThen65_AndGreaterThan25_AllowedCocktails () {
		assertEquals(true, drinks.isDrinkAllowed(40, "Cocktails"));
	}
	@Test
	void testWhenAgeIsLessThen65_AndGreaterThan25_AllowedSleepingTablets () {
		assertEquals(false, drinks.isDrinkAllowed(40, "Sleeping Tablets"));
	}
	@Test
	void testWhenAgeIsGreaterThan65_AllowedSleepingTablets () {
		assertEquals(true, drinks.isDrinkAllowed(70, "Sleeping Tablets"));
	}
	@Test
	void testWhenAgeIsGreaterThan65_AllowedCocktails () {
		assertEquals(false, drinks.isDrinkAllowed(70, "Cocktails"));
	}
}
