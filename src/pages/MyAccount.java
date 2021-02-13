package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.TestBase;

public class MyAccount extends TestBase {

	WebDriver driver;
	WebElement myAddressesButton;
	WebElement myPersonalInfoButton;
	WebElement myWishlistButton;
	WebElement cartButton;
	
	
	public WebElement getCartButton() {
		return driver.findElement(By.xpath("//a[@title='View my shopping cart']")); 
	}
	public WebElement getmyAddressesButton() {
		return driver.findElement(By.xpath("//a[@title='Addresses']")); 
	}
	public MyAccount(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getmyPersonalInfoButton() {
		return driver.findElement(By.xpath("//a[@title='Information']")); 
	}
	public WebElement getmyWishlistButton() {
		return driver.findElement(By.xpath("//a[@title='My wishlists']")); 
	}
	

}