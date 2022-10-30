package com.Xworkz.wings;
import com.Xworkz.wings.boot.*;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		DistrictCollector bengaluruDC=new DistrictCollector();
		
		bengaluruDC.name="kShrinivas";
		bengaluruDC.age=55;
		bengaluruDC.district="bengaluruSouth";
		bengaluruDC.batchNumber=23;
		
		System.out.println(bengaluruDC.name);
		System.out.println(bengaluruDC.age);
		System.out.println(bengaluruDC.district);
		System.out.println(bengaluruDC.batchNumber);
	

	}

}
