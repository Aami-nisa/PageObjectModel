package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelBookingPage extends GenericWrappers {
	
	public HotelBookingPage clickOnLogin()  {
		 clickByXpath("//a[text()='Login']");
		return this;
	}
	
	public HotelBookingPage clickOnGuestLogin()  {
		 clickByXpath("//a[text()='Guest User Login ']");
		 return this;
	}
	
	public HotelBookingPage enterMobileNo(String Mobileno)  {
		 enterByXpath("//input[@name='mobileNo']", Mobileno);
		return this;
	}
	
	public BookingDetailsPage clickOnLogin1()  {
		 clickByXpath("//button[text()='Login']");
		return new BookingDetailsPage();
	}
	
	
}   
