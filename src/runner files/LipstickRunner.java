package com.Xworkz.boot;

public class LipstickRunner {
	public static void main(String[] args) {
		LipstickModify modify=new LipstickModify();
		
		Lipstick lipstick=new Lipstick();
		modify.useLipstick(lipstick);
		System.out.println("after modifying in runner:"+lipstick.getBrand());
		System.out.println(modify.name);
		System.out.println(modify.lipstick);
	}

}
