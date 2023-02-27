package com.QuickReview_AllJava;

import java.util.HashSet;
import java.util.Set;

public class HashSets {

	public static void main(String[] args) {
		// create set
		Set<String> set = new HashSet<>();

		// populate set
		set.add("Soccer");
		set.add("Basketball");
		set.add("Baseball");
		set.add("Tennis");
		set.add("Soccer"); // this will not be added as sets do not allow duplicates

		// print set
		System.out.println("Set: " + set);
	}
}

// This example demonstrates the use of the Set interface in Java, implemented
// here using the HashSet class. In this example, a set is created and populated
// with a list of different sports. The set does not allow duplicates, so if an
// element is added that is already in the set, it will not be added again. The
// set is then printed to the console.
