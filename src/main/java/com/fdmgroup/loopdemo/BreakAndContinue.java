package com.fdmgroup.loopdemo;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		breakDemo();
		System.out.println("----------");
		continueDemo();
		
	}

	private static void breakDemo() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i == 3) {
				break;
			}
			System.out.println("Keep  looping");
		}
		System.out.println("Outside the loop");
	}
	
	private static void continueDemo() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i == 3) {
				continue;
			}
			System.out.println("Keep  looping");
		}
		System.out.println("Outside the loop");
	}

}
