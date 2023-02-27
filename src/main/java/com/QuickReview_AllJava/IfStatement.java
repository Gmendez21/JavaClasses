package com.QuickReview_AllJava;

public class IfStatement {

	public static void main(String[] args) {

		// In Java, you can use the if statement to make decisions in your code based on
		// whether a certain condition is true or false. Here's an example:

		int score = 75;

		if (score >= 60) {
			System.out.println("You passed the exam.");
		} else {
			System.out.println("You failed the exam.");

		}

		// You can also chain multiple conditions together using the else if clause.
		// Here's an example:

		 int score1 = 75;

		    if (score1 >= 90) {
		      System.out.println("You got an A.");
		    } else if (score1 >= 80) {
		      System.out.println("You got a B.");
		    } else if (score1 >= 70) {
		      System.out.println("You got a C.");
		    } else if (score1 >= 60) {
		      System.out.println("You got a D.");
		    } else {
		      System.out.println("You got an F.");
		    }
		  }
		
	}

