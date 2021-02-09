package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

	WebDriver driver;
	WebElement signInButton;
	WebElement emailInputField;
	WebElement passwordInputField;
	WebElement signOutLabel;
	WebElement errorEmailLabel;
	WebElement errorPassLabel;
	WebElement errorNoCredentialsLabel;

	
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getErrorNoCredentialsLabel() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
	}
	public WebElement getSignOutLabel() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
	}
	public WebElement getErrorPassLabel() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
	}

	public WebElement getErrorEmailLabel() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
	}
	
	public WebElement getSignInButton() {
		return driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]"));
	}

	public WebElement getEmailInputField() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getPasswordInputField() {
		return driver.findElement(By.id("passwd"));
	}
	

	public void insertEmail(String email) {
		this.getEmailInputField().clear();
		this.getEmailInputField().sendKeys(email);
	}
	
	public void insertPassword(String password) {
		this.getPasswordInputField().clear();
		this.getPasswordInputField().sendKeys(password);
	}
	public void signOutLabelClick() {
		this.getSignOutLabel().click();
	}
	
	public void signInButtonClick() {
		this.getSignInButton().click();
	}
	
	public void signIn(String email, String password) {
		this.getEmailInputField().sendKeys(email);
		this.getPasswordInputField().sendKeys(password);
	
	}

}

