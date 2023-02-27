package com.QuickReview_AllJava;

public class SoccerPlayer {
	
	 private String name;
	  private String position;
	  private int jerseyNumber;
	  private int goalsScored;

	  public SoccerPlayer(String name, String position, int jerseyNumber, int goalsScored) {
	    this.name = name;
	    this.position = position;
	    this.jerseyNumber = jerseyNumber;
	    this.goalsScored = goalsScored;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getPosition() {
	    return position;
	  }

	  public void setPosition(String position) {
	    this.position = position;
	  }

	  public int getJerseyNumber() {
	    return jerseyNumber;
	  }

	  public void setJerseyNumber(int jerseyNumber) {
	    this.jerseyNumber = jerseyNumber;
	  }

	  public int getGoalsScored() {
	    return goalsScored;
	  }

	  public void setGoalsScored(int goalsScored) {
	    this.goalsScored = goalsScored;
	  }
	}