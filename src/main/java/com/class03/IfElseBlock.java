package com.class03;

public class IfElseBlock {

	public static void main(String[] args) {

		System.out.println("Start");

		double expectedHours = 24;

		double actualHours = 10;

		if (actualHours >= expectedHours) {

			System.out.println("You will succeed");
		} else {

			System.out.println("You will have a hard time. Study more!");
		}

		boolean snow = false;

		if (snow) {
			System.out.println("I will play with snow");
		} else {
			System.out.println("I will not play with snow");
		}
		
		boolean summer = true;

		if (summer) {
			System.out.println("I will go to Florida");
		} else {
			System.out.println("I will not go to Florida");
		}

		System.out.println("End");
		
	}

}
