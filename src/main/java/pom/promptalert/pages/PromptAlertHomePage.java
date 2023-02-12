package pom.promptalert.pages;

import wrappers.GenericWrappers;

public class PromptAlertHomePage extends GenericWrappers {

	public PromptAlertHomePage switchToFrame()  {
		switchtoframebyXpath("//iframe[@name='iframeResult']");
		return this;
	}
	
	public PromptAlertPage clickOnTryIt()   {
		clickByXpathNoSnap("//button[text()='Try it']");
		return new PromptAlertPage();
	}
}
