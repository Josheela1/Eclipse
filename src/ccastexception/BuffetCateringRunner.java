package com.Xworkz.wings.boot.ccastexception;

public class BuffetCateringRunner {
	public static void main(String[] args) {
		Catering catering=new BuffetCatering("EatFit","Pratik","Bangalore");
		System.out.println("Catering name is: "+catering.cateringName);
		System.out.println("Catering owner name is: "+catering.cateringOwner);
		System.out.println("Catering location is: "+catering.cateringLocation);
		
		
        Object obj=new BuffetCatering();
		if(obj instanceof Catering) {
			Catering catering1=(Catering)obj;
			
			System.out.println(catering1.cateringName);
			System.out.println(catering1.cateringOwner);
			System.out.println(catering1.cateringLocation);
		}
		else {
			System.out.println("Object is not created");
		}
	}

}
