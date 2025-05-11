package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.DealPage;
import com.crm.qa.pages.EventPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TaskPage;
import com.crm.qa.util.TestUtil;


public class HomePageTest extends TestBase {
	
	
	HomePage homePage;
	LoginPage loginPage;
	ContactPage contactPage;
	DealPage dealPage;
	TaskPage taskPage;
	TestUtil testUtil;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		contactPage= new ContactPage();
		dealPage= new DealPage();
		taskPage= new TaskPage();
		homePage= new HomePage();
		testUtil= new TestUtil();
		loginPage.login();
		testUtil.switchToFrame();

	}

	@Test(priority=1)
	public void loginNameVisibleTest() {
		boolean b=homePage.loginNameVisible();
		Assert.assertEquals(b, true, "Login name not visible on home page");
	}
	
	@Test(priority=2)
	public void verifyNewDealLinkTest() {
		dealPage=homePage.clickOnNewDealLink();
	}
	
	@Test(priority=3)
	public void verifyNewContactLinkTest(){
		contactPage=homePage.clickOnNewContactLink();
	}
	
	@Test(priority=4)
	public void verifyNewTaskLinkTest(){
		taskPage=homePage.clickOnNewTaskLink();
	}
	
	@AfterMethod
	public void tearDown() {
		// driver.quit();

	}
}
