package pom.irctc.testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {
	
	@BeforeSuite
	public void beforeClass() {
		
		testCaseName="TC004";
		testCaseDescription="To book a hotel and to verify the otp";
		author="Aami";
		category="regression";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";

	}

	@Test
	public void hotelOtpVerification()  {
		
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
		.clickOnContinueToBook()
		.selectTitle("Mrs")
		.enterFirstName("XyZ")
		.enterLastName("sez")
		.selectCountry("India")
		.selectState("TamilNadu")
		.enterMobileNo("9856487597")
		.clickOnGst()
		.verifyHotelName("IRCTC GINGER RAIL YATRI NIWAS")
		.VerifyHotelPrice("₹ 1929")
		.clickOnContinue()
		.clickOnTC()
		.clickOnMakePayment()
		.clickOnVerify()
		.verifytext("otp is required.")
		;
		
	
	}

}
