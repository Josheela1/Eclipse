package com.Xworkz.boot;

public class EyelinerRunner {
	public static void main(String[] args) {
		EyelinerModify modify=new EyelinerModify();
		
		Eyeliner eyeliner=new Eyeliner();
		modify.useEyeliner(eyeliner);
		System.out.println("after modifying in runner:"+eyeliner.getBrand());
		System.out.println(modify.name);
		System.out.println(modify.eyeliner);
	}


}
