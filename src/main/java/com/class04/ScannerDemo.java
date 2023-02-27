package com.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		int i=10;
		String str="Hello";
		
		Scanner scan = new Scanner(System.in);
		String text=scan.nextLine();//scan.nextLine(); --> capture your input from console
                                    //once you enter text you must hit ENTER
		
		System.out.println("Text that I entered is - " +text);
		
		int age=scan.nextInt();
		
		System.out.println("My age is "+age);
		
		//5. 42
	} 

}
