package com.class05;

import java.util.Scanner;

public class LogicalOperatorsExample {

	public static void main(String[] args) {
		
		/*ask user to enter age
		 * based on the age we will define
		 * if age is from 1 to 3--> you are baby
		 * if age is from 3 to 5--> you are older baby
		 * if age is from 5 to 12--> you are kid
		 * if age is from 13-19--> you are teenager
		 * if age is above 20 --> you are an adult
		 */
		
		Scanner input;
		String name;
		int age;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your name");
		name=input.next();
		
		System.out.println("Please enter your age");
		age=input.nextInt();
		
		if(age>=1 && age <=3) {
			System.out.println("You are a baby");
		}else if(age>=4 && age <=5) {
			System.out.println("You are an older baby");
		}else if(age>=6 && age<=12) {
			System.out.println("You are a kid");
		}else if(age>=13 && age<=19) {
			System.out.println("You are a teenager");
	    }else if(age>=20) {
			System.out.println("You are an adult");
        }else if(age<=0) {
        	System.out.println("You werent born yet");
        }
		}}
