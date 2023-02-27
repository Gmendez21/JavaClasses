package com.QuickReview_AllJava;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {

		// create map
		Map<String, Integer> map = new HashMap<>();

		// populate map
		map.put("Soccer", 11);
		map.put("Basketball", 5);
		map.put("Baseball", 9);
		map.put("Tennis", 2);

		// retrieve and print values
		System.out.println("Soccer players: " + map.get("Soccer"));
		System.out.println("Basketball players: " + map.get("Basketball"));
		System.out.println("Baseball players: " + map.get("Baseball"));
		System.out.println("Tennis players: " + map.get("Tennis"));
	}
}

// This example demonstrates the use of the Map interface in Java, implemented
// here using the HashMap class. In this example, a map is created and populated
// with key-value pairs representing different sports and the number of players
// on a team. The values can be retrieved from the map using the get method,
// providing the key as an argument. The retrieved values are then printed to
// the console.
