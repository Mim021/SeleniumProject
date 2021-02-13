package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.TestBase;

public class MyWishlists extends TestBase {

	WebDriver driver;
	WebElement myWishlistsButton;
	WebElement nameInputField;
	WebElement SaveButton;
	WebElement deleteWishlistsButton;
	WebElement deleteWishlists;
	
	public MyWishlists(WebDriver driver) {
		this.driver = driver;
	}
	public List<WebElement> getWishlistDeleteButton() {
		return driver.findElements(By.className("icon-remove"));
	}
	public WebElement getRemoveIcon() {
		return driver.findElement(By.className("wishlist_delete"));
	}
	public WebElement getWishlistTable() {
		return driver.findElement(By.className("table"));
	}
	public WebElement getWishlist() {
		return driver.findElement(By.xpath("//*[@id=\"block-history\"]"));
	}
	public WebElement getmyWishlists() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a"));
	}
	public WebElement getNameInputField() {
		return driver.findElement(By.id("name"));
	}
	public WebElement getSaveButton() {
		return driver.findElement(By.id("submitWishlist"));
	}
	public void getNameInputField(String Name) {
		this.getNameInputField().clear();
		this.getNameInputField().sendKeys(Name);
	}
	public void getMultipleName1(String Name1){
		this.getNameInputField().clear();
		this.getNameInputField().sendKeys(Name1);
	}
	public void getMultipleName2(String Name2){
		this.getNameInputField().clear();
		this.getNameInputField().sendKeys(Name2);
	}
	public void getMultipleName3(String Name3){
		this.getNameInputField().clear();
		this.getNameInputField().sendKeys(Name3);
	}
	public boolean isElementPresent() {
		try {
			getWishlistTable();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
