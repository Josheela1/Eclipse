package com.Xworkz.boot;

public class LipstickModify {
	public String name="Josheela";
	public Lipstick lipstick;
	public void useLipstick(Lipstick lipstick) {
		System.out.println(lipstick.brandAmbassador);
		System.out.println(lipstick.typeOfLipstick);
		System.out.println(lipstick.price);
		System.out.println(lipstick.name);
		System.out.println(lipstick.brandOwner);
		System.out.println(lipstick.manufacturedInCountry);
		System.out.println(lipstick.manufacturingDate);
		System.out.println(lipstick.lastsUpto);
		System.out.println(lipstick.expiryDate);
		System.out.println(lipstick.getBrand());
		lipstick.setBrand("Maybelline");
		System.out.println("after modifying:+"+lipstick.getBrand());
	}


}
