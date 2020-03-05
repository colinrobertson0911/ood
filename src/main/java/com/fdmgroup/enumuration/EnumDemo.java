package com.fdmgroup.enumuration;

public class EnumDemo {

	public static void main(String[] args) {

//		for (TrafficLightStatus colour : TrafficLightStatus.values()) {
//			System.out.println("Traffic light colour can be: " + colour);
//		}
//		
//		TrafficLightStatus trafficLightStatus = TrafficLightStatus.GREEN;
//		
//		System.out.println("Traffic light is currently " + trafficLightStatus);
		
		DaysOfTheWeek monday = DaysOfTheWeek.MONDAY;
		
		System.out.println(monday);
		System.out.println(monday.getShortName());
		System.out.println(monday.getDayNumber());
		
		DaysOfTheWeek blueMonday = DaysOfTheWeek.MONDAY;
		blueMonday.setShortName("Blue Monday");
		
		System.out.println(blueMonday.getShortName());
		System.out.println(monday.getShortName());
		

	}

}
