package pom.irctc.testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	
	@BeforeSuite
	public void beforeClass() {
		
		testCaseName="TC002";
		testCaseDescription="To book coach in irctc";
		author="Aami";
		category="regression";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";

	}

	@Test
	public void irctcBookCoach() {
		
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToSideBarPage()
		.clickOnMenu()
		.clickOnBookCoach()
		.switchToBookCoachPage()
		.clickOnSignUp()
		.enterUserId("Hansa1998")
		.enterpassword("Nisaa987!")
		.enterConfirmPassword("Nisaa987!")
		.selectSeqQue("What was the name of your first school?")
		.enterSeqAns("Imax")
		.enterDob("31/08/1998")
		.clickOnDob()
		.clickOnGender()
		.clickOnMarried()
		.enterEmail("Hansa786@gmail.com")
		.selectOccupation("Professional")
		.enterFirstName("aami")
		.enterMiddleName("Nil")
		.enterLastName("SK")
		.selectNationality("Indian")
		.enterFlatNo("5")
		.enterStreet("Nehru")
		.enterArea("sez nagar")
		.clickOnCountry()
		.selectountry("India")
		.enterMobile("8975426157")
		.enterPincode("522001")
		.clickOnCity()
		.selectCity("Chennai")
		.selectState("TAMILNADU")
		.selectPostOff("Agaram S.O")
		.ClickOnNo()
		.enterFlatNoOff("8")
		.enterStreetOff("Chinnaswamy street")
		.enterAreaOff("abc")
		.selectCountry("Indian")
		.enterMobileOff("8975632541")
		.enterPincodeOff("600082")
		.clickOnCityOff()
		.selectCityOff("Guntur")
		.selectStateOff("ANDHRAPRADESH")
		.selectPostOff1("600028")
		;
	}

}
