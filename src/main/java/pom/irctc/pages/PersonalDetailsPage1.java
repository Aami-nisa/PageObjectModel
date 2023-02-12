package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PersonalDetailsPage1 extends GenericWrappers{
 
	public PersonalDetailsPage1 selectTitle(String Title)  {
		selectVisibileTextByXpath("//option[text()='Mrs']", "Mrs");
		return this;
	}
	
	public PersonalDetailsPage1 enterFirstName(String Firstname)  {
		enterByXpath("//input[@name='firstName']", Firstname);
		return this;
	}
    
	public PersonalDetailsPage1 enterLastName(String lastName)  {
		enterByXpath("//input[@name='lastName']", lastName);
		return this;
	}
	
	public PersonalDetailsPage1 selectCountry(String Country)  {
		selectVisibileTextByXpath("//option[text()='India']", "India");
		return this;
	}
	
	public PersonalDetailsPage1 selectState(String state)  {
		selectVisibileTextByXpath("//option[text()='TAMIL NADU']", "TamilNadu");
		return this;
	}
	
	public PersonalDetailsPage1 enterMobileNo(String MobileNo)  {
		enterByXpath("//input[@name='mobileNo']", MobileNo);
		return this;
	}
	
	public PersonalDetailsPage1 clickOnGst()  {
		clickByXpath("//option[text()='Yes']");
		return this;
	}
	
	public PersonalDetailsPage1 enterGstNo(String GstNo)  {
		enterByXpath("//input[@name='gstNumber']", GstNo);
		return this;
	}
	
	public PersonalDetailsPage1 enterCompanyName(String name)  {
		enterByXpath("//input[@name='companyName']", name);
		return this;
	}
	
	public PersonalDetailsPage1 enterCompanyAddress(String Address)  {
		enterByXpath("//input[@name='companyAddress']", Address);
		return this;
	}
	
	public PersonalDetailsPage1 verifyGstNum(String text)  {
		verifyTextByXpath("//span[text()='Please Enter Valid GSt number']", "Please Enter Valid GSt number");
		return this;
	}
	
	
	
}
