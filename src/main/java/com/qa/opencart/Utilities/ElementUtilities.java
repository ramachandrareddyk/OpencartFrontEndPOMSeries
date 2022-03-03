package com.qa.opencart.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtilities {
	
	private WebDriver driver;
	
	
	
	public ElementUtilities(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public WebElement getElemt(By Locater) {
		
		WebElement ele=driver.findElement(Locater);
		
		return ele;
	}
	
	
	public void doSendKeys(By Locater, String value) {
		
		WebElement ele= getElemt(Locater);
		ele.clear();
		ele.sendKeys(value);
	}
	
	
	public void doClick(By Locater) {
		getElemt(Locater).click();
		
	}
	
	
	public String doGetText(By Locater) {
		
		return getElemt(Locater).getText();
	}
	
	public boolean doIsDisplayed(By Locater) {
		return getElemt(Locater).isDisplayed();
	}
	
	
	public boolean doIsEnable(By Locater) {
		return getElemt(Locater).isEnabled();
	}
	
	
	//Dropdown utils
	
	public void doelctByIndex(By Locater, int index) {
		Select select=new Select(getElemt(Locater));
		select.selectByIndex(index);
	}
	
	
	public void doSelectByText(By Locater, String value) {
		Select select=new Select(getElemt(Locater));
		select.selectByVisibleText(value);
		
	}
	
	public void doSelectByValue(By Locater, String value) {
		Select select=new Select(getElemt(Locater));
		select.selectByValue(value);
	}
	
	
	
	

}
