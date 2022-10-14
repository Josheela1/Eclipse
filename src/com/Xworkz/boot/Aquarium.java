package com.Xworkz.wings.boot;

public class Aquarium {
	public String shape;
	public char size;
	public double capacity;
	
	public Aquarium() {
		System.out.println("created using default constructor");
		}
	
	public Aquarium(String shape) {
		this.shape=shape;
		System.out.println("created aquarium using parameterized constructor");
	}
	public Aquarium(char size) {
		this.size=size;
	}

}
