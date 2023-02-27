package com.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
	
		//1st way to create a variable:
		
		int b=200; //created a variable and assigned the value
					 //declared a variable and initialized it 
		
		//2nd way is 2 steps: 
		
		int sum; //declaration happens ONLY ONCE
		sum=20; //initialized the variable
		
		sum=30; //reassigned the value
		
		/*
		 * int x;
		 * int y;
		 * int z;
		 */
		
		int x, y, z;
		
		x=10;
		y=20;
		//z=30.9; ERROR because needs to be integer since only integers above were assigned^
		
		int num=33;
		//we are using value of different variable to initialize the value of new variable
		int num2=num; //33
		System.out.println(num2);
	}

}
