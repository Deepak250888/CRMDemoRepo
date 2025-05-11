package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DealPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class DealPageTest extends TestBase {

	LoginPage loginPage;
	TestUtil testUtil;
	DealPage dealPage;
	HomePage homePage;

	String sheetName = "deals";

	public DealPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();
		loginPage = new LoginPage();
		loginPage.login();
		homePage= new HomePage();
		testUtil= new TestUtil();
		testUtil.switchToFrame();
		dealPage = homePage.clickOnNewDealLink();

	}

	@DataProvider
	public Object[][] getCRMTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(priority = 1, dataProvider = "getCRMTestData")
	public void validateCreateNewDeal(String title, String company, String contact) {
		// contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
		dealPage.createNewDeal(title, company, contact);

	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();

	}

}
