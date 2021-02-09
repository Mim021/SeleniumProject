package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	WebDriver driver;
	WebElement signInTab;
	
	
	public WebElement getSignInTab() {
		return driver.findElement(By.className("login"));
	}

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToSignInTab() {
		this.getSignInTab().click();
	}
	
}

