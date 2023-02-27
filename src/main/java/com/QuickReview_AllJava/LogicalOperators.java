package com.QuickReview_AllJava;

public class LogicalOperators {

	public static void main(String[] args) {

		/*
		 * In Java, you can use logical operators to combine multiple conditions in your
		 * if statements. Java supports the following logical operators:
		 * 
		 * && (and) - Returns true if both conditions are true 
		 * || (or) - Returns true if at least one of the conditions is true
		 * ! (not) - Returns true if the condition is false and 'false' if the
		 * condition is true
		 *  
		 *  Here's an example using the && operator:
		 */

		 int age = 25;
		    int income = 50000;

		    if (age >= 18 && income >= 40000) {
		      System.out.println("You are eligible for a loan.");
		    } else {
		      System.out.println("You are not eligible for a loan.");
	}
		    
		// Here's an example using the || operator:
		    
		    int age2 = 25;
		    int income2 = 30000;

		    if (age2 >= 18 || income2 >= 40000) {
		      System.out.println("You are eligible for a loan.");
		    } else {
		      System.out.println("You are not eligible for a loan.");
		    }
		    
		    //Here's an example using the ! operator:
		    
		    boolean isEligible = false;

		    if (!isEligible) {
		      System.out.println("You are not eligible for a loan.");
		    } else {
		      System.out.println("You are eligible for a loan."); 
		    
		    
		  }
		   

}}
	
