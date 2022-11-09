package com.Xworkz.wings.boot.ccastexception;

public class Congress extends PoliticalParty {
	public String presidentName;

	public Congress() {
		super();
	}

	public Congress(String name, double since, String country, String presidentName) {
		super(name, since, country);
		this.presidentName = presidentName;
	}

	public void ShowOff() {
		super.ShowOff();
		System.out.println(presidentName);
	}


}
