package pom.irctc.testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import pom.irctc.pages.HomePage;
import pom.irctc.pages.RegistrationPage;
import wrappers.ProjectWrappers;

public class TC001 extends  ProjectWrappers {
    
	@BeforeSuite
	public void beforeClass() {
		
		testCaseName="TC001";
		testCaseDescription="to verify irctc registeration for new user signup";
		author="Aami";
		category="smoke";
		browserName="chrome";
		url="https://www.irctc.co.in";

	}
	
	@Test
	public void irctcRegistration() {
		
		new CovidAlertPage()
		.clickOnOK()
		.clickOnRegister()
		.enterUserName("Aami1223")
		.enterPassword("Secret123")
		.enterConfirmPassword("Secret123")
		.clickOnLanguage()
		.clickOnEnglish()
		.clickOnSeqQue()
		.clickOnQue()
		.enterSecAns("Sez")
		.clickOnContinue()
		.enterFirstName("aami")
		.enterMiddleName("NIL")
		.enterLastName("sk")
		.clickOnOccupation()
		.clickOnans()
		.enterDateOfBirth("31-07-1998")
		.clickOnMarried()
		.clickOnGender()
		.selectIndia("India")
		.enterEmail("Skaamiri198@gmail.com")
		.enterMobile("9875265415")
		.selectNationality("India")
		.clickOnContinue1()
		.enterFlatNumber("No:5")
		.enterStreet("Chinnaswamy street")
		.enterArea("Agaram")
		.enterPincode("600082")
		.enterState("TamilNadu")
		.selectCity("Chennai")
		.selectPostOffice("Agaram S.o")
		.enterPhone("8975642536")
		.clickOnNo()
		.enterOffFlatNumber("10")
		.enterOffStreet("Mangaldas Nagar")
		.enterOffArea("Nagar")
		.enterOffPincode("522001")
		.enterOffState("Andhra Pradesh")
		.selectOffCity("Guntur")
		.selectOffPostOffice("NehruNagar S.O")
		.enterOffPhone("9875425698")
		.clickOnCondition()
		;
		
	}

}
