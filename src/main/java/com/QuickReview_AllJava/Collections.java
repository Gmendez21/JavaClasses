package com.QuickReview_AllJava;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {

		List<String> sportsBrands = new ArrayList<>();

		// Adding elements to the ArrayList
		sportsBrands.add("Nike");
		sportsBrands.add("Adidas");
		sportsBrands.add("Puma");
		sportsBrands.add("Under Armour");

		System.out.println("Sports brands: " + sportsBrands);

		// Removing an element from the ArrayList
		sportsBrands.remove(2);

		System.out.println("Sports brands after removal: " + sportsBrands);

		// Getting an element at a specific index
		System.out.println("Brand at index 1: " + sportsBrands.get(1));

		// Checking if the ArrayList contains an element
		System.out.println("Contains Nike? " + sportsBrands.contains("Nike"));
	}
}

//This code demonstrates the use of the ArrayList collection in Java. A List interface is used to declare the sportsBrands variable.
//An ArrayList is then used to instantiate the sportsBrands object.

//We add some elements to the ArrayList using the add method. Then, we print out the contents of the ArrayList using the println method.

//Next, we remove an element from the ArrayList using the remove method and an index.
//We then print out the contents of the ArrayList again to show that the element has been removed.

//Finally, we get an element at a specific index using the get method and check if the ArrayList
//contains a specific element using the contains method.
