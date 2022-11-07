package com.Xworkz.boot;

public class PantModify {
	public String name="Josheela";
	public Pant pant;
	public void usePant(Pant pant) {
		System.out.println(pant.ambassador);
		System.out.println(pant.typeOfFabric);
		System.out.println(pant.price);
		System.out.println(pant.name);
		System.out.println(pant.brandOwner);
		System.out.println(pant.manufacturedInCountry);
		System.out.println(pant.manufacturingDate);
		System.out.println(pant.lastsUpto);
		System.out.println(pant.getBrand());
		pant.setBrand("H&M");
		System.out.println("after modifying:+"+pant.getBrand());
	}

}
