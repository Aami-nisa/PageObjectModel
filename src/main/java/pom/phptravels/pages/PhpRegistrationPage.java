package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class PhpRegistrationPage extends GenericWrappers {

	public PhpRegistrationPage enterFirstName(String Fname)  {
		enterByXpath("//input[@id='inputFirstName']", Fname);
		return this;
	}
	
	public PhpRegistrationPage enterLastName(String Lname)  {
		enterByXpath("//input[@id='inputLastName']", Lname);
		return this;
	}
	
	public PhpRegistrationPage enterEmail(String email)  {
		enterByXpath("//input[@id='inputEmail']", email);
		return this;
	}
	
	public PhpRegistrationPage enterPhone(String phone)  {
		enterByXpath("//input[@id='inputPhone']", phone);
		return this;
	}
	
	public PhpRegistrationPage enterCompanyName(String ComName)  {
		enterByXpath("//input[@id='inputCompanyName']", ComName);
		return this;
	}
	
	public PhpRegistrationPage enterCompanyAdd(String add)  {
		enterByXpath("//input[@id='inputAddress1']", add);
		return this;
	}
	
	public PhpRegistrationPage enterStreet(String street)  {
		enterByXpath("//input[@id='inputAddress2']", street);
		return this;
	}
	
	public PhpRegistrationPage enterCity(String city)  {
		enterByXpath("//input[@id='inputCity']", city);
		return this;
	}
	
	public PhpRegistrationPage enterState(String state)  {
		enterByXpath("//input[@id='stateinput']", state);
		return this;
	}
	
	public PhpRegistrationPage enterPinCode(String pincode)  {
		enterByXpath("//input[@id='inputPostcode']", pincode);
		return this;
	}
	
	public PhpRegistrationPage selectCountry(String country) {
		selectVisibileTextByXpath("//select[@id='inputCountry']", country);
		return this;	
	}
	public PhpRegistrationPage enterPassword(String password)  {
		enterByXpath("//input[@id='inputNewPassword1']", password);
		return this;
	}
	
	public PhpRegistrationPage enterConfirmPassword(String cnfrmpass)  {
		enterByXpath("//input[@id='inputNewPassword2']", cnfrmpass);
		return this;
	}
	
		
}
