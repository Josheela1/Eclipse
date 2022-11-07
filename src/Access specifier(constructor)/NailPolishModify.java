package com.Xworkz.boot;

public class NailPolishModify {
	public String name="Nail Polish";
	public NailPolish nailPolish;
	public void useNailPolish(NailPolish nailPolish) {
		System.out.println(nailPolish.brandAmbassador);
		System.out.println(nailPolish.typeOfNailPolish);
		System.out.println(nailPolish.price);
		System.out.println(nailPolish.name);
		System.out.println(nailPolish.brandOwner);
		System.out.println(nailPolish.manufacturedInCountry);
		System.out.println(nailPolish.manufacturingDate);
		System.out.println(nailPolish.lastsUpto);
		System.out.println(nailPolish.expiryDate);
		System.out.println(nailPolish.getBrand());
		nailPolish.setBrand("Sally Hansen");
		System.out.println("after modifying:+"+nailPolish.getBrand());
	}

}
