package pom.indianfrro.testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pom.indianfrro.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {
	
	@BeforeSuite
	public void beforeClass() {
		
		testCaseName="TC006";
		testCaseDescription="to verify registratiob for indianfrro";
		author="Aami";
		category="smoke";
		browserName="chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";

	}


	@Test
	public void indianFrro()  {
		
		new HomePage()
		.clickOnSignUp()
		.enterUserName("Hansa786")
		.enterPassword("Nisaa987&")
		.enterConfirmPassword("Nisaa987&")
		.selectSecurityQuestion("What is the name of the hospital where you were born?")
		.enterSecurityAnswer("Harilal")
		.enterName("Aamir")
		.selectGender("Female")
		.enterDateOfBirth("31-07-1998")
		.enterDesignation("sez")
		.enterEmail("Skaamiri98@yahoo.com")
		.enterMobile("9875698452")
		.enterPhoneNumber("9875426542")
		.selectNationality()
		.enterGuestName("xyz")
		.enterCapacity("2")
		.enterAddress("waltkins")
		.selectState("ANDHRA PRADESH")
		.selectCity("3D")
		.selectAccomodationType("Guest House")
		.selectAccomodationGrade("Four Star")
		.enterGuestEmail("sameer123@gmail.com")
		.enterGuestmobile("9874563254")
		.enterGuestPhoneNumber("8754965214")
		.enterPassengerName("sameer")
		.enterPassengerAddress("Nehru nagar")
		.selectPassengerstate("ANDAMAN AND NICOBAR ISLANDS")
		.selectPassengercity(" NICOBAR")
		.enterPassengerEmail("sameer432@yahoo.com")
		.enterPassengermobile("9875486925")
		.enterPassengerPhoneNumber("8795468254")
		.clickOnAdd()
		;
	}

}