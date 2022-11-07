package com.Xworkz.boot;

public class FaceWashRunner {
	public static void main(String[] args) {
		FaceWashModify modify=new FaceWashModify();
		
		FaceWash faceWash=new FaceWash();
		modify.useFaceWash(faceWash);
		System.out.println("after modifying in runner:"+faceWash.getBrand());
		System.out.println(modify.name);
		System.out.println(modify.faceWash);
	}


}
