package com.Xworkz.wings;
import com.Xworkz.wings.boot.*;
public class VegetableRunner {

	public static void main(String[] args) {
		
			String[] items= {"capcicum","celery","cucumber","onion","cabbage","brinjal"};
			String[] temp= {"green","purple"};
			String value="Green colored vegetables";
			Vegetable vegetable=new Vegetable(value,true,temp,4,items,"round","bitter taste","crunchy",94,9);
			System.out.println(vegetable.name);
			vegetable.display();
		
			
			System.out.println(System.lineSeparator());
			Vegetable vegetable2=new Vegetable(value,true,temp,5,items,"round","peppery flavour","rubbery",10,7);
            vegetable2.display();
			
			System.out.println(System.lineSeparator());
			Vegetable vegetable3=new Vegetable(value,true,temp,4,items,"round","bitter taste","crunchy",94,9);
			vegetable3.display();
			
			System.out.println(System.lineSeparator());
			Vegetable vegetable4=new Vegetable(value,true,temp,4,items,"round","peppery flavour","rubbery",94,9);
			vegetable4.display();
	}
}