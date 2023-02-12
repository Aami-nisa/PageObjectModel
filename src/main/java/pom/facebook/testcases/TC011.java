package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FaceBookHomePage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC011";
		testCaseDescription="to verify Facebook verification for new user signup";
		author="Aami";
		category="smoke";
		browserName="chrome";
		url="https://www.facebook.com";
		
	}

    @Test
	public void Facebook() {
		
		new FaceBookHomePage()

		.clickOnSignup()
		.enterFirstName("Aamir")
		.enterSurName("SK")
		.enterEmail("sameer213@yahoo.com")
		.enterConfirmEmail("sameer231@yahoo.com")
		.enterPassword("Nisaa987!")
		.selectDay("4")
		.selectMonth("Apr")
		.selectYear("2003")
		.clickOnGender();
	}
}
