package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookCoachPage extends GenericWrappers {
	
	public BookCoachPage switchToBookCoachPage() {
		switchToLastWindow();
		return this;
	}
	
	public BookCoachPage clickOnSignUp()  {
		clickByXpath("//a[text()='New User? Signup']");
		return this;
   }
	
   public BookCoachPage enterUserId(String userid)  {
	   enterByXpath("//input[@id='userId']", userid);
	return this;
   }
   
   public BookCoachPage enterpassword(String paswrd)  {
	   enterByXpath("//input[@type='password']", paswrd);
	return this;
   }
   
   public BookCoachPage enterConfirmPassword(String confpass)  {
	   enterByXpath("//input[@id='cnfPassword']", confpass);
	return this;
   }
   
   public BookCoachPage selectSeqQue(String SeqQue)  {
	   selectVisibileTextByXpath("//option[text()='What was the name of your first school?']", SeqQue);
	return this;
   }
   
   public BookCoachPage enterSeqAns(String SeqAns)  {
	   enterByXpath("//input[@id='secAnswer']", SeqAns);
	return this;
   }
   
   public BookCoachPage enterDob(String Dob)  {
	   enterByXpath("//input[@id='dateOfBirth']", Dob);
	return this;
   }
   
   public BookCoachPage clickOnDob()  {
	   clickByXpath("//a[text()='31']");
	return this;
   }
   
   public BookCoachPage clickOnGender()  {
	   clickByXpath("//input[@id='gender1']");
	return this;
   }
   
   public BookCoachPage clickOnMarried()  {
	   clickByXpath("//input[@value='Married']");
	return this;
   }
   
   public BookCoachPage enterEmail(String email)  {
	   enterByXpath("//input[@id='email']", email);
	return this;
   }
   
   public BookCoachPage selectOccupation(String occupation) {
		selectVisibileTextByXpath("//select[@id='occupation']", occupation);
		return this;
	}
	
   
   public BookCoachPage enterFirstName(String Fname)  {
	   enterByXpath("//input[@id='fname']", Fname);
	return this;
   }
   
   public BookCoachPage enterMiddleName(String Mname)  {
	   enterByXpath("//input[@id='mname']", Mname);
	return this;
   }
   
   public BookCoachPage enterLastName(String Lname)  {
	   enterByXpath("//input[@id='lname']", Lname);
	return this;
   }
   
   public BookCoachPage selectNationality(String nationality) {
		selectVisibileTextByXpath("//select[@id='natinality']", nationality);
		return this;
	}
	
   
   public BookCoachPage enterFlatNo(String No)  {
	   enterByXpath("//input[@id='flatNo']", No);
	return this;
   }
   
   public BookCoachPage enterStreet(String Street)  {
	   enterByXpath("//input[@id='street']", Street);
	return this;
   }
   
   public BookCoachPage enterArea(String Area)  {
	   enterByXpath("//input[@id='area']", Area);
	return this;
   }
   
   public BookCoachPage clickOnCountry()  {
	   clickByXpath("//select[@id='country']");
	return this;
   }
   
   public BookCoachPage selectCountry1(String Country) {
		selectVisibileTextByXpath("//select[@id='country']", Country);
		return this;
	}
	
   public BookCoachPage enterMobile(String Mobile)  {
	   enterByXpath("//input[@id='mobile']", Mobile);
	return this;
   }
   
   public BookCoachPage enterPincode(String Pincode)  {
	   enterByXpath("//input[@id='pincode']", Pincode);
	return this;
   }
   
   public BookCoachPage clickOnCity()     {
	clickByXpath("//select[@id='city']"); 
	return this;
   }
   
   public BookCoachPage selectCity(String Chennai)  {
	   selectVisibileTextByXpath("//option[text()='Chennai']", Chennai);
	return this;
   }
   
   public BookCoachPage selectState(String TAMILNADU)  {
	   selectVisibileTextByXpath("//option[text()='TAMIL NADU']", TAMILNADU);
	return this;
   }
   
   public BookCoachPage selectPostOff(String postoff)  {
      selectVisibileTextByXpath("//option[text()='Agaram S.O']", postoff);
	return this;
   }
   
   public BookCoachPage ClickOnNo()  {
	   clickByXpath("//input[@id='sameAddresses1']");
	return this;
   }
   
   public BookCoachPage enterFlatNoOff(String NoOff)  {
	   enterByXpath("//input[@id='flatNoOffice']", NoOff);
	return this;
   }
   
   public BookCoachPage enterStreetOff(String StreetOff)  {
	   enterByXpath("//input[@id='streetOffice']", StreetOff);
	return this;
   }

   public BookCoachPage enterAreaOff(String AreaOff)  {
	   enterByXpath("//input[@id='areaOffice']", AreaOff);
	return this;
   }
   
   public BookCoachPage selectCountry(String Indian)  {
	   selectVisibileTextByXpath("//option[text()='Indian']", Indian);
	return this;
   }
   
   public BookCoachPage enterMobileOff(String Mobileoff)  {
	   enterByXpath("//input[@id='mobileOffice']", Mobileoff);
	return this;
   }
   
   public BookCoachPage enterPincodeOff(String PincodeOff)  {
	   enterByXpath("//input[@id='pincodeOffice']", PincodeOff);
	return this;
   }
   
   public BookCoachPage clickOnCityOff()     {
		clickByXpath("//select[@id='cityOffice']"); 
		return this;
	   }
	   
   public BookCoachPage selectCityOff(String Guntur)  {
		   selectVisibileTextByXpath("//option[text()='Guntur']", Guntur);
		return this;
	   }
	   
   public BookCoachPage selectStateOff(String ANDHRAPRADESH)  {
		   selectVisibileTextByXpath("//option[text()='ANDHRA PRADESH']", ANDHRAPRADESH);
		return this;
	   }
	   
   public BookCoachPage selectPostOff1(String postoff)  {
	      selectVisibileTextByXpath("//option[text()='Old Guntur S.O']", postoff);
		return this;
	   }
}
