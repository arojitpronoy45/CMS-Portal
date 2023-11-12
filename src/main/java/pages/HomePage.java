package pages;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;
public class HomePage {
	WebDriver driver;
	

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	} 
	@FindBy (id = "cms-login-submit")
	WebElement loginButton;
	
	@FindBy (name = "user-d")
	WebElement userIdElement;
	
	@FindBy (how = How.NAME, using = "pass-d")
	WebElement password;
	
	@FindBy (className = "cms-newuser-reg")
	WebElement newUserRegistrationElement; 

	@FindBy (xpath = "//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']")
	WebElement logo;
	
	@FindBy (className = "-newuser-reg")
	WebElement wrongNewUserRegistrationElement;
	
	@FindBy(id = "cms-forgot-userid")
	WebElement forgotUserId;
	
	// third way to write WebElement
	By unlock = By.xpath("//a[text()='unlock']");
	
	
	public void clickLoginButton() throws InterruptedException {
		loginButton.click();
		Thread.sleep(5000);
	}
	public void clickUserId() {
		

	}
	public void clickPassword() {
		
	}
	public void clickNewUserRegistration() {
		newUserRegistrationElement.click();
		try {
			Thread.sleep(5000);
			
		}catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public void clickLogo() throws InterruptedException {
		logo.click();
		Thread.sleep(5000);
	}
	
	public void inputTextInUserIdField () {
		userIdElement.sendKeys("apronoy 2001");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	public void clickForgotUserId() {
		clickElement(forgotUserId);
	
		
	}
	public void inputTextInUserIdAndPasswordFieldThenClickLoginButton() throws InterruptedException {
		inputText(userIdElement, "Aropro2001");
		inputText(password, "12344");
		Thread.sleep(3000);
		clickElement(loginButton);
		Thread.sleep(3000);
		
		
	}
	
	public void clickUnlock() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(unlock).click(); 
		Thread.sleep(5000);
		}
}

