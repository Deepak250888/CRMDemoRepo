package com.crm.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactPage contactPage;
	
	String sheetName = "contacts";
	
	public ContactPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage= new HomePage();
		contactPage= new ContactPage();
		testUtil= new TestUtil();
		loginPage.login();
		testUtil.switchToFrame();
		contactPage=homePage.clickOnNewContactLink();
	
	}
	
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1, dataProvider="getCRMTestData")
	public void validateCreateNewContact(String title, String firstName, String lastName, String company,String dept){
		//contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
		contactPage.createNewContact(title, firstName, lastName, company, dept);
		
	}
	
	@AfterMethod
	public void tearDown() {
		// driver.quit();

	}
	


}
