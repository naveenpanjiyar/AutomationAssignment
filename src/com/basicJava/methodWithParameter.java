package com.basicJava;

public class methodWithParameter {

	void launchBroswer(String broswername) {
		System.out.println("Lunch the broswer "+broswername);
		System.out.println("Enter the url of application");
	}
	
	public static void main(String[] args) {
		methodWithParameter obj = new methodWithParameter();
		
		obj.launchBroswer("Chrome");
		obj.launchBroswer("Firefox");
		obj.launchBroswer("Opera");
	}

}
