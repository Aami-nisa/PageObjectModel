package pom.simplealert.pages;

import pom.confirmationalert.pages.TryHomePage;
import wrappers.GenericWrappers;

public class SimpleAlertHomePage extends GenericWrappers {
	
	public SimpleAlertHomePage switchToFrame()  {
		switchtoframebyXpath("//iframe[@id='iframeResult']");
		return this;
	}
	
	public SimpleAlertHomePage clickOnTryIt()   {
		clickByXpathNoSnap("//button[text()='Try it']");
		return this;
	}

	public SimpleAlertHomePage getText()  {
		getAlertText();
		return this;
	}
	
	public SimpleAlertHomePage acceptAlert1()  {
		acceptAlert();
		return this;
	}
	
	public SimpleAlertHomePage switchOutOfFrame()  {
		switchoutofframe();
		return this;
	}

	public TryHomePage clickOnHome()  {
		clickByXpath("//a[@id='tryhome']");
		return new TryHomePage();
	}

	
}
