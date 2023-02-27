package com.QuickReview_AllJava;

public class Constructor {
	int x;
	int y;

	public Constructor() {
		x = 10;
		y = 20;
	}

	public Constructor(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void printValues() {
		System.out.println("x: " + x + " y: " + y);
	}
}

class Main {
	public static void main(String[] args) {
		Constructor example1 = new Constructor();
		example1.printValues();

		Constructor example2 = new Constructor(30, 40);
		example2.printValues();
	}
}

// In the above code, the ConstructorExample class has two constructors. The
// first constructor is the default constructor and it sets x to 10 and y to 20.
// The second constructor takes two parameters, x and y, and sets the instance
// fields to the values passed as arguments.

//In the Main class, we create two instances of the ConstructorExample class, 
//one using the default constructor and another using the constructor with parameters.
//The printValues method is called on each instance to print the values of x and y. 