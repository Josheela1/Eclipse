package com.Xworkz.boot;

public class PantRunner {
	public static void main(String[] args) {
		PantModify modify=new PantModify();
		
		Pant pant=new Pant();
		modify.usePant(pant);
		System.out.println("after modifying in runner:"+pant.getBrand());
		System.out.println(modify.name);
		System.out.println(modify.pant);
	}

}
