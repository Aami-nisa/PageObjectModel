package pom.irctc.testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	@BeforeSuite
	public void beforeClass() {
		
		testCaseName="TC003";
		testCaseDescription="To book a charter in irctc";
		author="Aami";
		category="regression";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";

	}

    @Test
	public void charterBooking()  {
		
		new CovidAlertPage()
		
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.clickOnMenu()
		.clickonCharter()
		.clickOnEnquiryForm()
		.enterName("Xyz")
		.enterOrganization("sez")
        .enterAddress("chennai")
        .enterMobile("9875624514")
        .enterEmail("Hansa786@gmail.com")
        .selectRequestFor("Saloon Charter")
        .enterOriginStation("chennai")
        .enterDestination("guntur")
        .ClickOnCheckInDate()
        .clickOnDate()
        .clickOnCheckOutDate()
        .clickOnMonth()
        .clickondate()
        .enterPeriod("7")
        .enterCoachDetails("sez")
        .enterNoOfPass("2")
        .enterNoOfPass1("2")
        .selectCharterPurpose("Xyz")
        .enterServices("Nil")
        .clickOnSubmit()
        .verifyMobileNo()
        ;
		
	}
}
