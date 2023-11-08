package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;
import pages.HomePage;

public class HomePageTest extends BaseClass{
	@Test(enabled = false, priority = 2)
	public void clickLoginButtonTest() throws InterruptedException {
		homePage.clickLoginButton();
		
		
	}
	@Test(enabled = false, priority = 1)
	public void clickUserIdTest() {
		homePage.clickUserId();
		
	}
	@Test(enabled = false, priority = 1)
	public void clickPassword () {
		homePage.clickPassword();
		
	}
	@Test (enabled = false) 
	public void clickNewUserRegistrationTest() {
		homePage.clickNewUserRegistration();
	}
	@Test (enabled = true)
	public void clickLogoTest() {
		homePage.clickLogo();
	}
}

