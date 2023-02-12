package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SideBarPage extends GenericWrappers {
	
	public BookCoachPage clickOnBookCoach()  {
		clickByXpath("//a[text()='Book Your Coach/Train']");
		return new BookCoachPage();
    }
		
	public CharterPage clickonCharter()  {
		clickByXpath("//a[text()='Charter']");
		return new CharterPage();
		
	}

	public SideBarPage switchToSideBarPage() {
		switchToLastWindow();
		return this;
	}
	
}
