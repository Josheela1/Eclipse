package com.Xworkz.wings.boot;
import com.Xworkz.wings.constant.Gender;
public class President {
	public String name;
	public int tenure=5;
	public Gender gender;
	
	public President(String name) {
		super();
		this.name=name;
	}
	public void setGender(Gender gender) {
		this.gender=gender;
	}
	public void showOff() {
		System.out.println("showing values of president");
		System.out.println(this.name);
		System.out.println(this.tenure);
		System.out.println(this.gender);
	
	if(gender!=null) {
		System.out.println(this.gender);
	}
	}
}
