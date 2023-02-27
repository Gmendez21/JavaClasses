package com.class02;

public class NamingConvention {

	public static void main(String[] args) {
		
		//keywords - special words for java memory: class, public, static, final, for
		
		//identifiers - name that we give to classes, variable, and methods
		
		/*
		 * RULE !!!! 
		 * DO NOT USE KEYWORD AS IDENTIFIERS
		 * Identifiers CANNOT contain space
		 * Identifiers CANNOT start with numbers
		 * Identifiers CANNOT have special characters accept _ and $ 
		 */

		//int final =10; INVALID IDENTIFIER
		
		//NamingConvention:
			// 1. use camelCasing 
			// 2. classes starts with Upper cases and will follow camel casing
			// 3. variables start with lower case and will follow camel casing
			// 4. packages we use lower case and use name as reverse way of url
		
			int Number=12; //not preferred
			int number=12; //preferred
			
			int numberOne=12;
			int numberTwo=13;
			
			boolean isSnow=true;
			boolean snow=true;
			
			double applePrice=12.99;
			double mangoPrice=13.89;
		
		
		
	}

}
