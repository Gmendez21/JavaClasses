package com.QuickReview_AllJava;

public class Loops {

	public static void main(String[] args) {

		// In Java, you can use loops to repeat a block of code multiple times. Java
		// provides two main types of loops: for loops and while loops.

		// Here's an example of a for loop in Java:

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

		}

		// Here's an example of a while loop in Java:

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;

		}

		// You can also use the do-while loop, which is similar to a while loop but with
		// one important difference: the loop will always be executed at least once,
		// even if the condition is false from the start.

        //Here's an example of a do-while loop in Java:
		
		  int x = 1;
		    do {
		      System.out.println(x);
		      x++;
		    } while (x <= 10);
		
		
	}

}
