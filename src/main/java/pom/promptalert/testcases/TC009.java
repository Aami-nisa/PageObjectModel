package pom.promptalert.testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pom.promptalert.pages.PromptAlertHomePage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {
	
	@BeforeSuite
	public void beforeClass() {
		
		testCaseName="TC009";
		testCaseDescription="to verify simple alert";
		author="Aami";
		category="smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";

	}

		@Test
		public void promptAlert()  {
			
			new PromptAlertHomePage() 
			.switchToFrame()
			.clickOnTryIt()
			.enterAlertText("Aami")
			.getText()
			.acceptAlert1()
			.verifyText("Aami")
			.refresh()
			.switchToFrame()
			.clickOnTryIt()
			.enterAlertText("Aami")
			.getText()
			.dismissAlert1()
			.verifyText("Aami")
			.switchoutOfFrame()
			.clickOnHome()
			;
			
		}

	}



