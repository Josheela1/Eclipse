package com.Xworkz.wings.boot;

public class Tractor {
	public String name;
	public String brand;
	public double price;
	public String color;
	public int    hp;
	public char   model;
	
	
	public Tractor()
	{
		System.out.println("//////////////////////////////////////");
	}
	
	public Tractor(String name)
	{
		this();
		this.name = name;
	    
	}
	
	public Tractor(String name,double Price)
	{
		this.name=name;
		this.price = price;
		
	}
	
	public Tractor(String name,String brand,double price)
	{
		this.name=name;
		this.brand=brand;
		this.price = price;
	}
	
	public Tractor(String name,String brand,double price,String color)
	{
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.color = color;
	}
	
	public Tractor(String name,String brand,double price,String color,int hp)
	{
		this.name=name;;
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.hp = hp;
	}
	
	public Tractor(String name,double price,String color,int hp,String brand,char model)
	{
	    this(name,brand,price,color,hp);	
	    this.model = model;

	}
}

	
	
	



