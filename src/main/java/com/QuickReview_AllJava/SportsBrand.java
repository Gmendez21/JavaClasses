package com.QuickReview_AllJava;

public class SportsBrand implements Sponsorable {
	 private String name;
	  private double sponsorship;

	  public SportsBrand(String name, double sponsorship) {
	    this.name = name;
	    this.sponsorship = sponsorship;
	  }

	  public void increaseSponsorship(double amount) {
	    this.sponsorship += amount;
	  }

	  public double getSponsorship() {
	    return sponsorship;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }
	}
