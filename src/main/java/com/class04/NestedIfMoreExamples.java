package com.class04;

public class NestedIfMoreExamples {

	public static void main(String[] args) {
		
		boolean isFriday=false;
		int day =13;
		
		if(isFriday) {
			System.out.println("It is a movie day!!!");
			
			if(day==13) {
				System.out.println("I will watch a scary movie");
				
			}else {
				System.out.println("I will watch any available movie");
			}
		}else {
			System.out.println("I will stay at home and study Java");
		}
		
		System.out.println("----------- Example 2 -----------");
		
		boolean completed = true;
		int score =90;
		
		if(completed) {
			
			if (score>90) {
				System.out.println("Great job");
			}else if(score>80) {
				System.out.println("Good job");
			}else if(score>70) {
				System.out.println("Good, but let's try to do better");
			}else {
				System.out.println("Good for trying, but study more!!!");
			}
			
		}else {
			System.out.println("Please make sure to complete all assignments on time");
		}

	}

}
