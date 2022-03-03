package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencar.base.BasePage;

public class ResultPage extends BasePage{
	
	
	
	WebDriver driver;
	
	private By SuccessMessage=By.xpath("//h1[text()='Your Account Has Been Created!']");
	private By Logout=By.xpath("(//a[text()='Logout'])[position()=2]");
	private By MyAccount= By.xpath("//span[contains(text(),'My Account')]");
	
	public ResultPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String validateRegistrationSuccessMessage() {
		
		return driver.findElement(SuccessMessage).getText();
	}
	
	
	public void logout() {
		
		driver.findElement(MyAccount).click();
		driver.findElement(Logout).click();
		
	}

}
