package com.Xworkz.wings;
import com.Xworkz.wings.boot.*;
public class ChocolateRunner {

	public static void main(String[] args) {
		Chocolate chocolate1=new Chocolate();
		chocolate1.name="chocolate name : DairyMilk";
		chocolate1.brand="chocolate brand: cadbury";
		chocolate1.flavour="chocolate type: fruitandnut";
		chocolate1.price= 100;
		
		System.out.println(chocolate1.name);
		System.out.println(chocolate1.brand);
		System.out.println(chocolate1.flavour);
		System.out.println(chocolate1.price);

	}

}
