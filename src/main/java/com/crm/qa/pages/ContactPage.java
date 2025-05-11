package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase {
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="title")
	WebElement title;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="surname")
	WebElement surName;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(name="department")
	WebElement department;
	
	@FindBy(xpath="//form[@name='contactForm']//td//input[@value='Save']")
	WebElement saveBtn;
	
	
	public void createNewContact(String titleValue, String ftName, String ltName, String comp, String dept){
		Select select = new Select(title);
		select.selectByVisibleText(titleValue);
		
		firstName.sendKeys(ftName);
		surName.sendKeys(ltName);
		company.sendKeys(comp);
		department.sendKeys(dept);
		saveBtn.click();
		
	}
	
	
	
	

}
