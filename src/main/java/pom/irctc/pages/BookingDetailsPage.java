package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookingDetailsPage extends GenericWrappers {
	
	public BookingDetailsPage enterCity(String City)  {
		enterByXpath("//input[@id='filterText']", City);
		return this;
	}
	
	public BookingDetailsPage clickOnCity()  {
		clickByXpath("//span[text()='New Delhi']");
		return this;
	}
	
	public BookingDetailsPage clickOnCheckInDate()  {
		clickByXpath("//input[@name='dt12']");
		return this;
	}
	 
	public BookingDetailsPage clickOnDate()  {
		clickByXpath("//span[text()='26']");
		return this;
	}
	
	public BookingDetailsPage clickOnCheckOutDate()  {
		clickByXpath("//input[@name='dt13']");
		return this;
	}
	
	public BookingDetailsPage clickOnDate1()  {
		clickByXpath("//span[text()='30']");
		return this;
	}
	
	public BookingDetailsPage clickOnRoom()  {
		clickByXpath("//input[@id='user-data-wrapper-id']");
		return this;
	}

	public BookingDetailsPage selectHotelRoom(String Room)  {
		selectVisibileTextByXpath("//select[@name='hotelRoom']", "1");
		return this;
	}

	public BookingDetailsPage selectAdults(String Adults)  {
		selectVisibileTextByXpath("//select[@name='hotelAdult']", "3");
		return this;
	}
    
	public BookingDetailsPage clickOnDone()  {
		clickByXpath("//button[text()='Done']");
		return this;
	}
	
	public HotelDetailsPage clickOnFindHotel()  {
		clickByXpath("//button[text()='Find Hotel ']");
		return new HotelDetailsPage();
	}
}
