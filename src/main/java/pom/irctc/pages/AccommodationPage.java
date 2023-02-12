package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers {
	
	public SideBarPage clickOnMenu() {
		clickByXpath("//i[@class='fas fa-align-left']");
		return new SideBarPage();
	}
   public BookingDetailsPage clickOnHotels()  {
        clickByXpath("//span[text()='Hotels']");
		return new BookingDetailsPage(); 
    }
   
	public AccommodationPage switchToSideBarPage() {
		switchToLastWindow();
		return new AccommodationPage();
	}
   
   
}
