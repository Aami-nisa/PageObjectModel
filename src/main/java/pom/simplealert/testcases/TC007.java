package pom.simplealert.testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pom.simplealert.pages.SimpleAlertHomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {
	
	@BeforeSuite
	public void beforeClass() {
		
		testCaseName="TC007";
		testCaseDescription="to verify simple alert";
		author="Aami";
		category="smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";

	}

	@Test
	public void simpleAlert()  {
		
		new SimpleAlertHomePage()
		.switchToFrame()
		.clickOnTryIt()
		.getText()
		.acceptAlert1()
		.switchOutOfFrame()
		.clickOnHome()
		;
		
	}

}
