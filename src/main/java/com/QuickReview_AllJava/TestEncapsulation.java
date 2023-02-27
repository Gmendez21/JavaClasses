package com.QuickReview_AllJava;

public class TestEncapsulation {

	public static void main(String[] args) {
		 SoccerPlayer cristianoRonaldo = new SoccerPlayer("Cristiano Ronaldo", "Forward", 7, 20);
		    System.out.println("Name: " + cristianoRonaldo.getName());
		    System.out.println("Position: " + cristianoRonaldo.getPosition());
		    System.out.println("Jersey Number: " + cristianoRonaldo.getJerseyNumber());
		    System.out.println("Goals Scored: " + cristianoRonaldo.getGoalsScored());

		    SoccerPlayer lionelMessi = new SoccerPlayer("Lionel Messi", "Forward", 10, 25);
		    System.out.println("Name: " + lionelMessi.getName());
		    System.out.println("Position: " + lionelMessi.getPosition());
		    System.out.println("Jersey Number: " + lionelMessi.getJerseyNumber());
		    System.out.println("Goals Scored: " + lionelMessi.getGoalsScored());
		  }
		

	}

//In this example, the SoccerPlayer class has instance variables name, position, jerseyNumber, and goalsScored.
//All these instance variables are declared as private and can only be accessed using getter and setter methods.

//We create objects of the SoccerPlayer class and assign them to references of the SoccerPlayer type.
//We then call the getter methods on these objects to access their instance variables.

//This example demonstrates encapsulation by restricting direct access to the instance variables of the 
//SoccerPlayer class. By making the instance variables private and providing public getter and setter methods,
//we are encapsulating the data of the soccer player and protecting it from any unauthorized changes or manipulations.
