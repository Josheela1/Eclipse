package com.Xworkz.wings;
import com.Xworkz.wings.boot.*;

public class RMDRunner {
	
	public static void main(String[] args) {
		System.out.println("pichak pichak");
		
		RMD gutka=new RMD();
		System.out.println("name : " +gutka.name);
		System.out.println("type : " +gutka.type);
		System.out.println("priceForPack : " +gutka.priceForPack);
		System.out.println("mfgPlace : " +gutka.mfgPlace);
		System.out.println("mfgdate : " +gutka.mfgdate);
		System.out.println("availability : " +gutka.availability);
		System.out.println("dealername : " +gutka.dealername);
		System.out.println("contains : " +gutka.contains);
		System.out.println("price : " +gutka.price);
		
		gutka.discount=false;
		gutka.discountPercentage=0;
		gutka.tax=25;
		gutka.injurious=true;
		gutka.batchNumber=55;
		gutka.whereTospit="gatar";
		gutka.onlineShopping=true;
		gutka.onlineDeliveryName="gutkahouse";
		gutka.sideEffects="cancer";
		
		System.out.println("discount : " +gutka.discount);
		System.out.println("discountPercentage : " +gutka.discountPercentage);
		System.out.println("tax : " +gutka.tax);
		System.out.println("injurios : " +gutka.injurious);
		System.out.println("batchNumber : " +gutka.batchNumber);
		System.out.println("whereTospit : " +gutka.whereTospit);
		System.out.println("onlineShopping : " +gutka.onlineShopping);
		System.out.println("onlineDeliveryName : " +gutka.onlineDeliveryName);
		System.out.println("sideEffects : " +gutka.sideEffects);
		
		

	}

}

