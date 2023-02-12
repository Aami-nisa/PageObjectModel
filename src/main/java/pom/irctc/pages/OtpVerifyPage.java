package pom.irctc.pages;

import wrappers.GenericWrappers;

public class OtpVerifyPage extends GenericWrappers {
    
	 public OtpVerifyPage clickOnVerify()  {
		 clickByXpath("//button[text()='Verify']");
		return this;
	 }
	 
	 public OtpVerifyPage verifytext(String Text)  {
		 verifyTextContainsByXpath("//span[text()='otp is required.']", Text);
		return this;
	 }
}
