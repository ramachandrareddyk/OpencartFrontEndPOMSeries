package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencar.base.BasePage;
import com.qa.opencart.Utilities.ElementUtilities;

public class LoginPage extends BasePage{
	
	WebDriver driver;
	ElementUtilities utils;
	
	private By Username= By.id("input-email");
	private By Password=By.id("input-password");
	private By login=By.xpath("//input[@value='Login']");
	private By forgetPassLink=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public String verifyLoginPageTitle() {
		
		
		String loginitle=driver.getTitle();
		
		return loginitle;
	}
	
	public boolean verifyisUsernameFieldExist() {
		return driver.findElement(Username).isDisplayed();
	}
	
	public boolean verifyisPasswordFieldExist() {
		return driver.findElement(Password).isDisplayed();
	}
	
	public boolean verifyisLoginBtnFieldExist() {
		return driver.findElement(login).isDisplayed();
		
		
	}
	
	public boolean isForgetPasswordFieldExist() {
		
		return driver.findElement(forgetPassLink).isDisplayed();
	}
	
	
	public MyAccountPage doLogin(String userName, String password) {
		
		/*
		 * driver.findElement(Username).clear();
		 * driver.findElement(Username).sendKeys(userName);
		 * driver.findElement(Password).clear();
		 * driver.findElement(Password).sendKeys(password);
		 * driver.findElement(login).click();
		 */
		utils=new ElementUtilities(driver);
		utils.doSendKeys(Username, userName);
		utils.doSendKeys(Password, password);
		utils.doClick(login);
		
		
		
		
		//page chaining concept
		
		return new MyAccountPage(driver);
	}
	

}
