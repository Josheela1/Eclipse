package com.Xworkz.wings.boot.ccastexception;

public class Ravi extends Criminal {
	public boolean jail;

	public Ravi(String name, int noOfCrimes, boolean jail) {
		super(name, noOfCrimes);
		this.jail = jail;
	}

	public void display() {
		super.display();
		System.out.println(this.jail);
	}

}
