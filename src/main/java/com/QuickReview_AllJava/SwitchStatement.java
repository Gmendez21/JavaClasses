package com.QuickReview_AllJava;

public class SwitchStatement {

	public static void main(String[] args) {

		// in Java, you can use a switch statement to perform different actions based on
		// different values of a variable. A switch statement is a more efficient
		// alternative to multiple if-else if statements, especially when you have many
		// possible values for a single variable.

        //Here's an example of a switch statement in Java:
		
		 int day = 4;
		    switch (day) {
		      case 1:
		        System.out.println("Monday");
		        break;
		      case 2:
		        System.out.println("Tuesday");
		        break;
		      case 3:
		        System.out.println("Wednesday");
		        break;
		      case 4:
		        System.out.println("Thursday");
		        break;
		      case 5:
		        System.out.println("Friday");
		        break;
		      case 6:
		        System.out.println("Saturday");
		        break;
		      case 7:
		        System.out.println("Sunday");
		        break;
		      default:
		        System.out.println("Invalid day");
		        break;

	}

}}
