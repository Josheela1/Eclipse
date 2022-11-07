package com.Xworkz.boot.Inheritance;

public class CoffeeRunner {
	public static void main(String[] args) {
	Object obj=new InstantCoffee();
	Coffee coffee=(Coffee)obj; //casting
	System.out.println(coffee.brand);
	InstantCoffee instantcoffee=(InstantCoffee)coffee;  //casting
	System.out.println(instantcoffee.price);
	}

}
