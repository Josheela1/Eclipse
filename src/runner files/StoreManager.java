package com.Xworkz.boot;

public class StoreManager {
	public String name="Josheela Joshi";
	public Perfume perfume;
	public void usePerfume(Perfume perfume) {
		System.out.println(perfume.ambassador);
		System.out.println(perfume.fragrance);
		System.out.println(perfume.price);
		System.out.println(perfume.name);
		System.out.println(perfume.brandOwner);
		System.out.println(perfume.manufacturedInCountry);
		System.out.println(perfume.manufacturingDate);
		System.out.println(perfume.expiryDate);
		System.out.println(perfume.getBrand());
		perfume.setBrand("Fogg");
		System.out.println("after modifying:+"+perfume.getBrand());
	}

}
