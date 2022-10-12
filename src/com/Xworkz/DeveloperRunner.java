package com.Xworkz.wings;
import com.Xworkz.wings.boot.*;

public class DeveloperRunner {

	public static void main(String[] args) {
		Developer develops=new Developer();
		develops.name="abc";
		develops.education="BE";
		develops.experience="5years";
		develops.salary=25000;
		develops.company="XYZ";
		
		System.out.println(develops.name);
		System.out.println(develops.education);
		System.out.println(develops.experience);
		System.out.println(develops.salary);
		System.out.println(develops.company);
		

	}

}
