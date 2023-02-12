package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PaymentPage extends GenericWrappers {

	 public PaymentPage clickOnTC()  {
		 clickByXpath("//span[@class='checkmark']");
		return this;
	 }
	 
	 public OtpVerifyPage clickOnMakePayment()  {
		 clickByXpath("//button[text()='Make Payment']");
		return new OtpVerifyPage();
	 }
 
}
