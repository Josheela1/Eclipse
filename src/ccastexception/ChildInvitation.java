package com.Xworkz.wings.boot.ccastexception;

public class ChildInvitation extends Invitation{
	public ChildInvitation() {
		System.out.println("Created default constructor of ChildInvitation class");
	}

	public ChildInvitation(String Name, String type, int noOfCards) {
		super(Name, type, noOfCards);
		
	}
	

	

}
