package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FaceBookHomePage extends GenericWrappers{

	public FacebookSignUpPage clickOnSignup()  {
		 clickByXpath("//a[text()='Create New Account']");
		 return new FacebookSignUpPage();
	}
	
}
