package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class UserRegistrationPage extends GenericWrappers {

	 public UserRegistrationPage enterUserName(String name) {
			enterByXpath("//input[@id='u_id']", name);
			return this;
		}
	     public UserRegistrationPage enterPassword(String password) {
	 		enterByXpath("//input[@id='u_pwd']", password);
	 		return this;
	 	}
	     public UserRegistrationPage enterConfirmPassword(String confirmpassword) {
	  		enterByXpath("//input[@id='u_repwd']", confirmpassword);
	  		return this;
	  	}
	     public UserRegistrationPage selectSecurityQuestion(String secquestion) {
	   		selectVisibileTextByXpath("//select[@id='u_secques']", secquestion);
	   		return this;
	   	}
	     public UserRegistrationPage enterSecurityAnswer(String secanswer) {
	    	 enterByXpath("//input[@id='u_secans']", secanswer);
	        return this;
	    }
	     public UserRegistrationPage enterName(String name) {
	 		enterByXpath("//input[@id='u_name']", name);
	 		return this;
	 	} 
	     public UserRegistrationPage selectGender(String gender) {
	    		selectVisibileTextByXpath("//select[@id='u_gender']", gender);
	    	return this;
	    }
	     public UserRegistrationPage enterDateOfBirth(String dateofbirth) {
	  		enterByXpath("//input[@id='u_dob']", dateofbirth);
	  		return this;
	  	} 
	     public UserRegistrationPage enterDesignation(String designation) {
	   		enterByXpath("//input[@id='u_designation']", designation);
	   		return this;
	   	} 
	     public UserRegistrationPage enterEmail(String email) {
	    		enterByXpath("//input[@id='u_emailid']", email);
	    	return this;
	    } 
	     public UserRegistrationPage enterMobile(String mobile) {
	 		enterByXpath("//input[@id='u_mobile']", mobile);
	 		return this;
	    }
	     public UserRegistrationPage enterPhoneNumber(String phone) {
	 		enterByXpath("//input[@id='u_phone']", phone);
	 		return this;
	    }
	     public UserRegistrationPage selectNationality() {
	 		clickByXpath("//option[text()='INDIA']");
	 	return this;
	    }
	     public UserRegistrationPage enterGuestName(String name) {
	  		enterByXpath("//input[@id='name']", name);
	  		return this;
	    }
	     public UserRegistrationPage enterCapacity(String capacity) {
	   		enterByXpath("//input[@id='capacity']", capacity);
	   		return this;
	    }
	     public UserRegistrationPage enterAddress(String address) {
	    	enterByXpath("//textarea[@id='address']", address);
	    	return this;
	    }
	     public UserRegistrationPage selectState(String state) {
	 		selectVisibileTextByXpath("//select[@id='state']", state);
	 	    return this;
	    }  
	     public UserRegistrationPage selectCity(String city) {
	  		selectValueByXpath("//select[@id='city_distr']", city);
	  	    return this;
	    }
	     public UserRegistrationPage selectAccomodationType(String accomodationtype) {
	   		selectVisibileTextByXpath("//select[@id='acco_type']", accomodationtype);
	   	    return this;
	     }
	     public UserRegistrationPage selectAccomodationGrade(String accomodationgrade) {
	   		selectVisibileTextByXpath("//select[@id='star_rat']", accomodationgrade);
	   	    return this;
	     }
	     public UserRegistrationPage enterGuestEmail(String guestemail) {
	     	enterByXpath("//input[@id='email']", guestemail);
	     	return this;
	     }
	     public UserRegistrationPage enterGuestmobile(String guestmobile) {
	      	enterByXpath("//input[@id='mcontact']", guestmobile);
	      	return this;
	      } 
	     public UserRegistrationPage enterGuestPhoneNumber(String guestphone) {
	       	enterByXpath("//input[@id='contact']", guestphone);
	       	return this;
	      } 
	     public UserRegistrationPage enterPassengerName(String passengername) {
	        enterByXpath("//input[@name='name_o']", passengername);
	        return this;
	       } 
	     public UserRegistrationPage enterPassengerAddress(String passengeraddress) {
	        enterByXpath("//input[@name='address_o']", passengeraddress);
	        return this;
	       }
	     public UserRegistrationPage selectPassengerstate(String passengerstate) {
	    		selectVisibileTextByXpath("//select[@name='state_o']", passengerstate);
	    	return this;
	       }
	     public UserRegistrationPage selectPassengercity(String passengercity) {
	 		selectVisibileTextByXpath("//select[@name='citydistr_o']", passengercity);
	 	    return this;
	       }
	     public UserRegistrationPage enterPassengerEmail(String passengeremail) {
	      	enterByXpath("//input[@name='emailid_o']", passengeremail);
	      	return this;
	      }
	      public UserRegistrationPage enterPassengermobile(String passengermobile) {
	       	enterByXpath("//input[@name='mobile_o']", passengermobile);
	       	return this;
	       } 
	      public UserRegistrationPage enterPassengerPhoneNumber(String passengerphone) {
	        	enterByXpath("//input[@name='phoneno_o']", passengerphone);
	        return this;
	       } 
	      public UserRegistrationPage clickOnAdd() {
	  		clickByXpath("//input[@name='add']");
	  		return this;
	  	}
	     	
}
