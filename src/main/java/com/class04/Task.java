package com.class04;

public class Task {
	
	public static void main(String[] args) {
		
		boolean hasDiploma = true;
		boolean hasDegreeProgram = false;
		double gpaScore = 3;
		
		if(hasDiploma) {
			System.out.println("Congratulations on the diploma!!! ");
			
			if(hasDegreeProgram) {
				System.out.println("You should check gpa score");
			}
			
			if (gpaScore>=3.5) {
				System.out.println("You are eligible for a scholarship");
				
			}else {
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("I suggest you get a degree");
		}
		
	}

}
