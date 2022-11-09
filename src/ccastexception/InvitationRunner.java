package com.Xworkz.wings.boot.ccastexception;

public class InvitationRunner {
	public static void main(String[] args) {
		Invitation invitation=new ChildInvitation("Wedding Invitation","Card",123);
		System.out.println("Invitation name is: "+invitation.Name);
		System.out.println(" Card type is: "+invitation.type);
		System.out.println("total no of cards are: "+invitation.noOfCards);
		
		Object obj=new ChildInvitation();
		if(obj instanceof DJ) {
			Invitation invitation1=(Invitation)obj;
			System.out.println(invitation1.Name);
			System.out.println(invitation1.type);
			System.out.println(invitation1.noOfCards);
			
		}
		else {
			System.out.println("Object is not created");
		}
		
	}


}
