package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@src='https://classic.freecrm.com/img/logo.png' and @class='img-responsive']")
	WebElement crmLogo;

	
	@FindBy(xpath="//a[contains(text(),'Pricing')]")
	WebElement pricingLink;
	
	@FindBy(xpath="//a[contains(text(),'Customers')]")
	WebElement customersLink;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;
	

	// Actions
	public boolean crmLogoVisible() {
		return crmLogo.isDisplayed();
	}

	
	public PricingPage clickPricingLink(){
		pricingLink.click();
		return new PricingPage();
	}
	
	public CustomersPage clickCustomersLink() {
		customersLink.click();
		return new CustomersPage ();
	}
	
	public HomePage login() {
		userName.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("password"));
		loginButton.click();
		return new HomePage();
		
	}

}
