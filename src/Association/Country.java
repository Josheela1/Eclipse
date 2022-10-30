package com.Xworkz.wings.boot;
public class Country {
	public String name;
	public City[] cities;
	public President president;
	
	
	public Country(String name) {
		this.name=name;
	}
	
	public void setCities(City[] cities) {
		this.cities=cities;
	}
	
	public void setPresident(President president) {
		this.president=president;
	}
	
	public void display() {
		System.out.println("displaying country......");
		System.out.println(this.name);
	

	if(cities!=null) {
		for(int i=0;i<cities.length;i++) {
			City city=cities[i];
			System.out.println(city);
			if(city!=null) {
				city.display();
			}else {
				System.out.println("city is null in index"+i);
			}
		}
	}
if(this.president!=null) {
	System.out.println(this.president);
	this.president.showOff();
}
}
}