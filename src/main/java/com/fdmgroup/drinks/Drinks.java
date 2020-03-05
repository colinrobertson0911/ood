package com.fdmgroup.drinks;

public class Drinks implements AgeGroup {
	
	public final static String TODDLERS = "Water, Milk";
	public final static String TEENS = "Fizzy, Water, Milk";
	public final static String OLDTEENS = "RedBull, Fizzy, Water, Milk";
	public final static String YOUNGADULT = "Wine, Beer, RedBull, Fizzy, Water, Milk";
	public final static String ADULT = "Cocktails, Wine, Beer, RedBull, Fizzy, Water, Milk";
	public final static String OAP = "Sleeping tablets, Cocktails, Wine, Beer, RedBull, Fizzy, Water, Milk";
	
	

	@Override
	public boolean isDrinkAllowed(int age, String drinkRequested) {

		if (age > 65) {
			if (drinkRequested.equals("Sleeping Tablets")) {
				return true;
			} else {
				return false;
			}
		}
		
		if (age >=25 && age <65) {
			if (drinkRequested.equals("Cocktails") || drinkRequested.equals("Wine") || drinkRequested.equals("Beer") || drinkRequested.equals("RedBull") || drinkRequested.equals("Fizzy") || drinkRequested.equals("Water") || drinkRequested.equals("Milk")) {
				return true;
			}else {
				return false;
			}
			
		}
		if (age >= 18 && age <25) {
			if (drinkRequested.equals("Wine") || drinkRequested.equals("Beer") || drinkRequested.equals("RedBull") || drinkRequested.equals("Fizzy") || drinkRequested.equals("Water") || drinkRequested.equals("Milk")) {
				return true;
			}else {
				return false;
			}
		}
		if (age >=16 && age < 18) {
			if (drinkRequested.equals("RedBull") || drinkRequested.equals("Fizzy") || drinkRequested.equals("Water") || drinkRequested.equals("Milk")) {
				return true;
			}else {
				return false;
			}
		}
		if (age >= 10 && age < 16) {
			if (drinkRequested.equals("Fizzy") || drinkRequested.equals("Water") || drinkRequested.equals("Milk")) {
				return true;
			}else {
				return false;
			}
		}
		else {
			if (drinkRequested.equals("Water") || drinkRequested.equals("Milk")) {
				return true;
			} else {
				return false;
			}
		} 
	
		
	}
	

	
	
}
