package com.personal;

public class SivaProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		// TODO Auto-generated method stub
		System.out.println(ProfileConstants.FIRST_NAME+"Siva");
		System.out.println("LastName : shankar");
		System.out.println("Age : 28");
		
	}

	@Override
	public void myHobbies() {
		// TODO Auto-generated method stub
		System.out.println("watching movies and coding");
				
		
	}

}
