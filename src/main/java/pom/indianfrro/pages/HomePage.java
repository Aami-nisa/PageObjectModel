package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public UserRegistrationPage clickOnSignUp()  {
		clickByXpath("//a[text()='Sign Up (Registration)']");
		return new UserRegistrationPage();
		
	}

}
