package common;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

public class CommonActions {
	public static void clickElement(WebElement element) {
		try {
			element.click();

		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}
	public static void inputText (WebElement element, String input) {
		try {
			element.sendKeys(input);
			
		} catch (NoSuchElementException | NullPointerException f) {
			f.printStackTrace();
		}
	}
}

// when you use parameterized method, you can use the parameters again and again 