package pom.promptalert.pages;

import wrappers.GenericWrappers;

public class PromptAlertPage extends GenericWrappers {
	
	public PromptAlertPage enterAlertText(String name)  {
		enteralerttext(name);
		return this;
	}

	public PromptAlertPage getText()  {
		getAlertText();
		return this;
	}
	
	public PromptAlertPage acceptAlert1()  {
		acceptAlert();
		return this;
	}
	
	public PromptAlertPage verifyText(String text)  {
		verifyTextByXpath("//p[@id='demo']", text);
		return this;
	}
	
	public PromptAlertPage refresh() {
	   refreshbrowser();
	   return this;
	}
	
	public PromptAlertPage switchToFrame()  {
		switchtoframebyXpath("//iframe[contains(@id,'iframeResult')]");
		return this;
	}
	
	public PromptAlertPage1 clickOnTryIt()   {
		clickByXpathNoSnap("//button[text()='Try it']");
		return new PromptAlertPage1();
	}
}
