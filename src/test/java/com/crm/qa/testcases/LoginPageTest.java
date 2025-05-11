package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CustomersPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.PricingPage;


public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	PricingPage pricingPage;
	CustomersPage customersPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage= new LoginPage();
		pricingPage= new PricingPage();
		customersPage= new CustomersPage();
		homePage= new HomePage();

	}

	@Test(priority = 1)
	public void crmLogoVisibleTest() {
		boolean b = loginPage.crmLogoVisible();
		Assert.assertEquals(b, true, "CRM Logo not visible");
	}

	@Test(priority = 2)
	public void clickPricingLinkTest() {
		pricingPage = loginPage.clickPricingLink();

	}
	
	@Test(priority = 3)
	public void clickCustomersLinkTest() {
		customersPage = loginPage.clickCustomersLink();

	}
	
	@Test(priority = 4)
	public void loginTest() {
		homePage = loginPage.login();

	}
	
	@AfterMethod
	public void tearDown() {
		// driver.quit();

	}

}
