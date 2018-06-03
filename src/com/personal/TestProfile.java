package com.personal;

import java.nio.charset.MalformedInputException;

public class TestProfile extends ElakkiyaProfile{
	public static void printProfile(IProfile profile) {
		profile.myBasicInfo();
		profile.myHobbies();
	}
		public static void main(String args[]) {
			IProfile myprofile = new SivaProfile();
			TestProfile.printProfile(myprofile);		
		
	}

}
