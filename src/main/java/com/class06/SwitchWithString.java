package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*we need to identify favorite food
		 * 
		 * we need to capture country from a user based on the country identify favorite food
		 * 
		 */
		
		Scanner input;
		String country, food;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your country"); //be careful, it's case sensitive when it comes to String
		
		country=input.nextLine();
		
		switch(country) {
		
		case "USA":
			food="burger";
			break;
		case "Afghanistan":
			food="Kebab";
			break;
		case "Vietnam":
			food="Pho";
			break;
		case "Poland":
			food="Pierogi";
			break;
		case "Kazakstan":
			food="horse";
			break;
		case "Belarus":
			food="draniki";
			break;
		case "Tajikistan":
			food="plov";
			break;
		case "Mexico":
			food="tacos";
			break;
		default:
			food="unknown";
		}

		System.out.println("My favorite food: "+food);
	}

}
