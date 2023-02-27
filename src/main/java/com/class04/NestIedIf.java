package com.class04;

public class NestIedIf {

	public static void main(String[] args) {
		
		
		System.out.println("----------Example 1-----------");
		
		boolean morning=false;
		
		boolean classToday=true;
		
		//Is it morning? --> Good morning 
		// if there is a class: yes --> hello classmates
		// otherwise --> hello my family
		
		if (morning) {
			System.out.println("Let me check check if I have class today");
			
			if(classToday) {
				System.out.println("Good morning my classmates");
			}else {
				System.out.println("Good morning my family");
			}
		}else {
			System.out.println("It is night time");
		}
		
		System.out.println("----------Example 2-----------");
		
		boolean anyAllergy=true;
		boolean pollenAllergy=true;
		
		if(anyAllergy) {
			
			System.out.println("Let's check which allergies you have");
			
			if(pollenAllergy) {
				
				System.out.println("Do not get close to trees");	
			}else {
				System.out.println("Ok I know you dont have a pollen allergy");
			}
		}else {
			System.out.println("You are lucky that you do not have any allergies");
		}
		
	

	}

}
