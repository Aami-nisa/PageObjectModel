package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FacebookSignUpPage extends GenericWrappers {

	public FacebookSignUpPage enterFirstName(String fName)  {
		enterByXpath("//input[@name='firstname']", fName);
		return this;
	}
	
	public FacebookSignUpPage enterSurName(String sName)  {
		enterByXpath("//input[@name='lastname']", sName);
		return this;
	}

	public FacebookSignUpPage enterEmail(String email)  {
		enterByXpath("//input[@name='reg_email__']", email);
		return this;
	}

	
	public FacebookSignUpPage enterConfirmEmail(String email1)  {
		enterByXpath("//input[@name='reg_email_confirmation__']", email1);
		return this;
	}

	
	public FacebookSignUpPage enterPassword(String password)  {
		enterByXpath("//input[@name='reg_passwd__']", password);
		return this;
	}
    
	public FacebookSignUpPage selectDay(String day) {
    	selectVisibileTextByXpath("//select[@id='day']", day);
    return this;
     }
    public FacebookSignUpPage selectMonth(String month) {
    	selectVisibileTextByXpath("//select[@id='month']", month);
    return this;
     }
    public FacebookSignUpPage selectYear(String year) {
    	selectVisibileTextByXpath("//select[@id='year']", year);
    return this;
     }
    public FacebookSignUpPage clickOnGender() {
    	clickByXpath("//label[text()='Female']");
    return this;
	
	
    }
    
}
