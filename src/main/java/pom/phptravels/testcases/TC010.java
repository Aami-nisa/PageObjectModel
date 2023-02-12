package pom.phptravels.testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pom.phptravels.pages.PhpRegistrationPage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers {
	
		
		@BeforeSuite
		public void beforeClass() {
			
			testCaseName="TC010";
			testCaseDescription="to verify new registration for phptravels";
			author="Aami";
			category="smoke";
			browserName="chrome";
			url="https://www.phptravels.org/register.php";

		}
		@Test
		public void Phptravels()  {

		new PhpRegistrationPage()
		.enterFirstName("sameer")
		.enterLastName("Ahmed")
		.enterEmail("skaamiri1998@gmail.com")
		.enterPhone("9875632541")
		.enterCompanyName("SAR BUSINESS SOLUTIONS")
		.enterCompanyAdd("Agaram")
		.enterStreet("nehru nagar")
		.enterCity("chennai")
		.enterState("Tamil Nadu")
		.enterPinCode("600082")
		.selectCountry("Afghanistan")
		.enterPassword("Nisaa987!")
		.enterConfirmPassword("Nisaa987!")
		;
		
		
	}

}
