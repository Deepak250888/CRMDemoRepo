package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class DealPage extends TestBase {

	public DealPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='title']")
	WebElement title;

	@FindBy(xpath = "//input[@name=\"client_lookup\"]")
	WebElement company;

	@FindBy(xpath = "//input[@name='contact_lookup']")
	WebElement contact;

	@FindBy(xpath = "//form[@name='prospectForm']//td//input[@value='Save']")
	WebElement saveBtn;

	public void createNewDeal(String titleVal, String comp, String cntct) {

		title.sendKeys(titleVal);
		company.sendKeys(comp);
		contact.sendKeys(cntct);
		saveBtn.click();
	}

}
