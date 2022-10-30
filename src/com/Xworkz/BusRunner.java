package com.Xworkz.wings;
import com.Xworkz.wings.boot.*;

public class BusRunner {

	public static void main(String[] args) {
		Bus ksrtc=new Bus();
		
		ksrtc.busNumber=1234;
		ksrtc.source="hospet";
		ksrtc.destination="bellary";
		
		System.out.println(ksrtc.busNumber);
		System.out.println(ksrtc.source);
		System.out.println(ksrtc.destination);

	}

}
