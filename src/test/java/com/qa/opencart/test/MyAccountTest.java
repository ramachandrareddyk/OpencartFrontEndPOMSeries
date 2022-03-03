package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencar.base.BaseTest;
import com.qa.opencart.Utilities.Constants;

public class MyAccountTest extends BaseTest{
	
	
	
	@Test
	public void verifyPageTitleTest() {
		
		home.navigateToLoginPage();
		login.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		String title=myaccount.myAccountPageTitle();
		
		Assert.assertEquals(title, Constants.MyAccountPageTitle);
	}
	
	
	@Test
	public void verifyMyAccountPageHeader() {
		home.navigateToLoginPage();
		login.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		String MyaccountHeader=myaccount.myAccounPageHeaderIsExist();
		
		Assert.assertEquals(MyaccountHeader, Constants.MyaccountPageHeader);
	}
	
	
	@Test
	public void verifyMyordersSection() {
		home.navigateToLoginPage();
		login.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		String MyOrders=myaccount.MmyOrdersSectionIsExist();
		
		Assert.assertEquals(MyOrders, Constants.MyOrdersSection);
	}
	
	
	
	
	
	
	

}
