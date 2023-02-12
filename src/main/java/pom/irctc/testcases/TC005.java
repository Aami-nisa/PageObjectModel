package pom.irctc.testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	
	@BeforeSuite
	public void beforeClass() {
		
		testCaseName="TC005";
		testCaseDescription="To book a hotel along gst validation";
		author="Aami";
		category="regression";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";

	}

	@Test
	public void gstValidation() {
		
		new CovidAlertPage()
		
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.clickOnHotels()
		.enterCity("Delhi")
		.clickOnCity()
		.clickOnCheckInDate()
		.clickOnDate()
		.clickOnCheckOutDate()
		.clickOnDate1()
		.clickOnRoom()
		.selectHotelRoom("1")
		.selectAdults("3")
		.clickOnDone()
		.clickOnFindHotel()
		.clickOnFirstDisplayHotel()
		.getHotelName()
		.getHotelPrice()
		.clickOnContinueToBook1()
		.selectTitle("Mrs")
		.enterFirstName("XyZ")
		.enterLastName("sez")
		.selectCountry("India")
		.selectState("TamilNadu")
		.enterMobileNo("9856487597")
		.clickOnGst()
		.enterGstNo("AST98756547")
		.enterCompanyName("SAR GLOBAL SOLUTIONS")
		.enterCompanyAddress("Agaram")
		.verifyGstNum("Please Enter Valid GSt number")
		;

	}

}
