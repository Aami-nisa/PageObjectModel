package pom.confirmationalert.pages;

import wrappers.GenericWrappers;

public class ConfirmationAlertPage1 extends GenericWrappers {
	
	public ConfirmationAlertPage1 getText()  {
		getAlertText();
		return this;
	}
	
	public ConfirmationAlertPage1 dismissAlert1()  {
		dismissAlert();
		return this;
	}
	
	public ConfirmationAlertPage1 verifyText(String text)  {
		verifyTextByXpath("//p[@id='demo']", text);
		return this;
	}

	public ConfirmationAlertPage1 switchoutOfFrame()  {
		switchoutofframe();
		return this;
	}
	
	public TryHomePage clickOnHome()  {
		clickByXpath("//a[@id='tryhome']");
		return new TryHomePage();
	}

}
