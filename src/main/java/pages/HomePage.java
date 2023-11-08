package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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
	public void clickLogo() {
		logo.click();
	}
}

