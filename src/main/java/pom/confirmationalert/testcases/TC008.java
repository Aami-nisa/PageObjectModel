package pom.confirmationalert.testcases;

import pom.confirmationalert.pages.ConfirmationAlertHomePage;

public class TC008 {
	
public void confirmationAlert() {
		
		new ConfirmationAlertHomePage() 
		
		.switchToFrame()
		.clickOnTryIt()
		.getText()
		.acceptAlert1()
		.verifyText("You Pressed Ok!")
		.refresh()
		.switchToFrame()
		.clickOnTryIt()
		.getText()
		.dismissAlert1()
		.verifyText("You Pressed Cancel!")
		.switchoutOfFrame()
		.clickOnHome()
		;
	}

}



