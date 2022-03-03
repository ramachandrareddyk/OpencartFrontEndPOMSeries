package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencar.base.BaseTest;
import com.qa.opencart.Utilities.Constants;

public class HomePageTest extends BaseTest{

	
	
	@Test
	public void verifyPageTitleTest() {
		String title=home.getHmepGaeTitle();
		Assert.assertEquals(title, Constants.hompageTitle);
	}
	
	@Test
	public void verifyIsSearchBoxExistTest() {
		
		Assert.assertTrue(home.isSearchBoxExist());
		
	}
	
	
	@Test
	
	public void verifyIsSearchBtnExistTest() {
		
		Assert.assertTrue(home.IsSearchBtnExist());
	}
}
