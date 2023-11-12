package pagesTest;

import org.openqa.selenium.By;
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
	@Test (enabled = false)
	public void clickLogoTest() throws InterruptedException {
		homePage.clickLogo();
	}
	@Test (enabled = false)
	public void inputTextInUserIdFieldTest () {
		homePage.inputTextInUserIdField();
	}
	
	@Test (enabled = false)
	public void clickForgotUserIdTest() {
		homePage.clickUserId();
	}
	@Test (enabled =  false)
	public void inputTextInUserIdAndPasswordFieldThenClickLoginButton() throws InterruptedException {
		homePage.inputTextInUserIdAndPasswordFieldThenClickLoginButton();
	}
	
	@Test (enabled = false)
	public void clickUnlockTest() throws InterruptedException {
		homePage.clickUnlock();
		
	}
	
	@Test (enabled = false)
	public void use_of_xpath_as_locator_in_new_user_registration_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(), 'New')]")).click();
		Thread.sleep(4000);
	}
	
	@Test(enabled = false)
	public void use_of_xpath_as_locator_in_forgot_user_id_hyperlink () throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.linkText("User ID")).click();
		Thread.sleep(4000);
	}
	


	@Test (enabled = true)
public void use_of_partialLinkText_as_locator_in_forgot_password_hyperlink() throws InterruptedException {
		Thread.sleep(50000);
		driver.findElement(By.partialLinkText("password")).click();
		Thread.sleep(4000);
	
}
}
// NoSuchElementException:
// NullPointerException -- when there is not page factory class, there is no page element