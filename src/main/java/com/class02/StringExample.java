package com.class02;

public class StringExample {

	public static void main(String[] args) {
		
		String name;
		name="German";
		
		String greeting="Good Morning!";
		String phoneNumber = "123-456-7890";
		
		String stringNumber="12";
		
		String wordWithSpace=" ";
		
		String letter="A";
		char oneLetter='A';
		
		// Hello, my name is German
		System.out.println("Hello, my name is "+name);
		
		//How are you Chris?
		
		System.out.println("How are you "+ name);
		
		int age=25;
		//I ama 25
		
		System.out.println("I am "+age);
		
		char grade= 'A';
		//Chris is an A student
		
		System.out.println(name+" is an "+grade+" student");
		
		/*
		 * String concatenation operator + can be used when
		 * we attach String to another String
		 * we attach String to a number
		 * we attach String to any character or boolean
		 */

		String car="Tesla";
		int year=2023;
		
		//I drive 2022 Tesla
		
		System.out.println("I drive "+year+" "+car);
		
		String computer="macbook";
		int memory=250;
		
		//German has a macbook with 250 GB memory
		System.out.println(name+" has a "+computer+ " with "+memory+" GB memory");
		
		String combinedValue = year+ " " + car; //2023 Tesla
		System.out.println(combinedValue);
		
		byte day=7;
		String month="February ";
		
		String date=month+day;
		System.out.println(date);
		
		
		
	}

}
