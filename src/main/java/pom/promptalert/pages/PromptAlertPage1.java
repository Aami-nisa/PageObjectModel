package pom.promptalert.pages;

import pom.confirmationalert.pages.TryHomePage;
import wrappers.GenericWrappers;

public class PromptAlertPage1 extends GenericWrappers {
	
	public PromptAlertPage1 enterAlertText(String name)  {
		enteralerttext(name);
		return this;
	}

	public PromptAlertPage1 getText()  {
		getAlertText();
		return this;
	}
	
	public PromptAlertPage1 dismissAlert1()  {
		dismissAlert();
		return this;
	}
	
	public PromptAlertPage1 verifyText(String text)  {
		verifyTextByXpath("//p[@id='demo']", text);
		return this;
	}

	public PromptAlertPage1 switchoutOfFrame()  {
		switchoutofframe();
		return this;
	}
	
	public TryHomePage clickOnHome()  {
		clickByXpath("//a[@id='tryhome']");
		return new TryHomePage();
	}


	
}
