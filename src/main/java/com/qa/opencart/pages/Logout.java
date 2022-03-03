package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencar.base.BasePage;

public class Logout extends BasePage{
	
	
	WebDriver driver;
	
	private By AccountLogout=By.xpath("//h1[text()='Account Logout']");
	
	public Logout(WebDriver driver) {
		this.driver=driver;
	}
	
	public String validateLogoutPage() {
		return driver.findElement(AccountLogout).getText();
	}

}
