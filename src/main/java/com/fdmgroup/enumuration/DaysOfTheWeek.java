package com.fdmgroup.enumuration;

public enum DaysOfTheWeek {

	MONDAY("Mon", 1), TUESDAY("Tue", 2), WEDNESDAY("Wed", 3), THURSDAY("Thur", 4), FRIDAY("Fri", 5), SATURDAY("Sat", 6),
	SUNDAY("Sun", 7);

	private String shortName;
	private int dayNumber;

	private DaysOfTheWeek(String shortName, int dayNumber) {
		this.shortName = shortName;
		this.dayNumber = dayNumber;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}

}
