package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencar.base.BasePage;

public class HomePage extends BasePage{
	
	private WebDriver driver;
	
	
	
	//1. page objects By locater
	
	private By SearchBox= By.name("search");
	private By searchBtn= By.xpath("//button[@class='btn btn-default btn-lg']");
	private By MyAccount= By.xpath("//span[contains(text(),'My Account')]");
	private By Login= By.xpath("//a[contains(text(),'Login')]");
	private By navigationBar= By.xpath("//ul[@class='nav navbar-nav']");
	
	private By Register=By.xpath("//a[text()='Register']");
	
	//2. page class constructor
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	// 3. page actions/ methods
	
	public String getHmepGaeTitle() {
		return driver.getTitle();
	}
	
	public boolean isSearchBoxExist() {
		return driver.findElement(SearchBox).isDisplayed();
	}
	
	public boolean IsSearchBtnExist() {
		return driver.findElement(searchBtn).isDisplayed();
	}
	
	public void navigateToLoginPage() {
		
		driver.findElement(MyAccount).click();
		
		driver.findElement(Login).click();
		
		
	}
	
	public void navigateToRegisterPage() {
		driver.findElement(MyAccount).click();
		
		driver.findElement(Register).click();
	}
	
	
	

}
