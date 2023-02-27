package com.class04;

public class NestedIfLastExample {

	public static void main(String[] args) {
		
		
		int age = 11;
		int weight = 100;
		
		if (age>=18) {
			System.out.println("Lets see if you can donate due to your weight");
			if(weight>110) {
				System.out.println("Awesome! you can donate");
			}else {
				System.out.println("I'm sorry, due to your weight you cannot donate");
			}
			
		}else {
			System.out.println("You are not eligible to donate");
		}

	}

}
