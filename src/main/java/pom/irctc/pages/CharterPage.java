package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers {
	
	public CharterPage clickOnEnquiryForm()   {
		clickByXpath("//a[text()='Enquiry Form']");
		return this;
	}
	
	public CharterPage enterName(String Name )   {
		enterByXpath("//input[@name='name']", Name);
		return this;
	}
	
	public CharterPage enterOrganization(String Org)   {
		enterByXpath("//input[@name='organization']", Org);
		return this;
	}
	
	public CharterPage enterAddress(String Add)   {
		enterByXpath("//input[@name='address']", Add);
		return this;
	}
	
	public CharterPage enterMobile(String Mobile)   {
		enterByXpath("//input[@name='mobile']", Mobile);
		return this;
	}
	
	public CharterPage enterEmail(String Email)   {
		enterByXpath("//input[@name='email']", Email);
		return this;
	}
	
	public CharterPage selectRequestFor(String Request)   {
		enterByXpath("//option[text()='Saloon Charter']", Request);
		return this;
	}
	
	public CharterPage enterOriginStation(String originStation)   {
		enterByXpath("//input[@name='originStation']", originStation);
		return this;
	}
	
	public CharterPage enterDestination(String Destination)   {
		enterByXpath("//input[@name='destnStation']", Destination);
		return this;
	}
	
	public CharterPage ClickOnCheckInDate()   {
		clickByXpath("//input[@name='checkInDate']");
		return this;
	}
	
	public CharterPage clickOnDate()   {
		clickByXpath("//span[text()='22']");
		return this;
	}
	
	public CharterPage clickOnCheckOutDate()   {
		clickByXpath("//input[@name='checkOutDate']");
		return this;
	}
	
	public CharterPage clickOnMonth()   {
		clickByXpath("//i[@class='fa fa-angle-right']");
		return this;
	}
	
	public CharterPage clickondate()   {
		clickByXpath("//span[text()='6']");
		return this;
	}
	
	public CharterPage enterPeriod(String Period)   {
		enterByXpath("//input[@name='durationPeriod']", Period);
		return this;
	}
	
	public CharterPage enterCoachDetails(String Details)   {
		enterByXpath("//input[@name='coachDetails']", Details);
		return this;
	}
	
	public CharterPage enterNoOfPass(String NoofPass)   {
		enterByXpath("//input[@name='numPassenger']", NoofPass);
		return this;
	}
	
	public CharterPage enterNoOfPass1(String NoofPass1)   {
		enterByXpath("(//input[@placeholder='Number of passengers'])[2]", NoofPass1);
		return this;
	}
	
	public CharterPage selectCharterPurpose(String purpose)   {
		enterByXpath("//textarea[@name='charterPurpose']", purpose);
		return this;
	}
	
	public CharterPage enterServices(String service)   {
		enterByXpath("//input[@name='services']", service);
		return this;
	}

    public CharterPage clickOnSubmit()    {
    	clickByXpath("//button[@type='Submit']");
		return this;
    }

    public CharterPage verifyMobileNo() {
    	clickByXpath("(//span[@class='ERR2'])[4]");
		return this;
    }
}

