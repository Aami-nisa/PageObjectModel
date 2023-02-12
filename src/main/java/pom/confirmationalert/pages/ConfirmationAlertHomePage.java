package pom.confirmationalert.pages;

import wrappers.GenericWrappers;

public class ConfirmationAlertHomePage extends GenericWrappers {
	
	public ConfirmationAlertHomePage switchToFrame()  {
		switchtoframebyXpath("//iframe[contains(@id,'iframeResult')]");
		return this;
	}
	
	public ConfirmationAlertPage clickOnTryIt()   {
		clickByXpathNoSnap("//button[text()='Try it']");
		return new ConfirmationAlertPage();
	}

}
