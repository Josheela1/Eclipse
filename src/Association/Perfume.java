package com.Xworkz.boot;

public class Perfume {
	private String brand="ITCC";
	String fragrance;
	double price;
	String ambassador;
	public String name="Engage";
	String brandOwner="ITC";
	String manufacturedInCountry="INDIA";
	String manufacturingDate="05/05/22";
	String expiryDate="4/4/2025";
	int quanity=2;
	
	
	public String getBrand() {
		return this.brand;
		
	}
	void setBrand(String brand) {
		this.brand=brand;
	}
	
	
	public String getName() {
		return this.name;
		
	}
	void setName(String name) {
		this.name=name;
	}
	
	
	public String getBrandOwner() {
		return this.brandOwner;
		
	}
	void setBrandOwner(String brandOwner) {
		this.brandOwner=brandOwner;
	}
	
	
	public String getManufacturedInCountry() {
		return this.manufacturedInCountry;
		
	}
	void setManufacturedInCountry(String manufacturedInCountry) {
		this.manufacturedInCountry=manufacturedInCountry;
	}
	
	
	public String getManufacturingDate() {
		return this.manufacturingDate;
		
	}
	void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate=manufacturingDate;
	}
	
	
	
	
	public String getExpiryDate() {
		return this.expiryDate;
		
	}
	void setExpiryDate(String expiryDate) {
		this.expiryDate=expiryDate;
	}
	
}
