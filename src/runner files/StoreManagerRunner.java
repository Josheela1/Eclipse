package com.Xworkz.boot;

public class StoreManagerRunner {
	public static void main(String[] args) {
		StoreManager manager=new StoreManager();
		
		Perfume perfume=new Perfume();
		manager.usePerfume(perfume);
		System.out.println("after modifying in runner:"+perfume.getBrand());
		System.out.println(manager.name);
		System.out.println(manager.perfume);
	}
}
