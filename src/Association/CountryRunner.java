package com.Xworkz.wings;

import com.Xworkz.wings.boot.Name;
import com.Xworkz.wings.boot.City;
import com.Xworkz.wings.boot.Country;
import com.Xworkz.wings.boot.President;
import com.Xworkz.wings.constant.Gender;
public class CountryRunner {
	public static void main() {
		Country country=new Country("Australia");
		President president=new President("Antony Albanese");
		
		president.setGender(Gender.MALE);
		country.setPresident(president);
		Name name=new Name("Canberra","Sydney",null);
		City city=new City(null);
		Name name2=new Name("Melbourne",null,null);
		City city2=new City(name2);
		City[] cities= {city,city2};
		country.setCities(cities);
		
		country.display();
	}

}
