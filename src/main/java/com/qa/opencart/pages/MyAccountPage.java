package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencar.base.BasePage;

public class MyAccountPage extends BasePage{
	
	WebDriver driver;
	
	
	private By myaccountPageHeader=By.xpath("//h2[text()='My Account']");
	private By MyordersSection=By.xpath("//h2[text()='My Orders']");
	
	
	public MyAccountPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	
	
	public String myAccountPageTitle() {
		return driver.getTitle();
	}
	
	public String myAccounPageHeaderIsExist() {
		String text="";
		if(driver.findElement(myaccountPageHeader).isDisplayed()) {
			text=driver.findElement(myaccountPageHeader).getText();
		}
		return text;
	}
	
	
	public String MmyOrdersSectionIsExist() {
		String text="";
		if(driver.findElement(MyordersSection).isDisplayed()) {
			text=driver.findElement(MyordersSection).getText();
		}
		return text;
	}
	
	
	
	
	
	
	
	
	
	
	

}
