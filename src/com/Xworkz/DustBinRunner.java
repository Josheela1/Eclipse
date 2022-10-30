package com.Xworkz.wings;
import com.Xworkz.wings.boot.*;
public class DustBinRunner {
	public static void main(String[] args) {
		System.out.println("chetha butta");
	
		DustBin dustbin=new DustBin();
		System.out.println("name : " +dustbin.name);
		System.out.println("brand : " +dustbin.brand);
		System.out.println("capacityInLitre : " +dustbin.capacityInLitre);
		System.out.println("motto : " +dustbin.motto);
		System.out.println("material : " +dustbin.material);
		System.out.println("colour : " +dustbin.colour);
		System.out.println("mfgPlace : " +dustbin.mfgPlace);
		System.out.println("mfgdate : " +dustbin.mfgdate);
		System.out.println("contains : " +dustbin.contains);
		
		dustbin.availability=true;
		dustbin.dealername="XYZ";
		dustbin.price=200;
		dustbin.onlineShopping=true;
		dustbin.onlineDeliveryName="amazon";
		dustbin.discount=true;
		dustbin.discountPercentage=8;
		dustbin.tax=5;
		dustbin.placesToKeepDB="publicPlaces";
		
		System.out.println("availability : " +dustbin.availability);
		System.out.println("dealername : " +dustbin.dealername);
		System.out.println("price : " +dustbin.price);
		System.out.println("onlineShopping : " +dustbin.onlineShopping);
		System.out.println("onlineDeliveryName : " +dustbin.onlineDeliveryName);
		System.out.println("discount : " +dustbin.discount);
		System.out.println("discountPercentage : " +dustbin.discountPercentage);
		System.out.println("tax : " +dustbin.tax);
		System.out.println("placesToKeepDB : " +dustbin.placesToKeepDB);
		

	}

}

