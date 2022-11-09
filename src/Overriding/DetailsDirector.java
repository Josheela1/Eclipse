package com.Xworkz.wings.boot.ccastexception.overriding;

public class DetailsDirector extends Directors {
	public String name;
	public String location;

	public DetailsDirector() {
		super();
	}

	public DetailsDirector(int noOfMovies, double eraStarted, String firstMovie, String name, String location) {
		super(noOfMovies, eraStarted, firstMovie);
		this.name = name;
		this.location = location;
	}

	public void showwOff() {
		super.showwOff();
		System.out.println(name);
		System.out.println(location);
	}


}

