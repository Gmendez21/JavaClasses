package com.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		/*
		 * variable day
		 * 
		 * if day is Tuesday or Wednesday --> Manual class
		 * if day is Monday or Friday -- No class
		 * if day is Saturday or Sunday --> Java class
		 * if day is Thursday --> Review class
		 * 
		 */
		
		String day="Saturday";
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("Today I have No class");
		}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today I have a Manual class");
		}else if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today I have Java class");
		}else if(day.equals("Thursday")) {
			System.out.println("Today is a Review class");
		}

	}

}
