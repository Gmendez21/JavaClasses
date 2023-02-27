package com.QuickReview_AllJava;

public class BreakAndContinue {

	public static void main(String[] args) {

		// In Java, you can use the break and continue statements within loops to
		// control the flow of execution.

		// The break statement is used to exit a loop prematurely. When the break
		// statement is encountered within a loop, the loop is immediately terminated
		// and the program continues with the next statement after the loop.

		// Here's an example of using the break statement in a for loop in Java:

		for (int i = 1; i <= 10; i++) {
			if (i == 3) {
			
				break;
				
			}
			System.out.println("This is :"+ i);
		}

		// The continue statement is used to skip the current iteration of a loop and
		// continue with the next iteration. When the continue statement is encountered
		// within a loop, the current iteration is immediately terminated and the next
		// iteration begins.

        //Here's an example of using the continue statement in a for loop in Java:
		
		for (int i = 1; i <= 10; i++) {
		      if (i % 2 == 0) {
		        continue;
		      }
		      System.out.println("The second one is:"+i);
	}

}}
