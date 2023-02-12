package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PersonalDetailsPage extends GenericWrappers {
	
	public PersonalDetailsPage selectTitle(String Title)  {
		selectVisibileTextByXpath("//option[text()='Mrs']", "Mrs");
		return this;
	}
	
	public PersonalDetailsPage enterFirstName(String Firstname)  {
		enterByXpath("//input[@name='firstName']", Firstname);
		return this;
	}
    
	public PersonalDetailsPage enterLastName(String lastName)  {
		enterByXpath("//input[@name='lastName']", lastName);
		return this;
	}
	
	public PersonalDetailsPage selectCountry(String Country)  {
		selectVisibileTextByXpath("//option[text()='India']", "India");
		return this;
	}
	
	public PersonalDetailsPage selectState(String state)  {
		selectVisibileTextByXpath("//option[text()='TAMIL NADU']", "TamilNadu");
		return this;
	}
	
	public PersonalDetailsPage enterMobileNo(String MobileNo)  {
		enterByXpath("//input[@name='mobileNo']", MobileNo);
		return this;
	}
	
	public PersonalDetailsPage clickOnGst()  {
		clickByXpath("//option[text()='No']");
		return this;
	}
	
	public PersonalDetailsPage verifyHotelName(String Name)  {
		verifyTextByXpath("//h5[text()='IRCTC GINGER RAIL YATRI NIWAS ']", Name);
		return this;
	}
	
	public PersonalDetailsPage VerifyHotelPrice(String Price)  {
		verifyTextContainsByXpath("//strong[text()='₹ 1929 ']", Price);
		return this;
	}
	
	public PaymentPage clickOnContinue()  {
		clickByXpath("//button[text()='Continue']");
		return new PaymentPage();
	}
}
