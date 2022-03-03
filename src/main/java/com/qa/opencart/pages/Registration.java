package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencar.base.BasePage;

public class Registration extends BasePage{
	
	
	WebDriver driver;
	
	private By FirstName=By.id("input-firstname");
	private By LastName=By.id("input-lastname");
	private By Email=By.id("input-email");
	private By Telephone=By.id("input-telephone");
	
	private By Password=By.id("input-password");
	private By ConformPassword=By.id("input-confirm");
	
	private By SubscribeYes=By.xpath("(//label[@class='radio-inline'])[position()=1]/input");
	private By SubscribeNo=By.xpath("(//label[@class='radio-inline'])[position()=2]/input");
	
	private By AgreeCheckBox=By.name("agree");
	private By Continue=By.xpath("//input[@type='submit']");
	

	
	public Registration(WebDriver driver) {
		this.driver=driver;
	}
	
	public void fillRegistrationForm(String firstname, String lastName, String email, String telephone, String password, String subscribe) {
		
		driver.findElement(FirstName).sendKeys(firstname);
		
		driver.findElement(LastName).sendKeys(lastName);
		
		driver.findElement(Email).sendKeys(email);
		
		driver.findElement(Telephone).sendKeys(telephone);
		
		driver.findElement(Password).sendKeys(password);
		
		driver.findElement(ConformPassword).sendKeys(password);
		
		
		if(subscribe.equalsIgnoreCase("Yes")) {
			driver.findElement(SubscribeYes).click();
		}else {
			driver.findElement(SubscribeNo).click();
		}
		
		driver.findElement(AgreeCheckBox).click();
		
		driver.findElement(Continue).click();
		
		
		
		
		
		
	}
	
	
	
}
