package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDetailsPage extends GenericWrappers {
   
	public HotelDisplayPage clickOnFirstDisplayHotel()  {
		clickByXpath("//h5[text()='IRCTC GINGER RAIL YATRI NIWAS']");
		return new HotelDisplayPage();
   }
	
}
