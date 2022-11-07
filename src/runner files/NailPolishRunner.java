package com.Xworkz.boot;

public class NailPolishRunner {
	public static void main(String[] args) {
		NailPolishModify modify=new NailPolishModify();
		
		NailPolish nailPolish=new NailPolish();
		modify.useNailPolish(nailPolish);
		System.out.println("after modifying in runner:"+nailPolish.getBrand());
		System.out.println(modify.name);
		System.out.println(modify.nailPolish);
	}


}
