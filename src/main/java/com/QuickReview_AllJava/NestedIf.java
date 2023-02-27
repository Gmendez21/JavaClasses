package com.QuickReview_AllJava;

public class NestedIf {

	public static void main(String[] args) {
		
		// In Java, you can nest one if statement inside another if statement to make
		// more complex decisions. Here's an example:
		
		  int age = 25;
		    int income = 50000;

		    if (age >= 18) {
		      if (income >= 40000) {
		        System.out.println("You are eligible for a loan.");
		      } else {
		        System.out.println("You are not eligible for a loan.");
		      }
		    } else {
		      System.out.println("You are not eligible for a loan.");
		    }
		  }
		
	}


