package com.Xworkz.boot;

public class FaceWashModify {
	public String name="Face Wash it is...!!11";
	public FaceWash faceWash;
	public void useFaceWash(FaceWash faceWash) {
		System.out.println(faceWash.brandAmbassador);
		System.out.println(faceWash.typeOfFaceWash);
		System.out.println(faceWash.price);
		System.out.println(faceWash.name);
		System.out.println(faceWash.brandOwner);
		System.out.println(faceWash.manufacturedInCountry);
		System.out.println(faceWash.manufacturingDate);
		System.out.println(faceWash.lastsUpto);
		System.out.println(faceWash.expiryDate);
		System.out.println(faceWash.getBrand());
		faceWash.setBrand("Biotique");
		System.out.println("after modifying:+"+faceWash.getBrand());
	}

}



