package com.Xworkz.boot;

public class EyelinerModify {
	public String name="Face Wash it is...!!11";
	public Eyeliner eyeliner;
	public void useEyeliner(Eyeliner eyeliner) {
		System.out.println(eyeliner.brandAmbassador);
		System.out.println(eyeliner.typeOfEyeliner);
		System.out.println(eyeliner.price);
		System.out.println(eyeliner.name);
		System.out.println(eyeliner.brandOwner);
		System.out.println(eyeliner.manufacturedInCountry);
		System.out.println(eyeliner.manufacturingDate);
		System.out.println(eyeliner.lastsUpto);
		System.out.println(eyeliner.expiryDate);
		System.out.println(eyeliner.getBrand());
		eyeliner.setBrand("Lakme");
		System.out.println("after modifying:+"+eyeliner.getBrand());
	}

}
