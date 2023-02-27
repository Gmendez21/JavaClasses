package com.class03;

public class IfCondition {

	public static void main(String[] args) {

		System.out.println("Beginning of my program");

		int a = 10;
		int b = 7;

		if (a < b) {

			System.out.println("a is larger than b");

		} else {

			System.out.println("a is smaller than b");
		}
		int temp = 30;

		if (temp > 30) {// if true
			System.out.println("I am going for a walk");
		} else {// otherwise -> false
			System.out.println("I am staying inside");
		}

		System.out.println("End of the program");

	}

}
