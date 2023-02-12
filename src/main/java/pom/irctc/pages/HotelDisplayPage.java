package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDisplayPage extends GenericWrappers {
	
	public HotelDisplayPage getHotelName()  {
		getTextByXpath("//h5[text()='IRCTC GINGER RAIL YATRI NIWAS ']");
		return this;
   }
	
	public HotelDisplayPage getHotelPrice()  {
		getTextByXpath("//strong[text()='₹ 1929']");
		return this;
   }
	
	public PersonalDetailsPage clickOnContinueToBook()   {
		clickByXpath("//b[text()='Continue to Book']");
		return new PersonalDetailsPage();
	}
	
	public PersonalDetailsPage1 clickOnContinueToBook1()  {
		clickByXpath("//b[text()='Continue to Book']");
		return new PersonalDetailsPage1();
	}
	
}
