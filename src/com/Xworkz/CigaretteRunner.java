package com.Xworkz.wings;
import com.Xworkz.wings.boot.*;

public class CigaretteRunner {

	public static void main(String[] args) {
		System.out.println("Hoge");
		Cigarette Batti = new Cigarette();
		
		System.out.println("name : " +Batti.name);
		System.out.println("brand : " +Batti.brand);
		System.out.println("price : " +Batti.price);
		System.out.println("priceForPack :" +Batti.priceForPack);
		System.out.println("mintBlast :" +Batti.mintBlast);
		System.out.println("colour :" +Batti.colour);
		System.out.println("puffColour : " +Batti.puffColour);
		System.out.println("availability : " +Batti.availability);
		System.out.println("contains : " +Batti.contains);
		
		Batti.WrappingMaterial="paper";
		Batti.dealerName="cigaratteJane";
		Batti.discount=2;
		Batti.tax=28;
		Batti.mfgDate="12/10/2022";
		Batti.injurios=true;
		Batti.batchNumber=25;
		Batti.whereToPutAsh="AshTray";
		Batti.typeOfPollution="AirPollution";
		
		System.out.println("WrappingMaterial : " +Batti.WrappingMaterial);
		System.out.println("dealerName : " +Batti.dealerName);
		System.out.println("discount : " +Batti.discount);
		System.out.println("tax : " +Batti.tax);
		System.out.println("mfgDate : " +Batti.mfgDate);
		System.out.println("injurios : " +Batti.injurios);
		System.out.println("batchNumber : " +Batti.batchNumber);
		System.out.println("whereToPutAsh : " +Batti.whereToPutAsh);
		System.out.println("typeOfPollution : " +Batti.typeOfPollution);
		

	}



	}


