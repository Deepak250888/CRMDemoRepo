package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	public HomePage(){
	  PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//td[contains(text(),'User: Deepak Nair ')]")
	WebElement loginName;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contacts;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContact;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement deals;
	
	@FindBy(xpath="//a[contains(text(),'New Deal')]")
	WebElement newDeal;
	
	@FindBy(xpath="//a[contains(text(), 'Tasks')]")
	WebElement tasks;
	
	@FindBy(xpath="//a[contains(text(), 'New Task')]")
	WebElement newTask;
	
	
	
	//Actions
	
	public boolean loginNameVisible() {
		boolean b=loginName.isDisplayed();
		return b;
	}
	
	public DealPage clickOnNewDealLink() {
		Actions action= new Actions(driver);
		action.moveToElement(deals).build().perform();
		newDeal.click();
		return new DealPage();
	
	}
	
	public ContactPage clickOnNewContactLink() {
		Actions action= new Actions(driver);
		action.moveToElement(contacts).build().perform();
		newContact.click();
	    return new ContactPage();
	   
	}
	
	public TaskPage clickOnNewTaskLink() {
		Actions action= new Actions(driver);
		action.moveToElement(tasks).build().perform();
		newTask.click();
	    return new TaskPage();
	   
	}

}
