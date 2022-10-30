package com.Xworkz.wings.boot;

public class Name {
	public String currentName;
	public String oldName;
	public double futureName;
	public Name(String currentName,String oldName,String futureName) {
		super();
		this.currentName=currentName;
		this.oldName=oldName;
	}
	public void display() {
		System.out.println(currentName);
		System.out.println(oldName);
		System.out.println(futureName);
	}

}
