package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencar.base.BaseTest;
import com.qa.opencart.Utilities.Constants;
import com.qa.opencart.Utilities.ExcelUtilities;

public class RegistrationPageTest extends BaseTest{
	
	
	
	
	@DataProvider
	public Object[][] gettestdata() {
		Object data[][]=ExcelUtilities.getTestData("registration");
		
		return data;
	}
	
	
	
	
	
	
	@Test(dataProvider ="gettestdata" )
	public void registrationTest(String firstname,String lastname, String email, String telephone, String password, String subscribe) {
		home.navigateToRegisterPage();
		register.fillRegistrationForm(firstname,lastname,email,telephone,password,subscribe);
		String Succesmessage=result.validateRegistrationSuccessMessage();
		Assert.assertEquals(Succesmessage, Constants.RegisterSuccessMessage);
		result.logout();
		String logoutmsg=logout.validateLogoutPage();
		Assert.assertEquals(logoutmsg, Constants.LogoutMessage);
	
	}
	
	
	
	
	
	
	
	
	
	

}
