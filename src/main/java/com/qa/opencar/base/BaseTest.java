package com.qa.opencar.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.opencart.pages.HomePage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.Logout;
import com.qa.opencart.pages.MyAccountPage;
import com.qa.opencart.pages.Registration;
import com.qa.opencart.pages.ResultPage;

public class BaseTest {
	
	
	public BasePage base;
	public Properties prop;
	public WebDriver driver;
	public HomePage home;
	public LoginPage login;
	public MyAccountPage myaccount;
	public Registration register;
	public ResultPage result;
	public Logout logout;
	
	
	
	@BeforeMethod
	public void setup() {
		
		base =new BasePage();
		
		prop=base.init_properties();
		driver=base.intit_browser(prop.getProperty("browser"));
		home=new HomePage(driver);
		login= new LoginPage(driver);
		myaccount=new MyAccountPage(driver);
		register= new Registration(driver);
		result=new ResultPage(driver);
		logout=new Logout(driver);
		driver.get(prop.getProperty("url"));
	}
	
	
	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
	

}
