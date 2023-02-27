package com.QuickReview_AllJava;

public class SuperKeyword {

	public static void main(String[] args) {

		Shape s = new Rectangle();
		s.draw();

		Rectangle r = new Rectangle();
		r.draw();
		r.resize();

	}

}

//In this example, the Rectangle class extends the Shape class and overrides its draw() method. 
//The super keyword is used in the draw() method of the Rectangle class to call the draw() method 
//of the superclass (i.e. the Shape class). The resize() method is added in the Rectangle class
//and is not related to the super keyword