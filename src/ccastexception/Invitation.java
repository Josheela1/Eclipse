package com.Xworkz.wings.boot.ccastexception;

public class Invitation {
	public String Name;
	public String type;
	public int noOfCards;
	public Invitation() {
		System.out.println("Created default constructor of Invitation class");
	}
	public Invitation(String Name,String type,int noOfCards) {
		super();  //by default
		this.Name=Name;
		this.type=type;
		this.noOfCards=noOfCards;
		System.out.println("Created parameterised constuctor of Invitation class");
	}
}
