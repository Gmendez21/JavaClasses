package com.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {

		int num = 1;

		while (num <= 5) {//while loop is used more in programming compared to do while !!!
			System.out.println("Hello");
			num++;
		}

		System.out.println("------------ Do While --------------");

		int num1 = 6;

		do {
			System.out.println(num1);
			num1++;
		} while (num1 <= 5);
		
		/*
		 * While = first check then execute
		 * Do = first execute then check
		 */
	}
}
