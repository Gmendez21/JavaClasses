package com.QuickReview_AllJava;

public class ThisExample {
	int x;
	int y;

	public ThisExample(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setValues(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void printValues() {
		System.out.println("x: " + x + " y: " + y);
	}
}

class Main3 {
	public static void main(String[] args) {
		ThisExample example = new ThisExample(10, 20);
		example.printValues();
		example.setValues(30, 40);
		example.printValues();
	}
}

// In the above code, the ThisExample class has a constructor which takes two
// parameters, x and y, and sets the instance fields to the values passed as
// arguments. The setValues method sets the values of x and y for the current
// instance using the this keyword.

//In the Main class, we create an instance of the ThisExample class using the constructor with parameters.
//The printValues method is called to print the values of x and y, and then the setValues method
//is called to set the values of x and y to different values. Finally, the printValues method
//is called again to print the values of x and y.