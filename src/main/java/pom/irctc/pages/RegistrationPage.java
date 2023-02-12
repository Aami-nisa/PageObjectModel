package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage enterUserName(String data) {
		enterByXpath("//input[@id='userName']", data);
		return this;
	}
	
	public RegistrationPage enterPassword(String data1)  {
		 enterByXpath("//input[@id='usrPwd']", data1);
		return this;
	}
	
	public RegistrationPage enterConfirmPassword(String data2)  { 
          enterByXpath("//input[@id='cnfUsrPwd']", data2);
		return this;
	}
	
	public RegistrationPage clickOnLanguage()  {
		clickByXpath("//span[text()='Preferred Language']");
		return this;
	}
	
	public RegistrationPage clickOnEnglish() {
		 clickByXpath("//span[text()='English']");
		 return this;
	}
	
	public RegistrationPage clickOnSeqQue()  {
		clickByXpath("//span[text()='Security Question']");
		return this;
	}
	
	public RegistrationPage clickOnQue()  {
		clickByXpath("(//span[@class='ng-star-inserted'])[2]");
		return this;
	}
	
	public RegistrationPage enterSecAns(String data4)  {
		enterByXpath("//input[@formcontrolname='secAns']", data4);
		return this;
	}
	
	public RegistrationPage clickOnContinue()  {
		clickByXpath("//button[@label='Continue']");
		return this;
	}
	
	public RegistrationPage enterFirstName(String data5) {
		 enterByXpath("//input[@id='firstName']", data5);
		 return this;
	}
	public RegistrationPage enterMiddleName(String data6) {
		enterByXpath("//input[@id='middleName']", data6);
		 return this;
	}
	public RegistrationPage enterLastName(String data7) {
		enterByXpath("//input[@id='lastname']", data7);
		 return this;
	}
	public RegistrationPage clickOnOccupation() {
		clickByXpath("//div[contains(@class, 'ng-tns-c65-16 ui-dropdown ui-widget ui-state-default ui-corner-all')]");
		 return this;
	}
	public RegistrationPage clickOnans() {
		 clickByXpath("//span[text()='PRIVATE']");
		 return this;
	}
	
	public  RegistrationPage enterDateOfBirth(String data8) {
		enterByXpath("//a[text()='31']", data8);
		return this;
	}
	public RegistrationPage clickOnMarried() {
		clickByXpath("//div[@role='radio']");
		 return this;
	}
	public RegistrationPage clickOnGender() {
		clickByXpath("//span[text()='Female']");
		 return this;
	}
	public RegistrationPage clickOnCountry() {
		clickByXpath("//select[@formcontrolname='resCountry']");
		 return this;
	}
	public RegistrationPage selectIndia(String India) {
		selectVisibileTextByXpath("//option[text()='India']", India);
		 return this;
	}
	public RegistrationPage enterEmail(String data9) {
		 enterByXpath("//input[@id='email']", data9);
		 return this;
	}
	public RegistrationPage enterMobile(String data10) {
        enterByXpath("//input[@id='mobile']", data10);
		 return this;
	}
	public RegistrationPage selectNationality(String nationality) {
		selectVisibileTextByXpath("//select[@formcontrolname='nationality']']", nationality);
		return this;
	}
    public RegistrationPage clickOnContinue1() {
		 clickByXpath("//button[@label='Continue']");
		 return this;
	}
	
	public RegistrationPage enterFlatNumber(String data11) {
		enterByXpath("//input[@id='resAddress1']", data11);
		return this;
	}
	
	public RegistrationPage enterStreet(String data12) {
		enterByXpath("//input[@id='resAddress2']", data12);
		return this;
	}
	
	public RegistrationPage enterArea(String data13) {
		enterByXpath("//input[@id='resAddress3']", data13);
		return this;
	}
	
	public RegistrationPage enterPincode(String data14) {
		enterByXpath("//input[@formcontrolname='resPinCode']", data14);
		return this;
	}
	
	public RegistrationPage enterState(String data15) {
		enterByXpath("//input[@formcontrolname='resState']", data15);
		return this;
		}
	public RegistrationPage selectCity(String data16) {
		enterByXpath("//select[@formcontrolname='resCity']", data16);
		return this;
		}
	public RegistrationPage selectPostOffice(String data17) {
		enterByXpath("//select[@formcontrolname='resPostOff']", data17);
		return this;
		}
	public RegistrationPage enterPhone(String data18) {
		enterByXpath("//input[@id='resPhone']", data18);
		return this;
		}
	public RegistrationPage clickOnNo() {
		clickByXpath("//label[text()='No']");
		return this;
	}
	public RegistrationPage enterOffFlatNumber(String data19) {
		enterByXpath("//input[@id='offAddress1']", data19);
		return this;
		}
	public RegistrationPage enterOffStreet(String data20) {
		enterByXpath("//input[@id='offAddress2']", data20);
		return this;
		}
	public RegistrationPage enterOffArea(String data21) {
		enterByXpath("//input[@id='offAddress3']", data21);
		return this;
		}
		public RegistrationPage enterOffPincode(String data23) {
		enterByXpath("//input[@id='offPinCode']", data23);
		return this;
	}
	
	public RegistrationPage enterOffState(String data24) {
		enterByXpath("//input[@formcontrolname='offState']", data24);
		return this;
	}
	
	public RegistrationPage selectOffCity(String data25) {
		selectVisibileTextByXpath("//select[@formcontrolname='offCity']", data25);
		return this;
	}
	
	public RegistrationPage selectOffPostOffice(String data26) {
		selectVisibileTextByXpath("//select[@formcontrolname='offPostOff']", data26);
		return this;
	}
	
	public RegistrationPage enterOffPhone(String data27) {
		enterByXpath("//input[@formcontrolname='offPhone']", data27);
		return this;
	}
	
	public RegistrationPage clickOnCondition() {
		clickByXpath("//input[@formcontrolname='termCondition']");
		return this;
    }
	}
