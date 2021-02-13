package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.TestBase;

public class MyPersonalInfo extends TestBase{
	
	WebDriver driver;
	WebElement personalInfoButton;
	WebElement genderMcheck;
	WebElement FirstNameInputField;
	WebElement LastNameInputField;
	WebElement EmailInputField;
	WebElement Day;
	WebElement Month;
	WebElement Year;
	WebElement CurrentPass;
	WebElement NewPass;
	WebElement Confirmation;
	WebElement Newsletter;
	WebElement SpecialOffers;
	WebElement SaveButton;
	WebElement updateLabel;
	WebElement genderFcheck;
	
	public MyPersonalInfo(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement genderFcheck() {
		return driver.findElement(By.id("id_gender2"));
	}
	public WebElement getUpdateLabel() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p"));
	}
	public WebElement getpersonalInfoButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
	}
	public WebElement getgenderMcheck() {
		return driver.findElement(By.id("id_gender1"));
	}
	public WebElement getFirstNameInputField() {
		return driver.findElement(By.id("firstname"));
	}

	public WebElement getLastNameInputField() {
		return driver.findElement(By.id("lastname"));
	}
	
	public WebElement getEmailInputField() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getDay() {
		return driver.findElement(By.id("days"));
	}
	public WebElement getMonth() {
		return driver.findElement(By.id("months"));
	}
	public WebElement getYear() {
		return driver.findElement(By.id("years"));
	}
	public WebElement getCurrentPass() {
		return driver.findElement(By.id("old_passwd"));
	}
	public WebElement getNewPass() {
		return driver.findElement(By.id("passwd"));
	}
	public WebElement getConfirmation() {
		return driver.findElement(By.id("confirmation"));
	}
	public WebElement getNewsletter() {
		return driver.findElement(By.id("newsletter"));
	}
	public WebElement getSpecialOffers() {
		return driver.findElement(By.id("optin"));
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button"));
	}
	

	public void insertEmail(String email) {
		this.getEmailInputField().clear();
		this.getEmailInputField().sendKeys(email);
	}
	
	public void getPassword(String currentPass, String newPass, String confirmation) {
		this.getCurrentPass().clear();
		this.getCurrentPass().sendKeys(currentPass);
		this.getNewPass().clear();
		this.getNewPass().sendKeys(newPass);
		this.getConfirmation().clear();
		this.getConfirmation().sendKeys(confirmation);
}
	public void getFirstNameInputField(String newFirstName) {
		this.getFirstNameInputField().clear();
		this.getFirstNameInputField().sendKeys(newFirstName);
}
	public void getLastNameInputField(String newLastName) {
		this.getLastNameInputField().clear();
		this.getLastNameInputField().sendKeys(newLastName);
}
	public void getDate(String Day, String Month, String Year) {
		this.getDay().sendKeys(Day);
		this.getMonth().sendKeys(Month);
		this.getYear().sendKeys(Year);
}
	public void getnewsletter(String newsletter) {
		this.getNewsletter().click();
}
	public void getspecialOffers(String specialOffers) {
		this.getSpecialOffers().click();
		
}

}

