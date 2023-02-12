package pom.confirmationalert.pages;

import wrappers.GenericWrappers;

public class ConfirmationAlertPage extends GenericWrappers {
	
	public ConfirmationAlertPage getText()  {
		getAlertText();
		return this;
	}
	
	public ConfirmationAlertPage acceptAlert1()  {
		acceptAlert();
		return this;
	}
	
	public ConfirmationAlertPage verifyText(String text)  {
		verifyTextByXpath("//p[@id='demo']", text);
		return this;
	}
	
	public ConfirmationAlertPage refresh() {
	   refreshbrowser();
	   return this;
	}
	
	public ConfirmationAlertPage switchToFrame()  {
		switchtoframebyXpath("//iframe[contains(@id,'iframeResult')]");
		return this;
	}
	
	public ConfirmationAlertPage1 clickOnTryIt()   {
		clickByXpathNoSnap("//button[text()='Try it']");
		return new ConfirmationAlertPage1();
	}


}
