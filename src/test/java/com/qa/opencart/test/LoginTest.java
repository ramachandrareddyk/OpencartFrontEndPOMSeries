package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencar.base.BaseTest;
import com.qa.opencart.Utilities.Constants;

public class LoginTest extends BaseTest{
	
	
	@Test
	public void verifyTitleTest() {
		
		home.navigateToLoginPage();
		String title=login.verifyLoginPageTitle();
		
		Assert.assertEquals(title, Constants.loginPageTitle);
	}
	
	@Test
	public void verifyUsernameAndPasswordAndLoginAreExistTest() {
		home.navigateToLoginPage();
		Assert.assertTrue(login.verifyisUsernameFieldExist());
		
		Assert.assertTrue(login.verifyisPasswordFieldExist());
		
		Assert.assertTrue(login.verifyisLoginBtnFieldExist());
		
	}
	
	@Test
	
	public void verifyForgetPasswordLinkTest() {
		home.navigateToLoginPage();
		Assert.assertTrue(login.isForgetPasswordFieldExist());
	}
	
	
	@Test
	public void loginWithValidCredentials() {
		home.navigateToLoginPage();
		login.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	

}
